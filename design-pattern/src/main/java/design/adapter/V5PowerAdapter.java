package design.adapter;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName V5PowerAdapter.java
 * @Description TODO
 * @createTime 2021年12月06日 15:53:00
 */
public class V5PowerAdapter implements V5Power {
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();

        // power 经过各种操作--》5
        System.out.println("适配器：我悄悄的适配了电压：");
        return 5;
    }
}
