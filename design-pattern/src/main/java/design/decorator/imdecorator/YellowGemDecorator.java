package design.decorator.imdecorator;

import design.decorator.IEquip;
import design.decorator.IEquipDecorator;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName BlueGemDecorator.java
 * @Description TODO
 * @createTime 2021年12月01日 15:22:00
 */
public class YellowGemDecorator implements IEquipDecorator {

    /**
     * 每个装饰品里面维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 15 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "黄宝石buffer";
    }
}
