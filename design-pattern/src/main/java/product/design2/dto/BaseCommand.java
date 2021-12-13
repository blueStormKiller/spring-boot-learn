package product.design2.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author lrt
 * @description 基础操作
 * <p> <功能详细描述> </p>
 * @date 2021/8/5 19:48
 */
@Data
public class BaseCommand implements Serializable {
    private static final long serialVersionUID = 5490538375356624116L;

    /**
     * 仓库编码
     */
    @NotEmpty(message = "仓库编码不可为空")
    private String warehouseCode;
    /**
     * 操作人
     */
    @NotEmpty(message = "操作人不可为空")
    private String operationBy;
    /**
     * 来源任务编码
     */
    private String sourceTaskCode;
    /**
     * 幂等检查, 默认: 是
     */
    private boolean idempotent;

    public BaseCommand() {
        this.idempotent = true;
    }

    public BaseCommand(String warehouseCode, String operationBy) {
        this();
        this.warehouseCode = warehouseCode;
        this.operationBy = operationBy;
    }

    public BaseCommand setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
        return this;
    }

    public BaseCommand setOperationBy(String operationBy) {
        this.operationBy = operationBy;
        return this;
    }

    public BaseCommand setSourceTaskCode(String sourceTaskCode) {
        this.sourceTaskCode = sourceTaskCode;
        return this;
    }

}


