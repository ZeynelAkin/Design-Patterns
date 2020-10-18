package com.zeynel.designpatterns.prototype;

public class GenelEntityService {

    public BelgeTuru findBelgeTuruId(Long id)
    {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        BelgeTuru belgeTuru=new BelgeTuru();
        belgeTuru.setId(id);

        String ad;
        if (id.compareTo(1L)==0)
        {
            ad="Kişisel";
        }else if (id.compareTo(2L)==0)
        {
            ad="kurumsal";
        }else
        {
            ad="Genel";
        }
        belgeTuru.setAd(ad);

        return belgeTuru;
    }

    public Kategori findKategoriId(Long id)
    {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Kategori kategori=new Kategori();
        kategori.setId(id);

        String ad;
        if (id.compareTo(1L)==0)
        {
            ad="Özel";
        }else if (id.compareTo(2L)==0)
        {
            ad="İş";
        }else
        {
            ad="Genel";
        }
        kategori.setAd(ad);

        return kategori;
    }

    public Belge findBelgeId(Long id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Belge belge=new Belge();
        belge.setId(id);
        belge.setBelgeTuru(findBelgeTuruId(id));
        belge.setKategori(findKategoriId(id));

        String ad;
        String veri;

        if(id.compareTo(1L)==0)
        {
            ad="Mektup";
            veri="Sevgili Dostum Büşra";
        }else if (id.compareTo(2L)==0) {
            ad="rapor";
            veri="Bu rapor genel müdüre verilecek";
        }else
        {
            ad="Trafik Kuralları";
            veri="Sağa dönüşte yayaya yol ver";
        }
        belge.setAd(ad);
        belge.setVeri(veri);

        return belge;
    }

}
