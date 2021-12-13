package design.adapter;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年12月06日 15:56:00
 */
public class Test {
    public static void main(String[] ages) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
