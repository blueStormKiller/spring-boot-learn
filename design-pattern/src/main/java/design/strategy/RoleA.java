package design.strategy;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RoleA.java
 * @Description TODO
 * @createTime 2021年12月07日 17:30:00
 */
public class RoleA extends Role {

    public RoleA(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("样子1");
    }

    @Override
    public void run() {
        System.out.println("奔跑1");
    }

    @Override
    public void attack() {
        System.out.println("攻击1");
    }

    @Override
    public void defend() {
        System.out.println("防御1");
    }
}
