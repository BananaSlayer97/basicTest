package lambda;

/**
 * @program: basicTest
 * @description: Lambda 箭头函数
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 10:33
 **/
public class LambdaByArrow {

    public static void main(String[] args) {
        Car car = new Bike();

        car = () ->{
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        };

        car.name();

        Car car2 = new Bike();
        car2.name();
    }
}


interface  Car{
    void name();
}

class  Bike implements Car{
    @Override
    public void name() {}
}