package swing;

import javax.swing.*;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 11:51
 **/
public class JOptionPaneUse {

    public static void main(String[] args) {
        int anwser = JOptionPane.showConfirmDialog(null,"are you sure exit?","yes",JOptionPane.YES_NO_CANCEL_OPTION);

        System.out.println(anwser);
    }
}
