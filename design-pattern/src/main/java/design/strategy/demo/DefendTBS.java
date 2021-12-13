package design.strategy.demo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName DefendTBS.java
 * @Description TODO
 * @createTime 2021年12月07日 17:42:00
 */
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
