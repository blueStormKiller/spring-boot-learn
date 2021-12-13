package design.factory.method;

import design.factory.simple.LaRouJiaMo;
import design.factory.simple.RouJiaMo;
import design.factory.simple.SuanRouJiaMo;
import design.factory.simple.TianRouJiaMo;

/**
 * 然后就是各个西安口味的肉夹馍了，这代码就不贴了。可以看出我们把制作肉夹馍的过程以抽象方法的形式让子类去决定了，对照定义：
 * 1、定义了创建对象的一个接口：public abstract RouJiaMo createRouJiaMo(String type);
 */
public class NanjingRouJiaMoStore extends RoujiaMoStore {
    @Override
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
