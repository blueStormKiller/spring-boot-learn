package product.design2.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 商家出库细码查询
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/4
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Slf4j
public class InventoryFineCodeOutQuery extends BaseQuery {
    private static final long serialVersionUID = -1581025071385870440L;


    @NotEmpty(message = "商品编码不可为空")
    private String skuCode;

    @NotNull(message = "数量不可为空")
    @DecimalMin(value = "1", message = "数量错误")
    private BigDecimal quantity;
    /**
     * 缸号
     */
    private String cylinderNumber;

    /**
     * 剪版分配
     */
    private Boolean isAllocateCrop;

    /**
     * 分配库区集合
     */
    private List<String> zoneCodeList;
    /**
     * 分配库区集合 (立库)
     */
    private List<String> solidZoneCodeList;
    /**
     * 分配库区集合 (剪版)
     */
    private List<String> cropZoneCodeList;
    /**
     * 额外细码数 (非请求参数)
     */
    private BigDecimal additionalQuantity;
    /**
     * 是否推荐 (非请求参数)
     */
    private Boolean isAdditional;

    public InventoryFineCodeOutQuery(String warehouseCode) {
        super(warehouseCode);
        this.isAllocateCrop = false;
        this.isAdditional = false;
    }

    @Override
    public InventoryFineCodeOutQuery setWarehouseCode(String warehouseCode) {
        super.setWarehouseCode(warehouseCode);
        return this;
    }


    public InventoryFineCodeOutQuery setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }


    public InventoryFineCodeOutQuery setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public InventoryFineCodeOutQuery setCylinderNumber(String cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
        return this;
    }


    public InventoryFineCodeOutQuery setAllocateCrop(Boolean allocateCrop) {
        isAllocateCrop = allocateCrop;
        return this;
    }

    public InventoryFineCodeOutQuery setZoneCodeList(List<String> zoneCodeList) {
        this.zoneCodeList = zoneCodeList;
        return this;
    }


    /**
     * 待执行线程数
     */
    private Integer executeThreadCount = 0;

    /**
     * @description 线程执行完成
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/10/18 23:30
     */
    public synchronized void threadExecuteComplete() {
        if (executeThreadCount <= 0) {
            return;
        }
        executeThreadCount -= 1;
    }

    /**
     * @description 等待所有线程执行结束
     * <p> <功能详细描述> </p>
     * @author lrt
     * @date 2021/10/18 23:30
     */
    public void waiteAllThreadExecuteComplete() {
        while (executeThreadCount > 0) {
            try {
                Thread.sleep(10L);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
    }

}


