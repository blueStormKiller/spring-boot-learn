package design.decorator.im;

import design.decorator.IEquip;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName ArmEquip.java
 * @Description 武器 攻击力20
 * @createTime 2021年12月01日 10:36:00
 */
public class ArmEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
