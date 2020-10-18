package com.zeynel.designpatterns.factory;

public class TelefonBayi {
    public static void main(String[] args) {
       ITelefon s8= TelefonFabrikasi.getTelefon("s8","2600mah",4,7);
       ITelefon note8=TelefonFabrikasi.getTelefon("note8","5600mah",6,8);

        System.out.println("S8 için tel özellikleri");
        System.out.println(s8);
        System.out.println("Note8 için tel özellikleri");
        System.out.println(note8);
    }
}
