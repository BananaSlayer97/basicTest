package question;

import java.applet.Applet;
import java.awt.*;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 15:43
 **/
public class  Point{

    int x,y;
    Point(int xx,int yy){ x=xx;y=yy;}
    Point(Point p){x=p.x;y=p.y;  }
    void m(int dx,int dy){x+=dx;y+=dy;}
}

class Circle extends Point{
    int r;
    Circle(Point p, int rr){  super(p); r=rr;  }
    float c(){ return 3.14f*2.0f*r;  }
    float a(){ return 3.14f*r*r;}
}

 class Sample extends Applet {
    Circle yuan;
    Point d;
    @Override
    public void init()  {d=new Point(2,5);yuan=new Circle(d,10);}

    @Override
    public void paint(Graphics g){
        g.drawString("yuan Circle"+(int)(yuan.c()*100.0)/100.0,5,20);
        g.drawString("yuan Area"+(int)(yuan.a()*100.0)/100.0,5,40);
    }
}
