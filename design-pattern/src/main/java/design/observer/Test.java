package design.observer;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年12月09日 15:22:00
 */
public class Test {
    public static void main(String[] ages) {
        ObjectFor3D subject3d = new ObjectFor3D();
        Observer observer1 = new Observer1(subject3d);
        Observer observer2 = new Observer2(subject3d);
        subject3d.setMsg("何处");
        subject3d.setMsg("正是年少");
    }
}
