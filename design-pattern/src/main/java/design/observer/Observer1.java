package design.observer;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Observer1.java
 * @Description TODO
 * @createTime 2021年12月09日 15:20:00
 */
public class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1得到3d号码---》" + msg + ",我要记录下来");
    }
}
