package com.ppy.teacherTest;

public class Teacher {
    private String name;
    private int age;
    private String schoolName;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this(name, age, "家里蹲");
    }

    public Teacher(String name, int age, String schoolName) {
        this.age = age;
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
