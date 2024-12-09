package com.ppy.extendsTest;

public class Test {
    public static void main(String[] args) {
        extendsTeacher t = new extendsTeacher();
        t.setSkill("java");
        t.setName("zhangming");
        System.out.println(t.getSkill()+" "+t.getName());
    }
}
