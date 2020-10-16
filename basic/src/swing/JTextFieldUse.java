package swing;

import javax.swing.*;
import java.util.Date;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 19:47
 **/
public class JTextFieldUse extends JPanel implements Runnable{

    public static void main(String[] args) {
        JTextFieldUse jTextFieldUse = new JTextFieldUse();
    }

        Thread TimeThread = null;
        JTextField t;
        JTextFieldUse(){
            t=new JTextField(20);
            add(t);
            TimeThread = new Thread();
            TimeThread.start();
     }

    @Override
    public void run() {
        Date timeNow;
        while(true){
            timeNow = new Date();
            t.setText("现在时间:"+timeNow.toString());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }
    }
}