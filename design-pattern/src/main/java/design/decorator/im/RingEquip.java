package design.decorator.im;

import design.decorator.IEquip;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RingEquip.java
 * @Description 戒指 攻击力5
 * @createTime 2021年12月01日 15:06:00
 */
public class RingEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
