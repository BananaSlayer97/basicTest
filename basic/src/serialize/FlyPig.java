package serialize;

import java.io.Serializable;

/**
 * @program: basicTest
 * @description: 实体类
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 19:04
 **/
public class FlyPig  implements Serializable {

    private static String AGE = "269";

    private String name;
    private String color;

    private transient String car;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "FlyPig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", AGE='" + AGE + '\'' +
                '}';
    }
}
