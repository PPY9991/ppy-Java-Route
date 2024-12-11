package com.ppy.InterfaceTest;

import java.util.ArrayList;

public class interfaceomply01 implements AService {
    @Override
    public void printinfo(ArrayList<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu);
        }
    }

    @Override
    public void printavg(ArrayList<Student> stuList) {
        double sum = 0;
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            sum += stu.getScore();
        }
        double avg = sum / stuList.size();
        System.out.println("average" + avg);

    }
}
