package singleton;

/**
 * @program: basicTest
 * @description: 饥饿单例
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 09:00
 **/
public class SingletonByHunger {
    private static SingletonByHunger singletonByHunger = new SingletonByHunger();
    private SingletonByHunger(){
    }
    public static SingletonByHunger getSingletonByHunger() {
        return singletonByHunger;
    }
}

