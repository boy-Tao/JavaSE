//字段和方法
/*class Person{
    public String name = "张三";
    public int age = 20;
    public String sex = "男";

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void show(){
        System.out.println("我叫" + name + "，今年" + age);
    }
}

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.sleep();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
        person.show();
        Person person2 = new Person();
        person2.name = "李四";
        person2.age = 18;
        person2.show();
    }
}*/

//static 关键字
/*class TestDemo {
    public int a = 1;
    public static int b = 1;
    public static int count;
    public static void change(){
        count = 100;
        //a = 10; error 不可以访问非静态数据成员
    }
}
public class Test{
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.a++);
        System.out.println(TestDemo.b++);
        System.out.println("======================");
        TestDemo testDemo1 = new TestDemo();
        System.out.println(testDemo1.a);
        System.out.println(TestDemo.b);
        TestDemo.change();
        System.out.println(TestDemo.count);
    }
}*/

//小结
/*class Person{
    public  String name;
    public  int age;
    public  String sex;
    public static int count;
    public final int SIZE = 10;
    public static final int COUNT = 99;

    public void eat(){
        int a = 10; //局部变量
        System.out.println("吃饭!");
    }

    public void sleep(){
        System.out.println("睡觉!");
    }

    public static void staticTest(){
        System.out.println("staticTest()!");
    }
}
public class Test{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
        System.out.println(person.SIZE);
        System.out.println(Person.count);
        System.out.println(Person.COUNT);
        person.eat();
        person.sleep();
        Person.staticTest();
    }
}*/

//private 实现封装
/*class Person{
    private String name = "张三";
    private int age = 18;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("我叫" + name + "，" + "今年" + age);
    }
}
public class Test{
    public static void main(String[] args) {
        Person person = new Person();
        //System.out.println("我叫" + person.name + "，" + "今年" + person.age);
        person.show();
        System.out.println(person.getName());
        person.setName("李四");
        person.show();
    }
}*/

//构造方法
/*class Person{
    private String name = "张三";
    private int age = 18;
    private String sex;

    public Person(){
        this("BIN",22,"男");
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
        System.out.println("我叫" + name + "，" + "今年" + age);
    }
}

public class Test{
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        Person person1 = new Person("Bin",19,"男");
        person1.show();
    }
}*/

//代码块
//静态代码块(只执行一次) > 实例代码块(构造块) > 构造函数
/*class Person {
    private String name = "张三";
    private int age = 18;
    private String sex;
    private static int count = 0;

    public Person(){
        System.out.println("FPX牛逼！");
    }

    {
        this.name = "Rookie";
        this.age = 24;
        this.sex = "男";
        System.out.println("IG牛逼！");
    }

    static {
        count = 10;
        System.out.println("LPL牛逼！");
    }

    public void show() {
        System.out.println("name:" + name + " age" + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class Test{
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        System.out.println(person);
    }
}*/

//匿名对象
class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void print() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}');
    }
}

public class Test{
    public static void main(String[] args) {
        new Person("宋义进",25,"男").print();
    }
}





