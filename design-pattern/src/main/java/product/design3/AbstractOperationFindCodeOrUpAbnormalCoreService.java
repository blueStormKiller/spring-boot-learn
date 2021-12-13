package product.design3;

import product.design3.model.OutModel;
import product.design3.model.OutOperationFineCodeRequestModel;
import product.design3.model.OutOperationNodeEnum;
import org.springframework.stereotype.Service;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 15:40
 * @description : 顶层接口实现 抽象类
 */
@Service
public abstract class AbstractOperationFindCodeOrUpAbnormalCoreService implements OperationFineCodeOrUpAbnormalCoreService {


    /**
     * 操作节点枚举类
     *
     * @return
     */
    @Override
    public OutOperationNodeEnum getOutOperationNodeEnum() {
        return null;
    }

    /**
     * 暴露的扫描细码货异常上报接口
     * 扫描细码或者异常上报的核心方法，子类不能重写 编排抽象方法
     * 1.更新出库单细码数据，
     * 2.查询更新后的细码数据判断出库单是否进入下一个状态节点
     * 3.更新出库单最新状态，
     * 4.异步记录操作日志，
     * 5.根据出库单状态变化异步创建下一个节点任务,
     * 6.根据出库单状态变化异步通知外围数据-
     *
     * @param outOperationFineCodeRequestModel
     * @return
     */
    @Override
    public final OutModel<Boolean> scanFineCodeOrUpAbnormalExecute(OutOperationFineCodeRequestModel outOperationFineCodeRequestModel) {

        return OutModel.success(Boolean.TRUE);
    }

}
