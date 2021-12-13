package springbootlearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName IndexController.java
 * @Description TODO
 * @createTime 2021年06月08日 11:38:00
 */
@Controller
@RequestMapping
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/toPage", method = RequestMethod.GET)
    public String toPage(HttpServletRequest request) {
        String url = request.getParameter("url");
        return url;
    }

}
