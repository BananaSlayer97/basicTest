package lambda;

/**
 * @program: basicTest
 * @description: Lambda 箭头函数
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 10:33
 **/
public class LambdaByArrow {

    public static void main(String[] args) {

        /**
         * 直接lambda 相当于 实现类，内部实现类
         * 里面就是要实现的代码
         */
        Car car = () ->{
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        };

        car.name();

        /**
         * 普通调用方法，需要写个实现类
         * 然后再调用方法
         */
        Car car2 = new Bike();
        car2.name();
    }
}


interface  Car{
    void name();
}

/**
 * 接口实现类
 */
class  Bike implements Car{
    @Override
    public void name() {}
}