package design.factory.simple;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RoujiaMoStore.java
 * @Description TODO
 * @createTime 2021年12月06日 16:36:00
 */
public class RouJiaMoStore {
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        }
        rouJiaMo.prepaer();
        rouJiaMo.file();
        ;
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
