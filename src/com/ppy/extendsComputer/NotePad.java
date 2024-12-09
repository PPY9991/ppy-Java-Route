package com.ppy.extendsComputer;

public class NotePad extends Computer {
    public String color;

    public NotePad(String cpu, String ram, String disk, String color) {
        super(cpu, ram, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printNotePadInfo() {
        System.out.println(showinfo() + " color: " + color);
    }
}
