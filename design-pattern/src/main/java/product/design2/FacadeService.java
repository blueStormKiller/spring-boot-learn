package product.design2;

import product.design2.dto.DubboResult;
import product.design2.dto.OperationTypeEnum;

/**
 * Dubbo服务
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
public interface FacadeService<R, S> {

    String LOG_MARK = "Dubbo服务";

    /**
     * @description 获取操作类型
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/8/16 17:10
     */
    OperationTypeEnum getOperationType();

    /**
     * @param requestParam
     * @description 服务执行
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/8/16 17:12
     */
    DubboResult<R> execute(S requestParam);

}


