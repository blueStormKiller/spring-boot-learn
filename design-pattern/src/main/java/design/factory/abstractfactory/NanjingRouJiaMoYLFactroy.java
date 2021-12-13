package design.factory.abstractfactory;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName XianRouJiaMoYLFactroy.java
 * @Description TODO
 * @createTime 2021年12月06日 16:59:00
 */
public class NanjingRouJiaMoYLFactroy implements RouJiaMoYLFactroy {
    @Override
    public Meat createMeat() {
        return new FreshMeat();
    }

    @Override
    public YuanLiao createYuanLiao() {
        return new NanjingYuanLiao();
    }

}
