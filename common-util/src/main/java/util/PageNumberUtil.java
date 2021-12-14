/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: ArraySortUtil.java
 * Author:  15050768/纪重天
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package util;

import constants.LDCSConstants;
import org.apache.commons.collections.MapUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 分页相关信息和方法<br>
 * 〈功能详细描述〉
 *
 * @author 13073364
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public final class PageNumberUtil {

    /**
     * request pageSize参数
     */
    public static final String STR_PAGE = "page";
    /**
     * request pageSize参数
     */
    public static final String STR_PAGESIZE = "pageSize";

    /**
     * request currentPage参数
     */
    public static final String STR_CURRENT_PAGE = "currentPage";
    /**
     * 默认的分页大小
     */
    public static final int PAGE_SIZE = LDCSConstants.NUM_30;
    /**
     * 默认起止页大小
     */
    public static final int CURRENT_PAGE = LDCSConstants.NUM_1;

    private PageNumberUtil() {
        throw new IllegalAccessError("Utility class");
    }

    /**
     * 从HashMap里获取pageSize
     *
     * @param
     * @return
     */
    public static int getPageSizeFromParams(Map<String, Object> params) {

        Object strPageSize = MapUtils.getString(params, STR_PAGESIZE);
        if (null == strPageSize) {
            return PAGE_SIZE;
        }
        int pageSizeReturn;
        try {
            pageSizeReturn = Integer.parseInt(String.valueOf(strPageSize));
        } catch (NumberFormatException e) {
            pageSizeReturn = PAGE_SIZE;
        }
        return pageSizeReturn;
    }

    /**
     * 从request里获取pageSize
     *
     * @param request
     * @return
     */
    public static int getPageSizeFromRequest(HttpServletRequest request) {

        Object strPageSize = request.getParameter(STR_PAGESIZE);
        if (null == strPageSize) {
            return PAGE_SIZE;
        }
        int pageSizeReturn;
        try {
            pageSizeReturn = Integer.parseInt(String.valueOf(strPageSize));
        } catch (NumberFormatException e) {
            pageSizeReturn = PAGE_SIZE;
        }
        return pageSizeReturn;
    }

    /**
     * 从HashMap里获取currentPage
     *
     * @param
     * @return
     */
    public static int getCurrentPageFromParams(Map<String, Object> params) {

        Object strCurrentPage = MapUtils.getString(params, STR_CURRENT_PAGE);
        if (null == strCurrentPage) {
            return CURRENT_PAGE;
        }
        int currentPageReturn;
        try {
            currentPageReturn = Integer.parseInt(String.valueOf(strCurrentPage));
        } catch (NumberFormatException e) {
            currentPageReturn = CURRENT_PAGE;
        }
        return currentPageReturn;
    }

    /**
     * 从request里获取currentPage
     *
     * @param request
     * @return
     */
    public static int getCurrentPageFromRequest(HttpServletRequest request) {

        Object strCurrentPage = request.getParameter(STR_CURRENT_PAGE);
        if (null == strCurrentPage) {
            return CURRENT_PAGE;
        }
        int currentPageReturn;
        try {
            currentPageReturn = Integer.parseInt(String.valueOf(strCurrentPage));
        } catch (NumberFormatException e) {
            currentPageReturn = CURRENT_PAGE;
        }
        return currentPageReturn;
    }

    /**
     * 从HashMap里获取pageSize
     *
     * @param
     * @return
     */
    public static int getPageSizeFromParams(Map<String, Object> params, String pageSizeName) {

        Object strPageSize = MapUtils.getString(params, pageSizeName);
        if (null == strPageSize) {
            return PAGE_SIZE;
        }
        int pageSizeReturn;
        try {
            pageSizeReturn = Integer.parseInt(String.valueOf(strPageSize));
        } catch (NumberFormatException e) {
            pageSizeReturn = PAGE_SIZE;
        }
        return pageSizeReturn;
    }

    /**
     * 从request里获取pageSize
     *
     * @param request
     * @return
     */
    public static int getPageSizeFromRequest(HttpServletRequest request, String pageSizeName) {

        Object strPageSize = request.getParameter(pageSizeName);
        if (null == strPageSize) {
            return PAGE_SIZE;
        }
        int pageSizeReturn;
        try {
            pageSizeReturn = Integer.parseInt(String.valueOf(strPageSize));
        } catch (NumberFormatException e) {
            pageSizeReturn = PAGE_SIZE;
        }
        return pageSizeReturn;
    }

    /**
     * 从HashMap里获取currentPage
     *
     * @param
     * @return
     */
    public static int getCurrentPageFromParams(Map<String, Object> params, String currentPageName) {

        Object strCurrentPage = MapUtils.getString(params, currentPageName);
        if (null == strCurrentPage) {
            return CURRENT_PAGE;
        }
        int currentPageReturn;
        try {
            currentPageReturn = Integer.parseInt(String.valueOf(strCurrentPage));
        } catch (NumberFormatException e) {
            currentPageReturn = CURRENT_PAGE;
        }
        return currentPageReturn;
    }

    /**
     * 从request里获取currentPage
     *
     * @param request
     * @return
     */
    public static int getCurrentPageFromRequest(HttpServletRequest request, String currentPageName) {

        Object strCurrentPage = request.getParameter(currentPageName);
        if (null == strCurrentPage) {
            return CURRENT_PAGE;
        }
        int currentPageReturn;
        try {
            currentPageReturn = Integer.parseInt(String.valueOf(strCurrentPage));
        } catch (NumberFormatException e) {
            currentPageReturn = CURRENT_PAGE;
        }
        return currentPageReturn;
    }

}
