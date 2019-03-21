package mbreza.Abstract;

import mbreza.Crisps.CrispsFactory;
import mbreza.Milk.MilkFactory;

public class MilkOrCrispsFactory {

    public static AbstractFactory getFactory(String choice){

    if("Milk".equalsIgnoreCase(choice)){
        return new MilkFactory();
    } else if("Crisps".equalsIgnoreCase(choice)){
        return new CrispsFactory();
    }
    return null;
}

}
