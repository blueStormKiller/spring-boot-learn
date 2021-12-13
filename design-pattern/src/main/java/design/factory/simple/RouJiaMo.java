package design.factory.simple;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName RouJiaMo.java
 * @Description TODO
 * @createTime 2021年12月06日 16:36:00
 */
public abstract class RouJiaMo {

    protected String name;

    public void prepaer(){
        System.out.println("揉面-剁肉-完成准备工作");
    }

    public void pack(){
        System.out.println("肉夹馍-专用袋-包装");
    }

    public void file(){
        System.out.println("肉夹馍-专用设备-烘焙");
    }
}
