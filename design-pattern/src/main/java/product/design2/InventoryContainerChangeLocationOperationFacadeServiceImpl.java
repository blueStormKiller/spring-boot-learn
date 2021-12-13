package product.design2;

import product.design2.dto.DubboResult;
import product.design2.dto.InventoryContainerChangeLocationCommand;
import product.design2.dto.OperationTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Dubbo服务: 容器储位变更
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
@Service
@Slf4j
public class InventoryContainerChangeLocationOperationFacadeServiceImpl extends AbstractOperationFacadeService<
        String, List<InventoryContainerChangeLocationCommand>> {

    @Override
    public OperationTypeEnum getOperationType() {
        return OperationTypeEnum.CONTAINER_CHANGE_LOCATION;
    }

    @Override
    protected Class<String> getResultClass() {
        return String.class;
    }

    @Override
    protected boolean isIdempotent(List<InventoryContainerChangeLocationCommand> requestParam) {
        if (CollectionUtils.isEmpty(requestParam) || null == requestParam.get(0)) {
            return true;
        }
        return requestParam.get(0).isIdempotent();
    }

    @Override
    protected String getIdempotentVersion(List<InventoryContainerChangeLocationCommand> requestParam) {
        if (CollectionUtils.isEmpty(requestParam)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // todo
        return sb.toString();
    }

    @Override
    protected DubboResult<String> executeImpl(List<InventoryContainerChangeLocationCommand> commandList) {

        // todo
        return DubboResult.success();
    }

}


