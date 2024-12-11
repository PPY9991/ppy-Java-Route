package com.ppy.InterfaceTest;

import java.util.ArrayList;

public class TestInterface {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("ppy", 45, "girl"));
        stuList.add(new Student("zdf", 52, "girl"));
        stuList.add(new Student("foc", 34, "middle"));
        stuList.add(new Student("xme", 55, "man"));

        interfaceomply02 interfaceomply02 = new interfaceomply02();
        interfaceomply02.printinfo(stuList);

        System.out.println("=======================");

        interfaceomply02.printavg(stuList);

    }
}
