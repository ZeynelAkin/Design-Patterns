package com.zeynel.designpatterns.abstractfactory;

public class Note8Fabrikasi implements ITelefonFactory{
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
