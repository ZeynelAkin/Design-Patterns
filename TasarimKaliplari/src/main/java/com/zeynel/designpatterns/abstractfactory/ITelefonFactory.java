package com.zeynel.designpatterns.abstractfactory;

public interface ITelefonFactory {

    ITelefon getTelefon(String model,String batarya,int en,int boy);

}
