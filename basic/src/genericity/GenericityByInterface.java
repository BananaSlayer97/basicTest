package genericity;

/**
 * @program: genericity
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 18:46
 *
 * 接口使用 泛型
 **/
public class GenericityByInterface {

    public static void main(String[] args) {
        IMessage<Integer> msg = new MessageImpl();
        msg.print(666) ;
    }
}

class MessageImpl implements IMessage<Integer> {

    @Override
    public void print(Integer integer) {
        System.out.println(integer);
    }
}

/**
 * 设置泛型接口
 */
interface IMessage<T>{
    public void print(T t) ;
}