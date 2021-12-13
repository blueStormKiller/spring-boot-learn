package product.design2.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * 容器储位变更
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/6/9
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class InventoryContainerChangeLocationCommand extends BaseCommand {
    private static final long serialVersionUID = -7786258496718946018L;

    /**
     * 容器编码
     */
    @NotEmpty(message = "容器编码不可为空")
    private String containerCode;
    /**
     * 目标储位编码
     */
    @NotEmpty(message = "目标储位编码不可为空")
    private String targetLocationCode;
    /**
     * 不检查来源任务
     */
    private Boolean dontCheckOccupyTask;

    public InventoryContainerChangeLocationCommand(String warehouseCode, String operationBy) {
        super(warehouseCode, operationBy);
    }

    @Override
    public InventoryContainerChangeLocationCommand setWarehouseCode(String warehouseCode) {
        super.setWarehouseCode(warehouseCode);
        return this;
    }

    @Override
    public InventoryContainerChangeLocationCommand setOperationBy(String operationBy) {
        super.setOperationBy(operationBy);
        return this;
    }

    @Override
    public InventoryContainerChangeLocationCommand setSourceTaskCode(String sourceTaskCode) {
        super.setSourceTaskCode(sourceTaskCode);
        return this;
    }

    public InventoryContainerChangeLocationCommand setContainerCode(String containerCode) {
        this.containerCode = containerCode;
        return this;
    }

    public InventoryContainerChangeLocationCommand setTargetLocationCode(String targetLocationCode) {
        this.targetLocationCode = targetLocationCode;
        return this;
    }

    public InventoryContainerChangeLocationCommand setDontCheckOccupyTask(Boolean dontCheckOccupyTask) {
        this.dontCheckOccupyTask = dontCheckOccupyTask;
        return this;
    }

}


