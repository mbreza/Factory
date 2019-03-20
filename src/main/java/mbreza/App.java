package mbreza;

public class App {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();

        Milk milkOne = milkFactory.getMilk("low");
        milkOne.fatPercentage();

        Milk milkTwo = milkFactory.getMilk("high");
        milkTwo.fatPercentage();
    }
}
