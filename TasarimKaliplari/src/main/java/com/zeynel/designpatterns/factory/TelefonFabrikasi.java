package com.zeynel.designpatterns.factory;

public class TelefonFabrikasi { //static metodu üzerinden kendisinin oluşturmasını gerek olmadan getTelefon metodu kullanarak bize verilen modele ait bilgileri oluşturarak
    public static ITelefon getTelefon(String model,String batarya,int en,int boy)
    {
        ITelefon iTelefon;
        if("S8".equalsIgnoreCase(model))//ignorcase küçük/büyük harf duyarlılığı
        {
            iTelefon=new S8(model, batarya, en, boy);
        }else if ("Note8".equalsIgnoreCase(model))
        {
            iTelefon=new Note8(model, batarya, en, boy);
        }else
        {
            throw new RuntimeException("Geçerli Bir model değil");
        }

        return iTelefon;
    }
}
