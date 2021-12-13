package product.design2;

import product.design2.dto.DubboResult;
import product.design2.dto.InventoryFineCodeFacadeDTO;
import product.design2.dto.InventoryFineCodeOutQuery;
import product.design2.dto.OperationTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Dubbo服务: 细码库存分配
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
@Service
@Slf4j
public class InventoryFineCodeAllocateFacadeServiceImpl extends AbstractFacadeService<
        List<InventoryFineCodeFacadeDTO>, InventoryFineCodeOutQuery> {


    @Override
    public OperationTypeEnum getOperationType() {
        return OperationTypeEnum.FINE_CODE_ALLOCATE;
    }

    @Override
    protected DubboResult<List<InventoryFineCodeFacadeDTO>> executeImpl(InventoryFineCodeOutQuery query) {

        // todo 业务逻辑处理
        return DubboResult.success(null);
    }

}


