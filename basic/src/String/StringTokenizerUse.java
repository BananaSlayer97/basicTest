package String;

import java.util.StringTokenizer;

/**
 * @program: basicTest
 * @description: Java StringTokenizer 属于 java.util 包，用于分隔字符串。
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 11:20
 **/
public class StringTokenizerUse {

    public static void main(String[] args) {

        /**
         * StringTokenizer 常用方法：
         *
         * 1. int countTokens()：返回nextToken方法被调用的次数。
         * 2. boolean hasMoreTokens()：返回是否还有分隔符。
         * 3. boolean hasMoreElements()：判断枚举 （Enumeration） 对象中是否还有数据。
         * 4. String nextToken()：返回从当前位置到下一个分隔符的字符串。
         * 5. Object nextElement()：返回枚举 （Enumeration） 对象的下一个元素。
         * 6. String nextToken(String delim)：与 4 类似，以指定的分隔符返回结果。
         */

        StringTokenizer pas = new StringTokenizer(" public static void,main"," ,");
        System.out.println(pas.countTokens());

        String str = "runoob,google,taobao,facebook,zhihu";
        // 以 , 号为分隔符来分隔字符串
        StringTokenizer st=new StringTokenizer(str,",");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


        System.out.println("使用第一种构造函数：");
        StringTokenizer st1 = new StringTokenizer("Hello Runoob How are you", " ");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("使用第二种构造函数：");
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        System.out.println("使用第三种构造函数：");
        StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :",  true);
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }

}
