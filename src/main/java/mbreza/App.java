package mbreza;

import mbreza.Abstract.MilkOrCrispsFactory;
import mbreza.Crisps.Crisps;
import mbreza.Milk.Milk;

public class App {
    public static void main(String[] args) {
        MilkOrCrispsFactory factory = new MilkOrCrispsFactory();

        Milk milk = (Milk) factory.getFactory("milk").create("low");
        milk.fatPercentage();

        Crisps crisps = (Crisps) factory.getFactory("crisps").create("onion");
        crisps.getFlavour();
    }
}
