package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: basicTest
 * @description: 窗口初体验
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 16:24
 **/

public  class MyWin extends JFrame implements ActionListener {
    JButton butt = new JButton("连接");
    JTextField text1= new JTextField(10);
    JTextField text2 = new JTextField(10);
    JTextField text3 =new JTextField(20);
    MyWin(){
        super("Test33");
        Container con = getContentPane();
        con.setLayout(new GridLayout(1,3));
        con.setPreferredSize(new Dimension(600,50));
        con.add(text1);con.add(text2); con.add(butt);con.add(text3);
        butt.addActionListener(this);
        pack();
        setVisible(true);

    }
        @Override
        public void actionPerformed(ActionEvent e){
        
            String a, b, c;
            a = text1.getText();
            b = text2.getText();
            c = a + b;
            if(c.length()!=0) {
                text3.setText(c);
            } else {
                text3.setText("NULL");
            }
        }
}