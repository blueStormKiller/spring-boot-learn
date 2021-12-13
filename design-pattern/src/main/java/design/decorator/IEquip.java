package design.decorator;

/*
下面需求开始：设计游戏的装备系统，基本要求，要可以计算出每种装备在镶嵌了各种宝石后的攻击力和描述：

        具体需求：

        1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）

        2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）

        3、每个装备可以随意镶嵌3颗

        https://blog.csdn.net/lmj623565791/article/details/24269409
*/

/**
 * 功能描述:装备的接口
 *
 * @author lrt
 * @since 2021/12/1 10:32
 **/
public interface IEquip {

    /**
     * 方法描述:
     *
     * @param
     * @return
     **/
    public int caculateAttack();


    /**
     * 方法描述:装备的描述
     *
     * @param
     * @return
     **/
    public String description();
}
