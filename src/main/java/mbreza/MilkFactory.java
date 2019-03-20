package mbreza;

public class MilkFactory {

    public Milk getMilk (String milkType){
         if(milkType.equals("low")){
            return new MilkLow();
        } else if(milkType.equals("high")){
            return new MilkHigh();
        }
        return null;
    }

}
