package bean;

import java.io.Serializable;
import java.util.List;

/**
 * 此类仅提供layui 分页使用
 * 17031280 (朱剑)
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LayuiPageJsonReturnBean<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**当前页*/
    private int pageIndex = 1;

	/**
	 * 每页显示多少条
	 */
	private int pageSize = 10;

    /**数据状态的字段名称，默认：code*/
	private String code = "200";

	/**
	 * 状态信息的字段名称
	 */
	private String msg;

	/**
	 * 数据分总数
	 */
	private int totalCount ;

	/**
	 * 数据列表
	 */
	private List<T> datas;

	public LayuiPageJsonReturnBean(List<T> datas, int totalCount, String code, String msg){
		super();
		this.datas = datas;
		this.totalCount = totalCount;
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
