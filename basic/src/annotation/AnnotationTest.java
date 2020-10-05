package annotation;

import serialize.FlyPig;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 21:32
 **/
public class AnnotationTest {

    public static void main(String[] args) throws Exception {

        //获取 Student 中的 toString 方法
        Method method = Student.class.getMethod("toString");

        //通过反射机制获取 toString 所有的注解
        Annotation[]  annotations  =  method.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof  Override){
                Override override = (Override)annotation;
                System.out.println(override.info());
            }
        }


    }
}


/**
 * @author liuya
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Override {

    String info();
}


class Student {

    @java.lang.Override
    @Override(info = "重写String()")
    public String toString() {
        return super.toString();
    }
}