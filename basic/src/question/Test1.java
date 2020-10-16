package question;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.Collections;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 18:16
 **/
public class Test1 {

    public static void main(String[] args) {

        //转换 int 数组
       /*int [] a = {1,2,3};
        int[] ints = invertArray(a);
        for (int in:ints) {
            System.out.println(in);
        }*/


        // 求 int 的阶乘
        //System.out.println(fact(5));

        //绘制 左上角 坐标 边长为 50的red 正方形
       // paintComponent();

        int [] a = {1,2,3};
        System.out.println(lessKeyFirst(a,1));;
    }
        static int lessKeyFirst(int[] a,int key){
            for (int i = 0; i < a.length; i++) {
                    if(a[i] < key){
                        return i;
                    }
            }
            return -1;
        }

      static  void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.red);
        Rectangle2D rec = new Rectangle2D.Double(10,30,50,50);
        g2d.draw(rec);
    }



    static long fact(int n){
        int i;
        long f = 1;
        for (i = 1; i <= n ; i++) {
            f = f * i;
        }
        return  f;
    }


   static int[] invertArray(int[] a){

        int[] b = new int[a.length];

        for (int i = 0; i < a.length;i++){
            b[i] = a[a.length - i -1];
        }
        return  b;
    }
}
