package design.decorator.im;

import design.decorator.IEquip;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName ShoeEquip.java
 * @Description TODO
 * @createTime 2021年12月01日 15:18:00
 */
public class ShoeEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战鞋子";
    }
}
