package design.strategy.demo;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName DisplayA.java
 * @Description TODO
 * @createTime 2021年12月07日 17:50:00
 */
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("展示");
    }
}
