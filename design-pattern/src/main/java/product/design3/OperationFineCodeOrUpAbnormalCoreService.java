package product.design3;

import product.design3.model.OutModel;
import product.design3.model.OutOperationFineCodeRequestModel;
import product.design3.model.OutOperationNodeEnum;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 15:37
 * @description : 简述类的作用 23
 */
public interface OperationFineCodeOrUpAbnormalCoreService {

    /**
     * 操作节点枚举类
     *
     * @return
     */
    OutOperationNodeEnum getOutOperationNodeEnum();


    /**
     * 暴露的操作细码,异常上报接口
     *
     * @param outOperationFineCodeRequestModel
     * @return
     */
    OutModel<Boolean> scanFineCodeOrUpAbnormalExecute(OutOperationFineCodeRequestModel outOperationFineCodeRequestModel);

}
