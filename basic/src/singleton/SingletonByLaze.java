package singleton;

/**
 * @program: basicTest
 * @description: 懒汉单例
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 09:00
 **/
public class SingletonByLaze {
    private static SingletonByLaze singletonByLaze;
    private SingletonByLaze(){
    }
    public static synchronized  SingletonByLaze getSingletonByLaze() {
        if (singletonByLaze == null){
            singletonByLaze = new SingletonByLaze();
        }
        return singletonByLaze;
    }
}

