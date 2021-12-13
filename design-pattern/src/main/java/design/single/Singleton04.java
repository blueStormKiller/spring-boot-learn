package design.single;

/**
 * 使用一个持有类，主要是为了不在初始化的时候加载
 */
public class Singleton04 {
    private static final class InstanceHolder {
        private static Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
