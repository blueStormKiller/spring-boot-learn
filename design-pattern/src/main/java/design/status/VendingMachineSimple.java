package design.status;

/**
 * 转载请标明出处：http://blog.csdn.net/lmj623565791/article/details/26350617
 * <p>
 * 状态模式给了我眼前一亮的感觉啊，值得学习~
 * <p>
 * 先看定义：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。定义又开始模糊了，理一下，当对象的内部状态改变时，它的行为跟随状态的改变而改变了，看起来好像重新初始化了一个类似的。
 * <p>
 * 下面使用个例子来说明状态模式的用法，现在有个自动售货机的代码需要我们来写，状态图如下：
 * ————————————————
 * 版权声明：本文为CSDN博主「鸿洋_」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/lmj623565791/article/details/26350617
 */
public class VendingMachineSimple {

    /**
     * 已投币
     */
    private final static int HAS_MONEY = 0;

    /**
     * 未投币
     */
    private final static int NO_MONEY = 1;

    /**
     * 售出商品
     */
    private final static int SOLD = 2;
    /**
     * 商品售罄
     */
    private final static int SOLD_OUT = 3;
    private int currentStatus = NO_MONEY;
    /**
     * 商品数量
     */
    private int count = 0;

    public VendingMachineSimple(int count) {
        this.count = count;
        if (count > 0) {
            currentStatus = NO_MONEY;
        }
    }

    /**
     * 投入硬币，任何状态用户都可以投币
     */
    public void insertMoney() {
        switch (currentStatus) {
            case NO_MONEY:
                currentStatus = HAS_MONEY;
                System.out.println("成功投入硬币");
                break;
            case HAS_MONEY:
                System.out.println("已经有硬币，无需投币");
                break;
            case SOLD:
                System.out.println("请稍等");
                break;
            case SOLD_OUT:
                System.out.println("商品已经售罄，请勿投币");
                break;
        }
    }

    /**
     * 退币，在任何状态下都可能退币
     */
    public void backMoney() {
        switch (currentStatus) {
            case NO_MONEY:
                System.out.println("您未投入硬币");
                break;
            case HAS_MONEY:
                currentStatus = NO_MONEY;
                System.out.println("退币成功");
                break;
            case SOLD:
                System.out.println("您已经买了东西，无法退币");
                break;
            case SOLD_OUT:
                System.out.println("您未投币");
                break;
        }
    }

    /**
     * 转动手柄购买，任何状态下用户都可能转动手柄
     */
    public void turnCrank() {
        switch (currentStatus) {
            case NO_MONEY:
                System.out.println("请先投入硬币");
                break;
            case HAS_MONEY:
                currentStatus = SOLD;
                dispense();
                break;
            case SOLD:
                System.out.println("连续转动也没有什么用处，请耐心等待");
                break;
            case SOLD_OUT:
                System.out.println("商品已经售罄");
                break;
        }
    }

    /**
     * 发放商品
     */
    private void dispense() {
        switch (currentStatus) {
            case NO_MONEY:
            case HAS_MONEY:
            case SOLD_OUT:
                throw new IllegalStateException("状态非法");
            case SOLD:
                count--;
                System.out.println("发出商品");
                if (count == 0) {
                    System.out.println("商品售罄");
                    currentStatus = SOLD_OUT;
                } else {
                    currentStatus = NO_MONEY;
                }
                break;
        }
    }
}
