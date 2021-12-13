package design.adapter;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Mobile.java
 * @Description TODO
 * @createTime 2021年12月06日 15:47:00
 */
public class Mobile {
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        System.out.println("手机客户端：我需要5v电压充电，现在是--》" + provideV5Power + "V");
    }
}
