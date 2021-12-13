package design.decorator.im;

import design.decorator.IEquip;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName WristEquip.java
 * @Description 圣战护腕 攻击力 5
 * @createTime 2021年12月01日 15:09:00
 */
public class WristEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }

}
