package com.bit.demo1;/*
 *@author：Tao
 *@date：2020/12/13
 */

class Bird extends Animal{
    //public String name;

    public Bird(String name) {
        super(name);
    }

    /*public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }*/

    public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}