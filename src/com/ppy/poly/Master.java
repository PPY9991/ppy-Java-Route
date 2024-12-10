package com.ppy.poly;

public class Master {
    private String masterName;

    public Master(String masterName) {
        this.masterName = masterName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void feed(Animal animal, Food food) {
        System.out.println("Master " + masterName + " feed " + animal.getName() + " " + food.getName());
    }
    /*
     master feed dog bone
    public void feed(Dog dog,Bone bone){
        System.out.println("master: "+masterName+" feed: " +dog.getName()+" bone: "+bone.getName());
    }
    */
}
