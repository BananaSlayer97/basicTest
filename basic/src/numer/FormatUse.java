package numer;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @program: basicTest
 * @description: 格式化
 * @author: 全栈者也
 * @create: 2020 - 10 - 24 09:59
 **/
public class FormatUse {

    public static void main(String[] args) {

        String moneyStr = "56.36559555555555555555";
        BigDecimal bigDecimal = new BigDecimal(moneyStr);

        //建立货币格式化引用
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //建立百分比格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();

        //百分比小数点最多3位
        percent.setMaximumFractionDigits(3);

        //贷款金额
        BigDecimal loanAmount = new BigDecimal("15000.48");

        //利率
        BigDecimal interestRate = new BigDecimal("0.008");

        //相乘
        BigDecimal interest = loanAmount.multiply(interestRate);

        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        System.out.println("利率:\t" + percent.format(interestRate));
        System.out.println("利息:\t" + currency.format(interest));

    }

}
