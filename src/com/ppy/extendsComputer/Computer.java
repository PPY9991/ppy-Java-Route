package com.ppy.extendsComputer;

public class Computer {
    public String cpu;
    public String ram;
    public String disk;

    public Computer(String cpu, String ram, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public String showinfo() {
        return "cpu:" + cpu + " ram: " + ram + " disk: " + disk;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
