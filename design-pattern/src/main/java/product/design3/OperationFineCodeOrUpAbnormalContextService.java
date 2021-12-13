package product.design3;

import product.design3.model.OutModel;
import product.design3.model.OutOperationFineCodeRequestModel;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 17:31
 * @description : 简述类的作用
 */
public interface OperationFineCodeOrUpAbnormalContextService {


    /**
     * 暴露的操作细码,异常上报接口
     *
     * @param outOperationFineCodeRequestModel
     * @return
     */
    OutModel<Boolean> scanFineCodeOrUpAbnormalExecute(OutOperationFineCodeRequestModel outOperationFineCodeRequestModel);

}
