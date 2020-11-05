public class Homework {
    public static void main(String[] args) {
        int num = 1234;
        print(num);
        System.out.println();

        System.out.println(sum(10));

        System.out.println(sum1(1729));

        System.out.println(fib(8));
        System.out.println(fib1(8));

        System.out.println(climbStairs(45));
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void print(int num){
        if (num > 9) {
            print(num / 10);
        }
        System.out.print(num % 10);
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    // 输入一个非负整数,返回组成它的数字之和.例如,输入1729,则应该返回1+7+2+9,它的和是19
    public static int sum1(int n){
        if (n < 9){
            return n;
        }
        return n % 10 + sum1(n / 10);
    }

    //求斐波那契数列的第 N 项
    public static int fib(int n){
        if (n == 1 || n == 2 ){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //循环求斐波那契数第 N 项
    public static int fib1(int n){
        int num1 = 1;
        int num2 = 1;
        int num = 0;
        for (int i = 3; i <= n ; i++) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
        return num;
    }

    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }




}




