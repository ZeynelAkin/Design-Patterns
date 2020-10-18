package com.zeynel.designpatterns.builder;

public class Emlakci2 {
    public static void main(String[] args) {
        Ev ev1 = EvBuilder.startNormalBuild("İstabul","başakşehir","kayabaşı",2020,44)
                .setHasCocukParki(true)
                .setHasOtopark(false)
                .setTuvaletSayisi(22)
                .build();

        Ev ev2 = EvBuilder.startHavuzluBuild("İstabul","başakşehir","kayabaşı",2020,44)
                .setHasCocukParki(true)
                .setHasOtopark(false)
                .setTuvaletSayisi(22)
                .build();

        printEv(ev1);
        printEv(ev2);
    }

    private static void printEv(Ev ev)
    {
        System.out.println();
        System.out.println("Ev Eklendi : "+ev);
        System.out.println();
    }
}
