package design.status;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName NoMoneyState.java
 * @Description TODO
 * @createTime 2021年12月02日 16:53:00
 */
public class NoMoneyState implements State {
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("您未投币，想退钱？...");
    }

    @Override
    public void turnCrank() {
        System.out.println("您未投币，想拿东西么？...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }

}