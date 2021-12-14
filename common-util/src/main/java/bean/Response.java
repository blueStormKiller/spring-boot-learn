package bean;

import constants.LDCSConstants;

import java.io.Serializable;

/**
 * Created by hypnos.xu on 2017/3/26. RSF 返回统一响应体
 */
public class Response<E> implements Serializable {

    private static final long serialVersionUID = 3613382259638474387L;
    // 响应数据载体
    private E data;
    // 响应结果code 编码从IResultCode 取
    private String returnCode;
    // 返回消息描述
    private String returnMsg;

    public Response() {
        super();
    }

    public Response(String returnCode, String returnMsg) {
        super();
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public Response(String returnCode, String returnMsg, E data) {
        super();
        this.data = data;
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }



    @Override
    public String toString() {
        return "Response [data=" + data + ", returnCode=" + returnCode + ", returnMsg=" + returnMsg + "]";
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(LDCSConstants.STR_S, "成功", data);
    }

    public static <T> Response<T> error(String msg) {
        return new Response<>(LDCSConstants.STR_E, msg);
    }

    /**
     * 获取 响应数据载体
     *
     * @return data 响应数据载体
     */
    public E getData() {
        return this.data;
    }

    /**
     * 设置 响应数据载体
     *
     * @param data 响应数据载体
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * 获取 响应结果code 编码从IResultCode 取
     *
     * @return returnCode 响应结果code 编码从IResultCode 取
     */
    public String getReturnCode() {
        return this.returnCode;
    }

    /**
     * 设置 响应结果code 编码从IResultCode 取
     *
     * @param returnCode 响应结果code 编码从IResultCode 取
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * 获取 返回消息描述
     *
     * @return returnMsg 返回消息描述
     */
    public String getReturnMsg() {
        return this.returnMsg;
    }

    /**
     * 设置 返回消息描述
     *
     * @param returnMsg 返回消息描述
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
