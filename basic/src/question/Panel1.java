package question;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 15:56
 **/
import java.applet.*;import javax.swing.*;
import java.awt.*;   import java.awt.event.*;

class Panel1 extends JPanel{
    JTextField text1, text2, text3; JButton addButton,subButton;
    Panel1(){
        text1=new JTextField(10);text2=new JTextField(10);
        text3=new JTextField(10);setLayout(new GridLayout(5,1));
        addButton=new JButton("＂加＂");
        subButton=new JButton("＂减＂");
        add(text1);   add(text2);
        add(text3);   add(addButton);   add(subButton);
    }
}
class Classl extends Applet implements ActionListener{
    /*Panel panel;
    @Override
    public void init(){
        setSize(100,200);
        panel = new Panel();
        add(panel);
        (panel.addButton).addActionListener(this);
        (panel.subButton). addActionListener(this);
    }*/
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}