package question;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 15:18
 **/
public class Test2 {

    public static void main(String[] args) {
            new Test2(0);
            new SubClass();
            new SubClass(1);



    }

    Test2(){
        System.out.println("A");
    }

    Test2(int i){
       this();
        System.out.println("AA");
    }

}

class  SubClass extends  Test2{
    SubClass(){
        super();
        System.out.println("B");
    }

    SubClass(int i){
        super();
        System.out.println("BB");
    }
}