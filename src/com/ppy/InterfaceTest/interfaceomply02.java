package com.ppy.InterfaceTest;

import java.util.ArrayList;

public class interfaceomply02 implements AService {
    @Override
    public void printinfo(ArrayList<Student> stuList) {
        int man = 0;
        int woman = 0;
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu);
            if ("man".equals(stu.getName())) {
                man++;
            } else {
                woman++;
            }
        }
        System.out.println("man:" + man);
        System.out.println("woman:" + woman);
    }

    @Override
    public void printavg(ArrayList<Student> stuList) {
        double sum = 0;
        double max = stuList.get(0).getScore();
        double min = stuList.get(0).getScore();
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            sum += stu.getScore();
            if (stu.getScore() > max) {
                max = stu.getScore();
            }
            if (stu.getScore() < min) {
                min = stu.getScore();
            }
        }
        double avg = (sum - max - min) / (stuList.size() - 2);
        System.out.println("average" + avg);

    }
}
