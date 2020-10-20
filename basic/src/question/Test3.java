package question;

import java.awt.*;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 19:33
 **/
public class Test3 {

    public static void main(String[] args) {

       // System.out.println(getMaxComm(15,33));

       // System.out.println(53/2 + 1.0);

      /*  Sample sample = new Sample();
        sample.init();
        sample.paint(new Graphics());*/

        int [] a = {5,9,63,4};

        int[] ints = halfArray(a);
        for (int in:ints){
            System.out.println(in);
        }
    }


    static int[] halfArray(int[] a){
        int [] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] / 2;
        }
        
        return  b;
    }


/*    public static int getMaxComm (int m , int n){
        if (m<= 0 || n<=0){
            System.out.println("输入数据错误!");
        }
        if ( m<n) {
            int temp = 0;
            temp = m;
            m = n;
            n = temp;
        }
            int r = ;

            while (r != 0) {
                m = n;
                n = r;
                r = m % n;
                return_;
            }
        }*/
}
