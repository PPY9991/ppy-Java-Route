package com.ppy.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master ppy = new Master("ppy");
        Dog ccl = new Dog("ccl");
        Bone bone1 = new Bone("大棒骨🦴");
        ppy.feed(ccl, bone1);

        System.out.println("===========++++=======");

        Cat tom = new Cat("Tom");
        Fish fish = new Fish("三文鱼🐟");
        ppy.feed(tom, fish);
        System.out.println("=========++++++=======");
        //pig eat rice
        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("剩米饭🍚");
        ppy.feed(pig, rice);
        System.out.println("=========++++++++======");

    }
}
