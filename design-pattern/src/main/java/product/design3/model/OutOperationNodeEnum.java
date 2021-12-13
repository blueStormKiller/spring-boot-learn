package product.design3.model;

/**
 * 出库-操作节点
 * @author yuyunbo
 */
public enum OutOperationNodeEnum {
    RECEIVE("receive", "订单接单成功"),
    CANCEL("cancel", "取消订单"),
    WAKE_UP("wake_up", "商家将待通知订单唤醒"),
    CARRIER("carrier", "获取承运商"),
    WAYBILL("waybill", "获取运单号"),
    WARE("ware", "波次"),
    PICK("pick", "拣选"),
    BATCH_COLLECT("batch_collect", "批次集货"),
    SORTING("sorting", "分拣"),
    COLLECT("collect", "集货"),
    CHECK("check", "复核"),
    QUALITY("quality", "质检"),
    BACK_PICK("back_pick", "拣货返库"),
    TRUCK("truck", "装车"),
    TRUCK_CANCEL("truck_cancel", "取消装车"),
    AWAIT_INFORM_UP("await_inform_up", "待通知入立库"),
    AWAIT_INFORM_DOWN("await_inform_down", "待通知入出立库");

    private String code;
    private String value;

    OutOperationNodeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static String getValueByCode(String code) {
        for (OutOperationNodeEnum value : OutOperationNodeEnum.values()) {
            if (value.getCode().equals(code)) {
                return value.getValue();
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
