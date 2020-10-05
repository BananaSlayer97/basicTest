package singleton;

/**
 * @program: basicTest
 * @description: 双重校验锁创建单例
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 09:44
 **/
public class SingletonByDoubleCheck {
    private volatile static SingletonByDoubleCheck instance = null;
    private SingletonByDoubleCheck() { }
    public static SingletonByDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonByDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonByDoubleCheck();
                }
            }
        }
        return instance;
    }
}