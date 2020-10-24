## InputStream 字节输入流
   - InputStream 为字节输入流，它本身为一个抽象类，必须依靠其子类实现各种功能，
   - 此抽象类是表示字节输入流的所有类的超类，继承自InputStream 的流都是向程序中输入数据的，
   - 且数据单位为字节（8bit）
   - InputStream是输入字节数据用的类，所以InputStream类提供了3种重载的read方法
   - Inputstream类中的常用方法：
     
      　　（1） public abstract int read( )：读取一个byte的数据，返回值是高位补0的int类型值。若返回值=-1说明没有读取到任何字节读取工作结束。
     
      　　（2） public int read(byte b[ ])：读取b.length个字节的数据放到b数组中。返回值是读取的字节数。该方法实际上是调用下一个方法实现的
     
      　　（3） public int read(byte b[ ], int off, int len)：从输入流中最多读取len个字节的数据，存放到偏移量为off的b数组中。
     
      　　（4） public int available( )：返回输入流中可以读取的字节数。
               注意：若输入阻塞，当前线程将被挂起，如果InputStream对象调用这个方法的话，它只会返回0，
               这个方法必须由继承InputStream类的子类对象调用才有用，
     
     　　（5） public long skip(long n)：忽略输入流中的n个字节，返回值是实际忽略的字节数, 跳过一些字节来读取
     
      　　（6） public int close( ) ：我们在使用完后，必须对我们打开的流进行关闭.
     
### 主要的子类：
  - 1） FileInputStream：把一个文件作为InputStream，实现对文件的读取操作               
  - 2） ByteArrayInputStream：把内存中的一个缓冲区作为InputStream使用         
  - 3） StringBufferInputStream：把一个String对象作为InputStream            
  - 4） PipedInputStream：实现了pipe的概念，主要在线程中使用             
  - 5） SequenceInputStream：把多个InputStream合并为一个InputStream