package lambda;

/**
 * @program: basicTest
 * @description: 实体类
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 13:09
 **/
public class User {

    private String  name;

    public User(){
    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
