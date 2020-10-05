package genericity;

/**
 * @program: genericity
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 18:26
 *
 * 使用泛型
 **/
public class Genericity {

    public static void main(String[] args) {
        //String
        PointByGenericity<String> p = new PointByGenericity<>() ;

        p.setX("东经:10°");
        p.setY("北纬:20°");

        //取出并输出数据
        System.out.println("x地置"+ p.getX() +",y地置"+  p.getY());

        //Integer
        PointByGenericity<Integer> pI = new PointByGenericity<>() ;
        pI.setX(5);
        pI.setY(10);

        //取出并输出数据
        System.out.println("x地置"+ pI.getX() +",y地置"+  pI.getY());

    }
}


/**
 * //定义坐标,这个"<>"里面的东西随意，Type = T,是表示一种类型
 * @param <T>
 */
class PointByGenericity<T> {

    /**
     *  此属性的类型不确定，由Point类使用时动态决定
     */
    private T x ;

    /**
     * 此属性的类型不确定，由Point类使用时动态决定
     */
    private T y ;
    public void setX(T x) {
        this.x = x;
    }
    public void setY(T y) {
        this.y = y;
    }
    public T getX() {
        return x;
    }
    public T getY() {
        return y;
    }
}