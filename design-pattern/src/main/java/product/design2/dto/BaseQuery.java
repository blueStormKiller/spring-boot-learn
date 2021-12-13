package product.design2.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @description 基础查询
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @date 2021/8/5 19:48
 */
@Data
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 4700475728770681997L;

    @NotEmpty(message = "仓库编码不可为空")
    private String warehouseCode;

    public BaseQuery() {}

    public BaseQuery(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public BaseQuery setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
        return this;
    }

}


