package product.design3;

import product.design3.model.OutOperationNodeEnum;
import org.springframework.stereotype.Service;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 20:20
 * @description : 批次集货 作业节点 主单状态维护
 */
@Service
public class BatchCollectOperationFineCodeOrUpAbnormalCoreServiceImpl extends AbstractOperationFindCodeOrUpAbnormalCoreService {

    /**
     * 操作节点枚举类
     *
     * @return
     */
    @Override
    public OutOperationNodeEnum getOutOperationNodeEnum() {
        return OutOperationNodeEnum.BATCH_COLLECT;
    }


}
