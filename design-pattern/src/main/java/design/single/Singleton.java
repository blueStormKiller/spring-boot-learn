package design.single;

/**
 * 饿汉
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getSingleton() {
        return instance;
    }
}
