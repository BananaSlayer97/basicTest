package question;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 20:19
 **/
class Tree {
    String n;boolean isT;
    Tree(String name, boolean t) {
        n = name;
        isT = t;

    }
    public void printTree(String str){
        System.out.println();
        System.out.print(str);
        System.out.print("Name:"+n+",");
        System.out.print(" is Tree:"+isT);
    }
}
class Poplar extends Tree {
    public boolean isP;
    Poplar(String n, boolean f, boolean c) {
        super(n, f);
        isP = c;
    }
    @Override
    public void printTree(String str) {
        super.printTree(str);
        System.out.println(", Coni:" + isP);
    }
}

public class Test30 {
    public static void main(String[] args) {
        Tree tOb1 = new Tree("Cabbage", false);
        Poplar tOb2 = new Poplar("Poplar", true, true);
        tOb1.printTree("cabbage:");
        tOb2.printTree("poplar:");
    }
}

