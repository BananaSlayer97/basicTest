package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 16:58
 **/
public class Test {


    public static void main(String[] args) {
        String s = "ABCDEFG";


        //从第三个开始
        System.out.println(s.substring(3));
        //从第三个开始，到5但是不包括5
        System.out.println(s.substring(3,5));

        //转换小写
        System.out.println(s.toLowerCase());

        //转换大写
        System.out.println(s.toUpperCase());
    }

}
