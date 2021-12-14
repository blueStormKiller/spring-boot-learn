/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: CookieContants.java
 * Author:   12070675/王震
 * Date:     2014-9-2 上午10:43:19
 * Description: //模块目的、功能描述
 * History: //修改记录
 * 12070675/王震      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package constants;

import org.apache.commons.collections.MapUtils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

/**
 * Cookie
 *
 * @author 19045880
 */
public class CookieContants {
    /**
     * cookieDomain
     */
    private static String cookieDomain = ".cnsuning.com";

    /**
     * cookiePath
     */
    private static String cookiePath = "/";

    static {
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        Map initParam = wac.getBean("cap", Map.class);
        cookieDomain = MapUtils.getString(initParam, "ldcs.cookiedomain", cookieDomain);
        cookiePath = MapUtils.getString(initParam, "ldcs.cookiepath", cookiePath);
    }

    private CookieContants() {
    }

    public static String getCookieDomain() {
        return cookieDomain;
    }

    public static String getCookiePath() {
        return cookiePath;
    }
}
