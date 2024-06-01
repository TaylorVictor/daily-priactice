package java.model;

/**
 * 单例模式
 */
public class StaticSingleton {

    private static final StaticSingleton instance = new StaticSingleton();

    public static StaticSingleton getInstance() {
        return instance;
    }
}
