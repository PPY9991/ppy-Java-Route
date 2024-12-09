package com.ppy.extendsComputer;

public class PC extends Computer {
    private String brand;

    public PC(String cpu, String ram, String disk, String brand) {
        super(cpu, ram, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printPCInfo() {
        System.out.println(showinfo()+" PC info: " + brand );
    }
}
