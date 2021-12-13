package product.design2.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 细码库存
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/6/9
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class InventoryFineCodeFacadeDTO extends BaseFacadeDTO {
    private static final long serialVersionUID = 7697485517077161590L;

    /** 仓库编码 */
    private String warehouseCode;
    /** 容器编码 */
    private String containerCode;
    /** 商家编码 */
    private String merchantCode;
    /** SPU编码 */
    private String spuCode;
    /** SKU编码 */
    private String skuCode;
    /** 细码编码 */
    private String fineCode;
    /** 品名，定位SPU */
    private String spuName;
    /** 货号 */
    private String articleNumber;
    /** 颜色，颜色定位SKU */
    private String color;
    /** 色号 */
    private String colorNumber;
    /** 缸号，缸号+坯号定位细码 */
    private String cylinderNumber;
    /** 坯号，缸号+坯号定位细码 */
    private String billetNumber;
    /** 数量 */
    private BigDecimal quantity;
    /** 占用数量 */
    private BigDecimal occupyQuantity;
    /** 初始数量 */
    private BigDecimal initQuantity;
    /** 单位/规格，0：米，1：公斤，2：码 */
    private Integer unit;
    /** 状态，0：可用，1：占用，2：冻结，默认：0 */
    private Integer status;
    /** 占用任务号 */
    private String occupyTaskCode;
    /** 占用任务号, 列表 */
    private String occupyTaskCodeList;
    /** 占用任务类型 */
    private Integer occupyTaskType;
    /** 备注 */
    private String remark;
    /** 入托序号 */
    private Integer sequence;
    /** 入库时间 */
    private Date inboundTime;
    /** 批次号\nBNyyMMddHHmmss */
    private String batchNumber;
    /** 是否出库，默认：0\n0：否\n1：是 */
    private Boolean isOut;
    /** 出库时间 */
    private Date outTime;
    /** 异常状态，默认：0\n0：良品（可售）\n1：瑕疵品（可售）\n2：不良品（不可售） */
    private Integer exceptionStatus;
    /** 异常时间 */
    private Date exceptionTime;
    /** 是否退运，默认：0\n0：否\n1：是 */
    private Boolean isReturn;
    /** 退运时间 */
    private Date returnTime;
    /** 是否丢失，默认：0\n0：否\n1：是 */
    private Boolean isLoss;
    /** 丢失时间 */
    private Date lossTime;

    /** 库房编码 */
    private String storehouseCode;
    /** 库区编码 */
    private String zoneCode;
    /** 储位编码 */
    private String locationCode;
    /** 单位名称 */
    private String unitName;

    /** 默认选中 */
    private Boolean selected;

    public InventoryFineCodeFacadeDTO() {
        this.selected = false;
    }

}


