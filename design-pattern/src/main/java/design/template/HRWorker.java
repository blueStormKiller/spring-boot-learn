package design.template;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName HRWorker.java
 * @Description TODO
 * @createTime 2021年12月02日 15:31:00
 */
public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "看简历-打电话-接电话");
    }

    @Override
    public boolean isNeedPrintDate() {
        return true;

    }
}
