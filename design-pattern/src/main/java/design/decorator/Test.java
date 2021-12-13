package design.decorator;

import design.decorator.im.ArmEquip;
import design.decorator.im.RingEquip;
import design.decorator.im.ShoeEquip;
import design.decorator.imdecorator.BlueGemDecorator;
import design.decorator.imdecorator.RedGemDecorator;
import design.decorator.imdecorator.YellowGemDecorator;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年12月01日 15:28:00
 */
public class Test {
    public static void main(String[] ages) {

        // 一个镶嵌2颗红宝石，一颗蓝宝石的靴子
        System.out.println("一个镶嵌2颗红宝石，一颗蓝宝石的靴子");
        IEquip equip = new RedGemDecorator(new BlueGemDecorator(new ShoeEquip()));
        System.out.println("攻击力  : " + equip.caculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------");

        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
        equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
        System.out.println("攻击力  : " + equip.caculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------");

        // 只是屠龙宝刀
        equip = new RingEquip();
        System.out.println("攻击力  : " + equip.caculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------");
    }
}
