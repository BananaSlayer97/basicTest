package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 19:44
 **/
public class MyWindow extends JFrame implements ItemListener {

    JTextArea text;
    JCheckBox[] box;
    String[] boxName = {"zane", "li", "wang"};

    MyWindow(String s) {
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(1, 2));

        setLocation(100, 100);
        JPanel panel = new JPanel();
        int len = boxName.length;

        panel.setLayout(new GridLayout(len, 1));
        box = new JCheckBox[len];
        for (int i = 0; i < len; i++) {
            box[i] = new JCheckBox(boxName[i], false);
            box[i].addItemListener(this);
            panel.add(box[i]);
        }
        text = new JTextArea(4, 10);
        con.add(panel);
        con.add(text);
        setVisible(true);
        pack();

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        text.setText(null);

        for (int i = 0; i < box.length; i++) {
            if (box[i].isSelected()) {
                text.append(boxName[i] + "被选中in ========");
            } else {
                text.append(boxName[i] + "没有被选中ln =========");
            }
        }
    }
}
