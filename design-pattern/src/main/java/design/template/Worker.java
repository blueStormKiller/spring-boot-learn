package design.template;

import java.util.Date;

/**
 * 转载请标明出处：http://blog.csdn.net/lmj623565791/article/details/26276093
 * <p>
 * 继续设计模式~ 模版方法模式
 * <p>
 * 老套路，先看下定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * <p>
 * 简单看下定义，模版方法定义了一个算法的步骤，并且允许子类为一个或多个步骤提供实现。定义还算清晰，下面来个例子展示下本公司的上班情况（纯属娱乐，如有雷同，请对号入座）。简单描述一下：本公司有程序猿、测试、HR、项目经理等人，下面使用模版方法模式，记录下所有人员的上班情况：
 * ————————————————
 * 版权声明：本文为CSDN博主「鸿洋_」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/lmj623565791/article/details/26276093
 */
public abstract class Worker {

    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    /**
     * 记录一天的工作
     */
    public final void workOneDay() {

        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");

    }

    /**
     * 子类可实现可不实现
     *
     * @return
     */
    public boolean isNeedPrintDate() {
        return false;
    }

    /**
     * 工作  子类继承实现
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff() {
        System.out.println(name + "关闭电脑");
    }

    /**
     * 打开电脑
     */
    private void computerOn() {
        System.out.println(name + "打开电脑");
    }

    /**
     * 进入公司
     */
    public void enterCompany() {
        System.out.println(name + "进入公司");
    }

    /**
     * 离开公司
     */
    public void exitCompany() {
        if (isNeedPrintDate()) {
            System.out.print(new Date().toLocaleString() + "-->");
        }
        System.out.println(name + "离开公司");

    }
}
