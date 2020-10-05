package singleton;

/**
 * @program: basicTest
 * @description: 使用内部类创建单例
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 09:35
 **/
public class SingleByInnerClass {
    private SingleByInnerClass(){ }

    public static SingleByInnerClass getInstance() {
        return SingleByInnerClassHope.innerClass;
    }

    private static class  SingleByInnerClassHope{
       private static SingleByInnerClass innerClass = new SingleByInnerClass();
    }
}
