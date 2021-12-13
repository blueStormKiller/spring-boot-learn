package product.design2;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import product.design2.dto.DubboResult;

/**
 * Dubbo服务抽象
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
@Slf4j
public abstract class AbstractFacadeService<R, P> implements FacadeService<R, P> {

    @Override
    public DubboResult<R> execute(P requestParam) {
        String requestJson = JSONObject.toJSONString(requestParam, SerializerFeature.WriteMapNullValue);
        log.debug("[{}] 查询请求【开始】, operationType={}, requestParam={}"
                , LOG_MARK, this.getOperationType().getDesc(), requestJson);
        long beginTime = System.currentTimeMillis();
        try {
            DubboResult<R> result = this.executeImpl(requestParam);
            log.info("[{}] 查询请求【结束】, operationType={}, requestParam={}, result={}, 耗时[{}]ms"
                    , LOG_MARK, this.getOperationType().getDesc(), requestJson
                    , (null != result ? result.isSuccessful() : null)
                    , System.currentTimeMillis() - beginTime);
            return result;
        } catch (Exception e) {
            log.error("[{}] 查询请求【异常】, operationType={}, requestParam={}, exception={}, 耗时[{}]ms"
                    , LOG_MARK, this.getOperationType().getDesc(), requestJson, e.getMessage()
                    , System.currentTimeMillis() - beginTime, e);
            return DubboResult.fail(e.getMessage());
        }
    }

    /**
     * @description 执行实现
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/8/16 18:03
     */
    protected abstract DubboResult<R> executeImpl(P requestParam);

}


