package design.status;

import java.util.Random;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName HasMoneyState.java
 * @Description TODO
 * @createTime 2021年12月02日 17:14:00
 */
public class HasMoneyState implements State {

    private VendingMachine machine;
    private Random random = new Random();

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("您已经投过币了，无需再投....");
    }

    @Override
    public void backMoney() {
        System.out.println("退币成功");

        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了手柄");
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }

}
