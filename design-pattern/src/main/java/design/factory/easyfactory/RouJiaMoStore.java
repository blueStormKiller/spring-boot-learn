package design.factory.easyfactory;

import design.factory.simple.RouJiaMo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RoujiaMoStore.java
 * @Description TODO
 * @createTime 2021年12月06日 16:47:00
 */
public class RouJiaMoStore {
    private SimpleRouJiaMoFactroy factroy;

    public RouJiaMoStore(SimpleRouJiaMoFactroy factroy) {
        this.factroy = factroy;
    }

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
        rouJiaMo.prepaer();
        rouJiaMo.file();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
