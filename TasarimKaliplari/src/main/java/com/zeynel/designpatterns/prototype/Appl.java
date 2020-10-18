package com.zeynel.designpatterns.prototype;

import java.util.Date;

public class Appl {

    public static void main(String[] args) {
        GenelEntityService genelEntityService = new GenelEntityService();

        long id1=1L;

        Date ilkTarih=new Date();
        Belge belge1=genelEntityService.findBelgeId(id1);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);

//        Date date=new Date();
//        Belge belge2=genelEntityService.findBelgeId(2L);
//        belgeyiVeSaniyeFarkiniYazdir(date, belge2);

        Date ilkDate1=new Date();
        Belge belgeClone= null;
        try {
            belgeClone =belge1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Date sonDate1=new Date();

        belgeClone.setAd("Günlük");
        belgeClone.setVeri("Sevgili Günlük");
        belgeClone.getBelgeTuru().setAd("kişisel 2 ");//Prototype Design Pattern sayesinde d maliyetli nesneleri daha az maliyetle oluşturmuş olduk.Shallow (yüzeysel) klonlamayı da halletmiş olduk.

        belgeyiVeSaniyeFarkiniYazdir(ilkDate1,belgeClone);

        System.out.println(belge1);
    }

    private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();

        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);

        System.out.println(belge1);
        System.out.println(saniyeFarki);
        System.out.println("\n");
    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long has=1000;
        long saniyeFerki=(sonTarih.getTime()/has)-(ilkTarih.getTime()/has);
        return saniyeFerki;
    }
}
