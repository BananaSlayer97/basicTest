package serialize;

import java.io.*;

/**
 * @program: basicTest
 * @description: 练习序列化
 * @author: 全栈者也
 * @create: 2020 - 10 - 01 19:02
 **/
public class SerializableTest {

    public static void main(String[] args) throws Exception {
        serializeFlyPig();
        FlyPig flyPig = deserializeFlyPig();
        System.out.println(flyPig.toString());

    }

    /**
     * 进行序列化
     * @throws IOException
     */
    static void serializeFlyPig() throws IOException {

        FlyPig flyPig = new FlyPig();
        flyPig.setColor("black");
        flyPig.setName("jack");
        flyPig.setCar("0000");

        // ObjectOutputStream 对象输出流，将 flyPig 对象存储到E盘的 flyPig.txt 文件中，完成对 flyPig 对象的序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/flyPig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();

    }

    /**
     * 反序列化
     * @return
     * @throws Exception
     */
    static FlyPig deserializeFlyPig() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/flyPig.txt")));
        FlyPig person = (FlyPig) ois.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        return person;
    }

}