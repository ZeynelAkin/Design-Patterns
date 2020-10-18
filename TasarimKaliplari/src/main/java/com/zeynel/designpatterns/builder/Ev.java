package com.zeynel.designpatterns.builder;

public class Ev {

   private String il;
   private String ilce;
   private String mahalle;

   private int binaYil;
   private int banlkonSayisi;
   private int odaSayisi;
   private int banyoSayisi;
   private int tuvaletSayisi;

   private boolean isDublex;
   private boolean isEsyali;
   private boolean hasOtopark;
   private boolean hasCocukParki;
   private boolean hasKlima;
   private boolean hasHavuz;

    public Ev() {
    }

    public Ev(String il, String ilce, String mahalle, int binaYil, int banlkonSayisi, int odaSayisi, int banyoSayisi, int tuvaletSayisi, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki, boolean hasKlima, boolean hasHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.binaYil = binaYil;
        this.banlkonSayisi = banlkonSayisi;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.hasOtopark = hasOtopark;
        this.hasCocukParki = hasCocukParki;
        this.hasKlima = hasKlima;
        this.hasHavuz = hasHavuz;
    }



    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYil=" + binaYil +
                ", banlkonSayisi=" + banlkonSayisi +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                ", hasKlima=" + hasKlima +
                ", hasHavuz=" + hasHavuz +
                '}';
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getBinaYil() {
        return binaYil;
    }

    public void setBinaYil(int binaYil) {
        this.binaYil = binaYil;
    }

    public int getBanlkonSayisi() {
        return banlkonSayisi;
    }

    public void setBalkonSayisi(int banlkonSayisi) {
        this.banlkonSayisi = banlkonSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isHasCocukParki() {
        return hasCocukParki;
    }

    public void setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }
}
