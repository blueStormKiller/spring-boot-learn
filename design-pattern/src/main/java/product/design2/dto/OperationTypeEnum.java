package product.design2.dto;

/**
 * 操作类型
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/3
 */
public enum OperationTypeEnum {
//    LOCATION(1000, "储位库存")
//    , CONTAINER(2000, "容器库存")
//    , FINE_CODE(3000, "细码库存")
//    , FLOW(4000, "库存流水")
//    , SNAPSHOT(5000, "库存快照")
//    , OPERATION(6000, "库存操作")

    LOCATION_SAVE(1010, "新增储位")
    , LOCATION_QUERY_BY_CODE(1020, "编码查询储位库存信息")
    , LOCATION_GET_RECOMMEND(1030, "获取推荐储位")
    , LOCATION_RECOMMEND_ROADWAY(1031, "获取推荐巷道")
    , LOCATION_PREEMPT_ADD(1040, "容器预占储位")
    , LOCATION_PREEMPT_SUB(1050, "储位预占扣减")
    , LOCATION_ENABLED(1060, "启用储位库存")
    , LOCATION_DISABLED(1070, "停用储位库存")

    , CONTAINER_SAVE(2000, "新增容器")
    , CONTAINER_QUERY_BY_CODE(2010, "编码查询容器库存信息")
    , CONTAINER_QUERY_BY_CODE_LIST(2011, "编码集合查询容器库存信息")
    , CONTAINER_QUERY_BY_LOCATION(2020, "查询储位容器库存信息集合")
    , CONTAINER_QUERY_BY_PAGE(2030, "容器分页查询")
    , CONTAINER_QUERY_EMPTY_BY_PAGE(2040, "空容器查询")
    , CONTAINER_QUERY_BY_INVENTORY_RANGE(2050, "盘点范围查询")
    , CONTAINER_GET_RECOMMEND(2051, "获取推荐上架容器")
    , CONTAINER_GET_RECOMMEND_BATCH(2052, "获取推荐上架容器（批量）")
    , CONTAINER_PUT_ON_COMPLETE(2060, "容器立库存储区完成")
    , CONTAINER_PUT_FLAT_COMPLETE(2065, "容器平库存储区完成")
    , CONTAINER_OCCUPY(2070, "占用容器")
    , CONTAINER_OCCUPY_BATCH(2080, "批量占用容器")
    , CONTAINER_RELEASE(2090, "释放容器")
    , CONTAINER_RELEASE_BATCH(2100, "批量释放容器")
    , CONTAINER_OCCUPY_PICK(2110, "占用拣货容器")
    , CONTAINER_VALIDATE_EMPTY(2120, "是否空容器检查")
    , CONTAINER_OCCUPY_EMPTY(2130, "占用空容器")
    , CONTAINER_GET_OCCUPY_TASK_INFO(2140, "获取占用容器任务信息")
    , CONTAINER_CHANGE_LOCATION(2150, "容器储位变更")
    , CONTAINER_FINE_CODE_PREEMPT(2160, "细码预占容器")
    , CONTAINER_CHANGE_OCCUPY_TASK(2170, "容器占用任务变更")
    , CONTAINER_CHANGE_OCCUPY_TASK_BATCH(2180, "批量变更占用任务")
    , CONTAINER_ENABLED(2190, "启用容器库存")
    , CONTAINER_DISABLED(2200, "停用容器库存")

    , FINE_CODE_SAVE(3000, "新增细码")
    , FINE_CODE_QUERY_BY_CODE(3010, "编码查询细码库存信息")
    , FINE_CODE_QUERY_BY_CODE_LIST(3011, "编码查询细码库存信息集合")
    , FINE_CODE_QUERY_BY_CONTAINER(3020, "查询容器细码库存信息集合")
    , FINE_CODE_QUERY_BY_PAGE(3030, "细码分页查询")
    , FINE_CODE_QUERY_SKU_BY_PAGE(3031, "SKU细码分页查询")
    , FINE_CODE_ALLOCATE(3040, "细码库存分配")
    , FINE_CODE_PUT_ON_COMPLETE(3050, "细码上架完成")
    , FINE_CODE_CHANGE_CONTAINER(3060, "细码容器变更")
    , FINE_CODE_OCCUPY(3070, "占用细码")
    , FINE_CODE_OCCUPY_BATCH(3080, "批量占用细码")
    , FINE_CODE_RELEASE(3090, "释放细码")
    , FINE_CODE_RELEASE_BATCH(3100, "批量释放细码")
    , FINE_CODE_SPLIT_SHEARS(3110, "剪版细码拆分")
    , FINE_CODE_MARK_OUT(3120, "标记出库")
    , FINE_CODE_MARK_EXCEPTION(3130, "标记异常品")
    , FINE_CODE_MARK_RETURN(3140, "标记退运")
    , FINE_CODE_MODIFY(3150, "细码库存调整")
    , FINE_CODE_CHANGE_OCCUPY_TASK(3160, "细码占用任务变更")
    , FINE_CODE_CHANGE_OCCUPY_TASK_BATCH(3170, "批量变更细码占用任务")
    , FINE_CODE_INVENTORY_LOSE_REMOVE(3180, "盘亏细码移除")
    , FINE_CODE_MARK_LOSS(3190, "细码标记丢失")

    , FLOW_(4010, "库存流水")

    , SNAPSHOT_APPLY(5010, "库存快照申请")

    , OPERATION_LOAD_COMPLETE(6010, "装车完成")
    , OPERATION_PICK_COMPLETE(6020, "拣货完成")
    , OPERATION_PREEMPT_SOLID_LOCATION(6030, "预占立库储位")
    , OPERATION_OCCUPY_QUALITY_CONTAINER(6040, "质检占用收货容器, 同时占用容器内细码")
    , OPERATION_CROP_PUT_ON_COMPLETE(6050, "剪版上架完成")
    , OPERATION_MARK_EXCEPTION(6060, "标记异常状态, 自动释放细码")
    , OPERATION_CONTAINER_OCCUPY_AND_CHANGE_LOCATION(6070, "占用容器并变更储位")
    , OPERATION(6080, "操作容器、细码 (占用、释放、任务变更)")

    , REPORT_QUERY_ZONE_CODE(7010, "分页查询储位看板信息")
    , REPORT_QUERY_LOCATION_CODE(7020, "查询指定储位看板")
    , REPORT_QUERY_TEMPORARY_BOARD(7030, "分页查询暂存区看板")
    ;

    private final int value;
    private final String desc;

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    OperationTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static OperationTypeEnum get(int value) {
        for (OperationTypeEnum e : values()) {
            if (e.getValue() == value) {
                return e;
            }
        }
        return null;
    }

}


