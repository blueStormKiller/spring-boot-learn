package design.status;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName WinnerState.java
 * @Description TODO
 * @createTime 2021年12月02日 17:15:00
 */
public class WinnerState implements State {
    private VendingMachine machine;

    public WinnerState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void dispense() {
        System.out.println("你中奖了，恭喜你，将得到2件商品");
        machine.dispense();

        if (machine.getCount() == 0) {
            System.out.println("商品已经售罄");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.dispense();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoMoneyState());
            } else {
                System.out.println("商品已经售罄");
                machine.setState(machine.getSoldOutState());
            }

        }

    }

}