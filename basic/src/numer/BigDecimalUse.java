package numer;

import java.math.BigDecimal;

/**
 * @program: basicTest
 * @description: 大数据类型的金额使用类
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 18:26
 **/
public class BigDecimalUse {

    public static void main(String[] args) {


        /**
         * BigDecimal 的构造函数可以有四个来源：
         *      1. int
         *      2. double
         *      3. long
         *      4. String
         */
        String moneyStr = "56.36559555555555555555";

        BigDecimal bigDecimal = new BigDecimal(moneyStr);

        Double aDouble = Double.valueOf(moneyStr);
        Float aFloat = Float.valueOf(moneyStr);

        System.out.println("float === "+aFloat);
        System.out.println("double === "+aDouble);
        System.out.println("bigDecimal ==="+bigDecimal);

        BigDecimal bigDecimal2 = new BigDecimal(23);

        /**
         * BigDecimal对象中的值相加，返回BigDecimal对象
         */
        BigDecimal add = bigDecimal.add(bigDecimal2);
        System.out.println("add==="+add);

        /**
         *相减
         */
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        System.out.println(subtract);

        /**
         * 相乘
         */
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        System.out.println(multiply);

        /**
         * 相除
         */
        BigDecimal divide = bigDecimal.divide(bigDecimal);
        System.out.println(divide);

        /**
         * 转为 toString
         */
        String string = bigDecimal.toString();
        System.out.println(string);

        /**
         * 转为 双精度
         */
        double doubleValue = bigDecimal.doubleValue();
        System.out.println(doubleValue);

        /**
         * 转为单精度
         */
        float floatValue = bigDecimal.floatValue();
        System.out.println(floatValue);

        /**
         * 转为长整数
         */
        long longValue = bigDecimal.longValue();
        System.out.println(longValue);

        /**
         * 转为 int
         */
        int intValue = bigDecimal.intValue();
        System.out.println(intValue);


        /**
         * 大小比较
         * -1, 表示 bigdemical  小于 bigdemical2；
         * 0,  表示bigdemical   等于 bigdemical2；
         *  1, 表示bigdemical  大于 bigdemical2；
         */
        int compareTo = bigDecimal.compareTo(bigDecimal2);
        System.out.println(compareTo);



    }
}
