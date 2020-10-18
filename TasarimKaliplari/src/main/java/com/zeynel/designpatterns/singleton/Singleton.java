package com.zeynel.designpatterns.singleton;

public class Singleton {
//En basit singleton örneği

    private static Singleton singleton =new Singleton();//Nesne bir kez oluşturulmuş oluyor

    private static int sayac=0;

    private Singleton()
    {
        System.out.println("Ben oluştum");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {//Bu şekilde double checking locking kalıbı denir bunun sayesinde hem lazy loading hem thread safe hem de performans sağlamış oluyoruz.
            synchronized (Singleton.class){//Çok fazla synchronized anahtar sözcüğü olursada bu sefer thread lar birbirini beklerler
                //Multithread ortamlarda senkronizasyonu sağlar.
                if (singleton == null) {//Bu şekilde  yalnızca tek thread olarak düşündük bu şekilde açık oluşuyor.
                    // Multi Thread ortamda çalışırken aynı anda singleton çağrılırsa 2 si null olacak ayrı nesne oluşturacak .Lazy loading yapalım derken açık oluşturmuş olduk.
                    //Bunun çözümü synchronized
                    singleton=new Singleton();
                }
            }
        }


        sayac++;
        System.out.println(sayac);
        return singleton;
    }
}
