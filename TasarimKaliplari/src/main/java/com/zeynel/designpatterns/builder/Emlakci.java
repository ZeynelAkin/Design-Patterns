package com.zeynel.designpatterns.builder;

public class Emlakci {
    public static void main(String[] args) {
        Ev ev1=new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlce("Ataşehir");
        ev1.setMahalle("Atatürk");
        ev1.setOdaSayisi(3);
        ev1.setBinaYil(2010);
        ev1.setHasKlima(true);

        Ev ev2=new Ev("İstanbul","Başakşehir","Kayabaşı",2014,4,5,3
        ,2,true,true,true,false,true,true);
        printEv(ev1);
        printEv(ev2);
    }

    private static void printEv(Ev ev)
    {
        System.out.println();
        System.out.println("Ev Eklendi"+ev);
        System.out.println();
    }
}
