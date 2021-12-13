package product.design2.dto;

import java.io.Serializable;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName DubboResult.java
 * @Description TODO
 * @createTime 2021年12月13日 15:50:00
 */

public class DubboResult<T> implements Serializable {
    private static final long serialVersionUID = 1999962398978738525L;
    public static final String SUCCESS_CODE = "200";
    public static final String ERROR_CODE = "9999";
    private static final String ERROR_MESSAGE = "操作失败";
    private static final String SUCCESS_MESSAGE = "操作成功";
    private boolean successful;
    private String code;
    private String message = "操作成功";
    private T data;

    private DubboResult(boolean successful, String code) {
        this.successful = successful;
        this.code = code;
    }

    private DubboResult(boolean successful, String code, String message, T data) {
        this.successful = successful;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> DubboResult<T> success() {
        return new DubboResult(true, "200");
    }

    public static <T> DubboResult<T> success(T data) {
        return new DubboResult(true, "200", "操作成功", data);
    }

    public static <T> DubboResult<T> success(String code, T data) {
        return new DubboResult(true, code, "操作成功", data);
    }

    public static <T> DubboResult<T> successAttachMsg(T data, String msg) {
        return new DubboResult(true, "200", msg, data);
    }

    public static <T> DubboResult<T> fail(String message) {
        return new DubboResult(false, "9999", message, (Object) null);
    }

    public static <T> DubboResult<T> fail() {
        return new DubboResult(false, "9999", "操作失败", (Object) null);
    }

    public static <T> DubboResult<T> fail(String errorCode, String message) {
        if (null == errorCode || "".equals(errorCode)) {
            errorCode = "9999";
        }

        return new DubboResult(false, errorCode, message, (Object) null);
    }

    public static <T> DubboResult<T> fail(String errorCode, String message, T data) {
        if (null == errorCode || "".equals(errorCode)) {
            errorCode = "9999";
        }

        return new DubboResult(false, errorCode, message, data);
    }


    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public boolean isSuccessful() {
        return this.successful;
    }
}
