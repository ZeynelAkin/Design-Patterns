package com.zeynel.designpatterns.abstractfactory;

public class S8Farbrikasi implements ITelefonFactory {
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model, batarya, en, boy);
    }
}
