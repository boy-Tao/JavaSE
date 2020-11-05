public class Text {
    public static void main(String[] args) {
        //方法的定义
        int ret = add(1,2);
        System.out.println(ret);

        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            sum = sum + factor(i);
        }
        System.out.println(sum);

        int n = 5;
        System.out.println(factor2(n));
    }

    public static int factor2(int n) {
        System.out.println("函数开始：n = " + n);
        if (n == 1){
            System.out.println("函数结束：n = 1 ret = 1");
            return 1;
        }
        int ret = n * factor2(n-1);
        System.out.println("函数结束：n = " + n + "ret = " + ret);
        return ret;
    }

    //代码示例: 计算 1! + 2! + 3! + 4! + 5!
    public static int factor(int i) {
        int res = 1;
        for (int j = 1; j <= i ; j++) {
            res = res * j;
        }
        return res;
    }

    public static int add(int x, int y) {
        return x+y;
    }

    //递归思想

}
