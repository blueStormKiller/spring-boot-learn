package design.factory.abstractfactory;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RouJiaMo.java
 * @Description TODO
 * @createTime 2021年12月06日 17:05:00
 */
public abstract class RouJiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public final void prepare(RouJiaMoYLFactroy ylFactroy) {
        Meat meat = ylFactroy.createMeat();
        YuanLiao yuanliao = ylFactroy.createYuanLiao();
        System.out.println("使用官方的原料" + meat + " , " + yuanliao + "作为原材料制作肉夹馍 ");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public final void pack() {
        System.out.println("肉夹馍-专用袋-包装");
    }

    /**
     * 秘制设备-烘烤2分钟
     */
    public final void fire() {
        System.out.println("肉夹馍-专用设备-烘烤");
    }

}
