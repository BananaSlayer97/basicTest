### ​BigDecimal
   - Java在java.math包中提供的API类BigDecimal，用来对超过16位有效位的数进行精确的运算
   - 双精度浮点型变量double可以处理16位有效数，但在实际应用中，可能需要对更大或者更小的数进行运算和处理。
   - 一般情况下，对于那些不需要准确计算精度的数字，我们可以直接使用Float和Double处理，但是Double.valueOf(String) 和Float.valueOf(String)会丢失精度
   - float 处理8位小数点，double 处理 16位小数点。如果数值太大，会出现字母类型的值， BigDecimal 则会一直不会变，给什么出什么。
   - 参数类型为double的构造方法的结果有一定的不可预知性.
   - String 构造方法是完全可预知的：写入 newBigDecimal(“0.1”) 将创建一个 BigDecimal，它正好等于预期的 0.1。因此，比较而言， 通常建议优先使用String构造方法。
   - 当double必须用作BigDecimal的源时，请注意，此构造方法提供了一个准确转换；
   - 它不提供与以下操作相同的结果：先使用Double.toString(double)方法，然后使用BigDecimal(String)构造方法，将double转换为String。
   - 要获取该结果，请使用static valueOf(double)方法。

### BigDecimal常用方法
   - 看代码

### BigDecimal格式化
   - 由于NumberFormat类的format()方法可以使用BigDecimal对象作为其参数，可以利用BigDecimal对超出16位有效数字的货币值，百分值，以及一般数值进行格式化控制。
     
   - 以利用BigDecimal对货币和百分比格式化为例。
   - 首先，创建BigDecimal对象，进行BigDecimal的算术运算后，分别建立对货币和百分比格式化的引用，最后利用BigDecimal对象作为format()方法的参数，输出其格式化的货币值和百分比。
     
   - NumberFormat ： 处理数值
   - DecimalFormat： 控制小数点


##总结
  -  在需要精确的小数计算时再使用BigDecimal，BigDecimal的性能比double和float差，在处理庞大，复杂的运算时尤为明显。故一般精度的计算没必要使用BigDecimal。
  -  尽量使用参数类型为String的构造函数。
  -  BigDecimal都是不可变的（immutable）的， 在进行每一次四则运算时，都会产生一个新的对象 ，所以在做加减乘除运算时要记得要保存操作后的值。