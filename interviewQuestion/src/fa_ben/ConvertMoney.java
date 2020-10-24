package fa_ben;

import java.math.BigDecimal;

/**
 * @program: basicTest
 * @description: 操作金额的类，以及转换
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 18:07
 **/
public class ConvertMoney{

    public static void main(String[] args) {

        String moneyStr = "56.36559555555555555555";

        BigDecimal bigDecimal = new BigDecimal(moneyStr);
        Double aDouble = Double.valueOf(moneyStr);
        Float aFloat = Float.valueOf(moneyStr);

        System.out.println("float === "+aFloat);
        System.out.println("double === "+aDouble);
        System.out.println("bigDecimal ==="+bigDecimal);

    }


}
