package thread.proxy;

/**
 * @program: basicTest
 * @description: 静态代理测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 09:48
 **/
public class StaticProxy {

    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new Man("张飞"));
        weddingCompany.happyMarry();
    }

}

/**
 * 结婚接口
 */
interface  Marry{

    void happyMarry();
}

class Man implements  Marry{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void happyMarry() {
        System.out.println(name+"要结婚了");
    }
}


/**
 * 婚庆公司，帮助你结婚
 */
class  WeddingCompany implements Marry{

    /**
     * 代理真实目标
     */
    private Marry marry;

    public WeddingCompany(Marry marry) {
        this.marry = marry;
    }

    @Override
    public void happyMarry() {
            before();
            //真实对象结婚
            marry.happyMarry();
            after();

    }

    private void before(){
        System.out.println("结婚前！");
    }

    private void after(){
        System.out.println("结婚后！");
    }

}