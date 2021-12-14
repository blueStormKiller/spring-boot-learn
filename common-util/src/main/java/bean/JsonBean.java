package bean;

import java.io.Serializable;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author 12070675
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class JsonBean implements Serializable{
    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * 成功或失败的标记
     */
    private boolean result;

    /**
     * 异常或其他主要提示信息
     */
    private String  message;

    /**
     * 其他信息
     */
    private String  more;
    /**
     * 更新时间
     */
    private String  updateTime;

    /**
     * 服务端返回给客户端的状态码，可根据具体的自定义数值
     */
    private int     status;

    /**
     * 返回给客户端的封装数据，可以是List<Map<String,Object>>，也可以是page对象
     */
    private  Object  data;

    /**
     *  语音提示
     */
    private String voiceMsg;

    public JsonBean() {
        super();
    }

    public JsonBean(boolean result) {
        super();
        this.result = result;
    }

    public JsonBean(boolean result, String message) {
        super();
        this.result = result;
        this.message = message;
    }

    public JsonBean(boolean result, String message, int status) {
        this.result = result;
        this.message = message;
        this.status = status;
    }

    public JsonBean(boolean result, String message, String more) {
        super();
        this.result = result;
        this.message = message;
        this.more = more;
    }

    public JsonBean(boolean result, String message, Object data) {
        super();
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public JsonBean(boolean result, String message, String more, String updateTime, int status) {
        super();
        this.result = result;
        this.message = message;
        this.more = more;
        this.updateTime = updateTime;
        this.status = status;
    }
    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

   

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    

    public String getVoiceMsg() {
        return voiceMsg;
    }

    public void setVoiceMsg(String voiceMsg) {
        this.voiceMsg = voiceMsg;
    }

    @Override
    public String toString() {
        String split = "\"";
        StringBuilder sbr = new StringBuilder();
        sbr.append("{\"result\":" + split + result + "\",");
        sbr.append("\"status\":" + split + status + "\",");
        sbr.append("\"message\":" + split + message + "\",");
        sbr.append("\"updateTime\":" + split + updateTime + "\",");
        sbr.append("\"voiceMsg\":" + split + voiceMsg + "\",");
        sbr.append("\"more\":" + split + more + "\"}");
        return sbr.toString();
    }

}
