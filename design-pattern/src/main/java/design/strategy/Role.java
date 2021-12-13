package design.strategy;

/**
 * 先来看看策略模式的定义：
 * <p>
 * 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 * <p>
 * 好了，对于定义，肯定不是一眼就能看明白的，不然这篇文章就收尾了，对于定于大家简单扫一眼，知道个大概，然后继续读下面的文章，读完以后再来回味，效果嘎嘣脆。大家应该都玩过武侠角色游戏，下面我就以角色游戏为背景，为大家介绍：假设公司需要做一款武侠游戏，我们就是负责游戏的角色模块，需求是这样的：每个角色对应一个名字，每类角色对应一种样子，每个角色拥有一个逃跑、攻击、防御的技能。
 * ————————————————
 * 版权声明：本文为CSDN博主「鸿洋_」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/lmj623565791/article/details/24116745
 */
public abstract class Role {

    protected String name;

    protected abstract void display();

    protected abstract void run();

    protected abstract void attack();

    protected abstract void defend();
}
