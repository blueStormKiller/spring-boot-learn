package product.design3.model;

import lombok.Data;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/7/31 16:06
 * @description : 简述类的作用
 */
@Data
public class OutModel<T> {

    /**
     * 获取枚举编码
     */
    private String code;

    /**
     * 获取编码对应的描述
     */
    private String msg;

    /**
     * 返回的实体
     */
    private T data;

    private boolean successful;

    public OutModel(boolean successful, String code, String msg, T data) {
        this.successful = successful;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static OutModel success() {
        return success(null, "执行成功");
    }

    public static OutModel success(Object data) {
        return new OutModel(true, "200", "", data);
    }

    public static OutModel success(Object data, String msg) {
        return new OutModel(true, "200", msg, data);
    }

    public static OutModel fail(String code, String msg) {
        return new OutModel(false, code, msg, null);
    }

    public static OutModel fail(String msg) {
        return new OutModel(false, "999", msg, null);
    }

}
