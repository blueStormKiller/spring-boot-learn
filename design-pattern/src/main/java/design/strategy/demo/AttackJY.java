package design.strategy.demo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName AttackJY.java
 * @Description TODO
 * @createTime 2021年12月07日 17:40:00
 */
public class AttackJY implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("九阳神功");
    }
}
