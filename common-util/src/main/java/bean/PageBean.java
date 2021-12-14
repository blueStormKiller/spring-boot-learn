package bean;

import java.io.Serializable;
import java.util.List;


/**
 * PageBean
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author 12070675
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 * @param <T> 范型类
 */
public class PageBean<T>  implements Serializable{
    
    /**
     */
    private static final long serialVersionUID = 1L;
    

    private static final int NUM_INT_10 = 10;

    /**
     * 数据实体
     */
    private List<T> datas = null;

    /**
     * 当前页
     */
    private int currentPage = 1;

    /**
     * 每页显示条数
     */
    private int pageSize = NUM_INT_10;

    /**
     * 总记录数
     */
    private int totalCount = 0;

    /**
     * 总页数
     */
    private int totalPages = 0;

    
    
    
    public PageBean() {
        super();
    }

    public PageBean(List<T> datas, int currentPage, int pageSize, int totalCount, int totalPages) {
        super();
        this.datas = datas;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPages = totalPages;
    }

    /**
     * @return the totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages the totalPages to set
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return the datas
     */
    public List<T> getDatas() {
        return datas;
    }

    /**
     * @param datas the datas to set
     */
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    /**
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount the totalCount to set
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


}

