class Calculator{
    private double num1;
    private double num2;

    public Calculator(double a,double b){
        this.num1 = a;
        this.num2 = b;

        double tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    /*public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(){
        return this.num1 + this.num2;
    }
    public double sub(){
        return this.num1 - this.num2;
    }
    public double mul(){
        return this.num1 * this.num2;
    }
    public double div(){
        return this.num1 / this.num2;
    }

    public Calculator(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(this.num1 + this.num2);
        System.out.println(this.num1 - this.num2);
        System.out.println(this.num1 * this.num2);
        System.out.println(this.num1 / this.num2);
    }*/
}
public class HomeWork {
    public static void main(String[] args) {
        /*Calculator calculator = new Calculator();
        calculator.setNum1(6);
        calculator.setNum2(3);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());*/
        //Calculator calculator = new Calculator(6,3);
        /*Calculator calculator = new Calculator();
        calculator.fun(2,9);*/
        double a1 = 8.0;
        double b1 = 9.0;
        Calculator calculator = new Calculator(a1,b1);
        a1 = calculator.getNum1();
        b1 = calculator.getNum2();
        System.out.println(a1 + " " + b1);

        /*int a = 8;
        int b = 6;
        change(a,b);
        System.out.println(a + " " + b);*/
    }
    /*public static void change(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }*/
}


