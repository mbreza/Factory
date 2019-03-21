package mbreza.Milk;

import mbreza.Abstract.AbstractFactory;

public class MilkFactory implements AbstractFactory<Milk> {

    @Override
    public Milk create (String milkType){

         if(milkType.equals("low")){
            return new MilkLow();
        } else if(milkType.equals("high")){
            return new MilkHigh();
        }
        return null;
    }

}
