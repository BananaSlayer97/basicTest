package keyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @program: basicTest
 * @description: KeyListener 是java 中的一个接口，用于接收键盘事件（击键）的侦听器接口。
 * 旨在处理键盘事件的类要么实现此接口（及其包含的所有方法），要么扩展抽象KeyAdapter 类（仅重写有用的方法）。
 * 然后使用组件的addKeyListener 方法将从该类所创建的侦听器对象向该组件注册。按下、释放或键入键时生成键盘事件。
 * 然后调用侦听器对象中的相关方法并将该KeyEvent 传递给它
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 17:32
 **/
public class KeyListenerUse extends JFrame implements KeyListener {



    /**
     * 实现KeyListener接口，要重写其所有方法，为事件源注册监听
     *
     * @param args
     */
    private static JPanel jp = new JPanel();
    private int x;
    private int y;

    public KeyListenerUse(int x, int y) {
        this.x = x;
        this.y = y;
        this.add(jp);

        this.setSize(400, 300);
        // 防止内存泄露
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        KeyListenerUse rb = new KeyListenerUse(100, 200);
        // 前一个rt为事件源，后一个rt为监听者
        rb.addKeyListener(rb);
    }

    @Override
    public void paint(Graphics g) {
        // 下面这句话不加就成了画笔了哦
        // super.paint(g);
        g.fillOval(this.x, this.y, 8, 8);

    }

    /**
     *  键入键执行的操作
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "你键入了一个键");
    }

    /**
     *     按下键执行的操作
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }
        this.repaint();
    }

    /**
     * 松开键执行的操作
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "你松开了键");
    }


}
