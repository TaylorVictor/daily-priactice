package test.model.singleton;

/**
 * @author Vector
 */
public class NonStaticSingleton {

    private static volatile NonStaticSingleton instance;

    public NonStaticSingleton getInstance() {
        if (instance == null) {
            synchronized (NonStaticSingleton.class) {
                if (null == instance) {
                    instance = new NonStaticSingleton();
                }
            }
        }
        return instance;
    }
}
