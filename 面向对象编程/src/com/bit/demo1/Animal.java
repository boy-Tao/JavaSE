package com.bit.demo1;/*
 *@author：Tao
 *@date：2020/12/13
 */

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}