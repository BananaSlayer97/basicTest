package sort;

/**
 * @program: basicTest
 * @description:   排序
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 15:07
 **/
public class Sort {

    public static void main(String[] args) {

        int[] a = {1,5,6,8,99,21,36};
        int[] fun = fun(a);
        aLoop(fun);

        // System.out.println(85>>1);
    }

    static  int[] fun(int[] a){
        for (int i= 0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return  a;
    }

    static  void aLoop(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
