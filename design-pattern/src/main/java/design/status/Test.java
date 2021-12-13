package design.status;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年12月02日 16:22:00
 */
public class Test {
 public static void main(String[] ages){
  VendingMachineSimple machine=new VendingMachineSimple(4);
  machine.insertMoney();
  machine.backMoney();

  System.out.println("-----------");

  machine.insertMoney();
  machine.turnCrank();

  System.out.println("----------压力测试-----");
  machine.insertMoney();
  machine.insertMoney();
  machine.turnCrank();
  machine.turnCrank();
  machine.backMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
  machine.insertMoney();
  machine.turnCrank();
 }
}
