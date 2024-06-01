package java.model;

/**
 * @author: Vector
 * @Date: 2024/06/01 22:15
 */
public class NonStaticSingleton1 {

    private static NonStaticSingleton1 instance;

    public synchronized NonStaticSingleton1 getInstance() {
        if (null == instance) {
            instance = new NonStaticSingleton1();
        }
        return instance;
    }
}
