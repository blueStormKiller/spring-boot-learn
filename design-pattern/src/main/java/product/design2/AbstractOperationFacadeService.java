package product.design2;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import product.design2.dto.DubboResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Dubbo操作服务抽象
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
@Slf4j
public abstract class AbstractOperationFacadeService<R, P> extends AbstractFacadeService<R, P> {


    @Override
    public DubboResult<R> execute(P requestParam) {
        String requestJson = JSONObject.toJSONString(requestParam, SerializerFeature.WriteMapNullValue);
        String optCode = this.getOptCode(requestJson, requestParam);
        boolean idempotent = this.isIdempotent(requestParam);
        log.info("[{}] 操作请求【开始】, operationType={}, optCode={}, idempotent={}, requestParam={}"
                , LOG_MARK, this.getOperationType().getDesc(), optCode, idempotent, requestJson);
        long beginTime = System.currentTimeMillis();
        DubboResult<R> result;
        try {
            // 操作幂等检查
            if (idempotent) {
                result = this.checkIdempotent(optCode);
                if (result.isSuccessful()) {
                    log.info("[{}] 操作请求【幂等】, operationType={}, optCode={}, idempotent={}" +
                                    ", requestParam={}, result={}, 耗时[{}]ms"
                            , LOG_MARK, this.getOperationType().getDesc(), optCode, idempotent, requestJson
                            , JSONObject.toJSONString(result, SerializerFeature.WriteMapNullValue)
                            , System.currentTimeMillis() - beginTime);
                    return result;
                }
            }

            result = this.executeImpl(requestParam);
            log.info("[{}] 操作请求【结束】, operationType={}, optCode={}, idempotent={}" +
                            ", requestParam={}, result={}, 耗时[{}]ms"
                    , LOG_MARK, this.getOperationType().getDesc(), optCode, idempotent, requestJson
                    , JSONObject.toJSONString(result, SerializerFeature.WriteMapNullValue)
                    , System.currentTimeMillis() - beginTime);
        } catch (Exception e) {
            log.error("[{}] 操作请求【异常】, operationType={}, optCode={}, idempotent={}" +
                            ", requestParam={}, exception={}, 耗时[{}]ms"
                    , LOG_MARK, this.getOperationType().getDesc(), optCode, idempotent, requestJson
                    , e.getMessage(), System.currentTimeMillis() - beginTime, e);
            result = DubboResult.fail(e.getMessage());
        }
        // 记录操作信息
        if (idempotent) {
            try {
                this.recordOperationResult(optCode, requestJson, result);
            } catch (Exception e) {
                log.error("[{}] 操作记录【异常】, operationType={}, optCode={}, idempotent={}" +
                                ", requestParam={}, exception={}"
                        , LOG_MARK, this.getOperationType().getDesc(), optCode, idempotent
                        , requestJson, e.getMessage(), e);
            }
        }
        return result;
    }

    /**
     * @description 获取操作结果类型
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/11/25 15:51
     */
    protected abstract Class<R> getResultClass();

    /**
     * @description 是否幂等检查
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/11/25 17:41
     */
    protected abstract boolean isIdempotent(P requestParam);

    /**
     * @description 获取幂等版本号
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/12/1 11:20
     */
    protected abstract String getIdempotentVersion(P requestParam);

    /**
     * @description 获取操作码
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/11/25 15:51
     */
    private String getOptCode(String requestJson, P requestParam) {
        return "";

    }

    /**
     * @description 操作幂等检查
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/11/25 15:45
     */
    private DubboResult<R> checkIdempotent(String optCode) {
        return DubboResult.success(JSONObject.parseObject(null, this.getResultClass()));
    }

    /**
     * @description 记录操作结果
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/11/25 16:00
     */
    private void recordOperationResult(String optCode, String requestJson, DubboResult<R> result) {

        // todo
    }

}


