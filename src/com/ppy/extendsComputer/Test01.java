package com.ppy.extendsComputer;

public class Test01 {
    public static void main(String[] args) {
        PC pc = new PC("Intel", "32", "500", "ASUS");
        pc.printPCInfo();

        NotePad notePad = new NotePad("8 Elit", "16", "512", "white");
        notePad.printNotePadInfo();


    }
}
