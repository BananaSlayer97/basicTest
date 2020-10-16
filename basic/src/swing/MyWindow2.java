package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 20:05
 **/
public class MyWindow2 extends WindowAdapter implements ActionListener {

    JFrame f;
    JButton bClear, bCopy;
    JTextField tfs, tft;

        public void go(){
            //设置窗口
        f = new JFrame("Test33");
        f.setLayout(null);
        f.setSize(490,180);

        //两个文本的 字体大小
        tfs = new JTextField(15);
        tft = new JTextField(15);

        //两个按钮的名称
        bCopy = new JButton("Copy");
        bClear = new JButton("Clear");

        //两个文本框
        tfs.setBounds(20,15,300,40);
        tft.setBounds(20,60,300,40);

        //两个按钮
        bCopy.setBounds(350,15,100,40);
        bClear.setBounds(350,60,100,40);

        //添加事件
        f.add(tfs);
        f.add(tft);
        f.add(bCopy);
        f.add(bClear);

        //监听这两个事件
        bClear.addActionListener(this);
        bCopy.addActionListener(this);

        //设置为 可见的
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        tft.setText(tfs.getText());
    }
}
