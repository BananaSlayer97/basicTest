package org.example;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 12 - 03:15:11
 */
public class Bclass extends Aclass {
    void go() {
        System.out.println("Bclass");
    }
    public static void main(String args[]) {
        Aclass a = new Aclass();
        Aclass a1 = new Bclass();
        a.go();
        a1.go();
    }
}
class Aclass {
    void go() {
        System.out.println("Aclass");
    }
}
