package design.factory.method;

import design.factory.simple.RouJiaMo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RoujiaMoStore.java
 * @Description TODO
 * @createTime 2021年12月06日 16:51:00
 */
public abstract class RoujiaMoStore {
    public abstract RouJiaMo createRouJiaMo(String type);

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = createRouJiaMo(type);

        rouJiaMo.prepaer();
        rouJiaMo.file();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
