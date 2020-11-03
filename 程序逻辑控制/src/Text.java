import java.util.Random;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
/*        //判定一个数字是奇数还是偶数
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("num 是偶数");
        }else {
            System.out.println("num 是奇数");
        }

        //判断一年是否为闰年
        int year = 2020;
        if(year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("闰年");
            }else {
                System.out.println("平年");
            }
        }else {
            if (year % 4 == 0) {
                System.out.println("闰年");
            } else {
                System.out.println("平年");
            }
        }

        //switch(整数|枚举|字符|字符串)
        int day = 1;
        switch (day) {
            case 1:{
                System.out.println("星期一");
                break;
            }
            case 2:{
                System.out.println("星期二");
                break;
            }
            case 3:{
                System.out.println("星期三");
                break;
            }
            default:{
                System.out.println("输入有误！");
                break;
            }
        }

        //while循环
        //打印0-9
        int num1 = 0;
        while (num1 < 10){
            System.out.println(num1);
            num1++;
        }

        //计算1-100的和
        int i = 0;
        int res = 0;
        while (i <= 100) {
            res = res + i;
            i++;
        }
        System.out.println(res);

        //计算5！
        int res1 = 1;
        int i1 = 1;
        while (i1 <= 5) {
            res1 = res1 * i1;
            i1++;
        }
        System.out.println(res1);

        //计算5！+4！+3！+2！+1！
        int n = 1;
        int res3 = 0;
        while (n <= 5) {
            int x = 1;
            int res2 = 1;
            while (x <= n) {
                res2 = res2 * x;
                x++;
            }
            res3 = res3 + res2;
            n++;
        }
        System.out.println(res3);

        //找到100-200中3的倍数
        int num2 = 100;
        while (num2 <= 200) {
            if (num2 % 3 != 0){
                num2++;
                continue;
            }
            System.out.print(num2 + " ");
            //System.out.print(" ");
            num2++;
        }

        //计算 1! + 2! + 3! + 4! + 5!
        int sum = 0;
        for (int j = 1; j <= 5; j++) {
            int tmp = 1;
            for (int k = 1; k <= j; k++) {
                tmp = tmp * k;
            }
            sum = sum + tmp;
        }
        System.out.println(sum);

        int num = 1;
        do {
            System.out.println(num);
            num++;
        }while (num <= 5);

        int a = 10;
        System.out.printf("a=%d", a);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);


        //使用 Scanner 循环读取 N 个数字
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNextDouble()){
            double tmp = scanner.nextDouble();
            sum += tmp;
        }
        System.out.println(sum);
        scanner.close();
*/
        //猜数字
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toGuess = random.nextInt(100);
        while (true){
            int num = scanner.nextInt();
            if (num < toGuess) {
                System.out.println("低了");
            }else if(num > toGuess){
                System.out.println("高了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }

    }
}
