public class Text {
    public static void main(String[] args) {
/*
        //1.整形变量 int 4字节；
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue+1);
        System.out.println(minValue-1);

        //2.长整形变量 long 8字节；
        long num = 10L;
        System.out.println(num);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //3.双精度浮点型变量 double 8字节；
        double num1 = 1.0;
        System.out.println(num1);

        int a = 1;
        int b = 2;
        System.out.println((double) a / b);

        //4.单精度浮点型变量 float 4字节； （不太推荐）
        float num2 = 1.0f;   //1.0F 也行

        //5.字符类型变量 char 2字节；
        char ch = 'A';
        char ch1 = '哈';    //在执行javac时加上 -encoding UTF-8 选项即可
        System.out.println(ch);
        System.out.println(ch1);

        //6.字节类型变量 byte 1字节；
        byte value = 1;
        System.out.println(value);

        //7.短整形变量 short 2字节；
        short value1 = Short.MAX_VALUE;
        System.out.println((short)(value1+1));

        //8.布尔类型变量 boolean 1字节；
        boolean value2 = true;
        System.out.println(value2);

        //字符串类型变量 String 引用类型；
        String name = "chang";
        System.out.println(name);
        String name1 = "My name is \"张三\" ";
        System.out.println(name1);

        String a1 = "hello";
        String b1 = "world!";
        String str = a1 + b1;
        System.out.println(str);

        String str1 = "res = ";
        int a2 = 10;
        int b2 = 20;
        String result = str1+a2+b2;
        System.out.println(str1+10+20);

        System.out.println("a = " + 10 + ", b = " + 20);

        //常量
        int fin = 0100;  //int字面值常量（八进制，以开头）；
        System.out.println(fin);

        final int d = 10;  //final关键字修饰的常量

        //类型转换
        int a3 = 10;
        double b3 = 20.0;
        double c3 = a3 + b3;
        System.out.println(c3);

        byte a4 = 10;
        byte b4 = 20;
        byte c4 = (byte)(a4 + b4);
        System.out.println(c4);

        double m = 10;
        long n = 50;
        m = n;
        System.out.println(m);
        System.out.println("------------------");
*/
        //运算符
        int a5 = 1;
        int b5 = 2;
        System.out.println((double)a5/b5);  // int/int结果还是int, 需要用double来计算

        System.out.println(11.5 % 2.0);

        int p = 10;
        int q = ++p;
        System.out.println(q);
        int i = p++;
        System.out.println(i);
        System.out.println(p);

        int a6 = 10;
        int b6 = 20;
        System.out.println(!(a6 < b6));

        System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false，左边为false,不用再求右边；
        System.out.println(10 < 20 || 10 / 0 == 0); // 打印 true，左边为true，不用再求右边。
        //& 和 | 不适合短路求值。

        //位运算符
        //Java 中对数据的操作的最小单位不是字节, 而是二进制位.
        int a = 15;
        int b = 20;
        System.out.println(15 | 20);

        //三目运算符  表达式1 ? 表达式2 : 表达式3
        System.out.println(a > b ? a : b);

    }
}
