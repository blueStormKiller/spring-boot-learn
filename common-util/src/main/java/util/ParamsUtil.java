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

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * 
 * @author 15050768
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ParamsUtil {
    private ParamsUtil(){
        throw new IllegalAccessError("Utility class");
    }

    public static int[] handServletPager(Map<String, Object> parameter) {
        int[] pager = new int[] { common.utils.PageNumberUtil.CURRENT_PAGE, common.utils.PageNumberUtil.PAGE_SIZE };
        if (parameter.get("page") != null) {
            pager[0] = Integer.parseInt(parameter.get("page").toString());
        }
        if (parameter.get("rows") != null) {
            pager[1] = Integer.parseInt(parameter.get("rows").toString());
        }
        return pager;
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> handleServletParameter(HttpServletRequest request) {
        Map<String,Object> parameter = request.getParameterMap();
        Map<String, Object> rParams = new HashMap<>(0);
        for (Map.Entry<String,Object> m : parameter.entrySet()) {
            String key = m.getKey();
            Object[] obj = (Object[]) parameter.get(key);
            rParams.put(key, (obj.length > 1) ? obj : obj[0]);
        }
        return rParams;
    }

    public static Map<String, Object> parameterConvert(final Map<String, String[]> parameter) {
        Map<String, Object> rParams = new HashMap<>(0);
        for (Map.Entry<String, String[]> m : parameter.entrySet()) {
            String key = m.getKey();
            Object[] obj = parameter.get(key);
            rParams.put(key, (obj.length > 1) ? obj : obj[0]);
        }
        return rParams;
    }

    public static String getParamter(Map<String, Object> params, String key) {
        String[] str = (String[]) params.get(key);
        return ((str != null) && (str.length > 0)) ? str[0] : null;
    }

    public static String getParamter(Map<String, Object> params, String key, String defaultValue) {
        String value = getParamter(params, key);
        return (null == value) ? defaultValue : value;
    }

    public static Integer getParamterInt(Map<String, Object> params, String key) {
        if (params.get(key) != null) {
            return Integer.parseInt(params.get(key).toString());
        } else {
            return 0;
        }
    }

    public static Integer getParamterInt(Map<String, Object> params, String key, int defaultValue) {
        Integer value = getParamterInt(params, key);
        return isNullOrEmpty(value) ? Integer.valueOf(defaultValue) : value;
    }

    public static Double getParamterDouble(Map<String, Object> params, String key) {
        String value = getParamter(params, key);
        return isNullOrEmpty(value) ? null : new Double(value);
    }

    public static Double getParamterDouble(Map<String, Object> params, String key, double defaultValue) {
        Double value = getParamterDouble(params, key);
        return isNullOrEmpty(value) ? new Double(defaultValue) : value;
    }

    public static Long getParamterLong(Map<String, Object> params, String key) {
        String value = getParamter(params, key);
        return isNullOrEmpty(value) ? null : Long.valueOf(value);
    }

    public static Long getParamterLong(Map<String, Object> params, String key, long defaultValue) {
        Long value = getParamterLong(params, key);
        return isNullOrEmpty(value) ? Long.valueOf(defaultValue) : value;
    }

    /**
     * 
     * 得到Short参数
     * 
     * @param params
     * @param key
     * @return
     */
    public static Short getParamterShort(Map<String, Object> params, String key) {
        String value = getParamter(params, key);
        return isNullOrEmpty(value) ? null : Short.valueOf(value);
    }

    public static Short getParamterShort(Map<String, Object> params, String key, short defaultValue) {
        Short value = getParamterShort(params, key);
        return isNullOrEmpty(value) ? Short.valueOf(defaultValue) : value;
    }


    @SuppressWarnings("rawtypes")
    public static String convertParams(Map<String, Object> map) {
        Map.Entry entry;
        StringBuilder sbr = new StringBuilder();
        sbr.append("[");
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            entry = (Map.Entry) iterator.next();
            sbr.append("\"" + entry.getKey().toString() + "\"").append(":")
                    .append(null == entry.getValue() ? "\"\"" : ("\"" + entry.getValue().toString() + "\""))
                    .append(iterator.hasNext() ? "," : "");
        }
        sbr.append("]");
        return sbr.toString();

    }

    public static boolean isNullOrEmpty(Object o) {
        return o == null || String.valueOf(o).trim().length() == 0;
    }

    /**
     * obj是否在arr中
     * 
     * @param obj
     * @param arr
     * @return
     */
    public static boolean objIn(Object obj, Object... arr) {
        if (arr == null) {
            return false;
        }
        for (Object val : arr) {
            if (obj == val || (null != obj && obj.equals(val))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLetter(String colValue) {
        String regex = ".*[a-zA-Z]+.*";
        Matcher m = Pattern.compile(regex).matcher(colValue);
        return m.find();
    }

}
