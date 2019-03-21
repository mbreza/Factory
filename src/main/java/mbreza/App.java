package mbreza;

import mbreza.Abstract.MilkOrCrispsFactory;
import mbreza.Crisps.Crisps;
import mbreza.Fruit.AppleFactory;
import mbreza.Milk.Milk;
import mbreza.Chocolate.ChocolateFactory;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MilkOrCrispsFactory factory = new MilkOrCrispsFactory();

        Milk milk = (Milk) factory.getFactory("milk").create("low");
        milk.fatPercentage();

        Crisps crisps = (Crisps) factory.getFactory("crisps").create("onion");
        crisps.getFlavour();

        ChocolateFactory chocolateFactory = new ChocolateFactory();

        chocolateFactory.create("white").getType();
        chocolateFactory.create("dark").getType();

        AppleFactory appleFactory = new AppleFactory();
        appleFactory.create("Orange").getType();

    }
}
