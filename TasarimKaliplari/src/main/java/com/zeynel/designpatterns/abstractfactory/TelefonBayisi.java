package com.zeynel.designpatterns.abstractfactory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Farbrikasi s8Farbrikasi = new S8Farbrikasi();
        ITelefon s8 = s8Farbrikasi.getTelefon("s8", "2600mah", 5, 8);

        Note8Fabrikasi note8Fabrikasi=new Note8Fabrikasi();
        ITelefon note8 = note8Fabrikasi.getTelefon("Note8", "3000mah", 3, 5);

        System.out.println(s8);
        System.out.println(note8);
    }
}
