package genericity;

/**
 * @program: genericity
 * @description: 泛型
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 18:26
 *
 * 普通的 定义
 **/
public class Normal {

    public static void main(String[] args) {
        //1.设置数据
        Point p = new Point() ;
        p.setX(10);
        p.setY(20);
        //2.取出数据
        int x = (Integer) p.getX();
        int y = (Integer) p.getY();
        System.out.println("x地置"+ x +",y地置"+ y);
    }
}

class Point {  //定义地置
    private Object x ;
    private Object y ;
    public void setX(Object x) {
        this.x = x;
    }
    public void setY(Object y) {
        this.y = y;
    }
    public Object getX() {
        return x;
    }
    public Object getY() {
        return y;
    }
}