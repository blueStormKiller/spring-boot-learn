package design.factory.easyfactory;

import design.factory.simple.LaRouJiaMo;
import design.factory.simple.RouJiaMo;
import design.factory.simple.SuanRouJiaMo;
import design.factory.simple.TianRouJiaMo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName SimpleRouJiaMoFactroy.java
 * @Description TODO
 * @createTime 2021年12月06日 16:46:00
 */
public class SimpleRouJiaMoFactroy {

    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        }
        return rouJiaMo;
    }
}
