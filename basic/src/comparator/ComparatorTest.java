package comparator;


import java.util.Arrays;

/**
 * @program: basicTest
 * @description: 自定义排序类测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 10:20
 **/
public class ComparatorTest {

    public static void main(String[] args) {
        User[] u=new User[]{new User("徐虎",26),new User("龙华",20),new User("苏苏",18)};

        System.out.print("排序前");
        for(User user:u){
            System.out.print(user.getName()+":"+user.getAge());
        }
        Arrays.sort(u,new UserCompartor());
        System.out.print("\n排序后");
        for(User user:u){
            System.out.print(user.getName()+":"+user.getAge());
        }
    }


}

