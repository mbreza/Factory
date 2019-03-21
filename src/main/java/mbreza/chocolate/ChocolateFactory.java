package mbreza.chocolate;

import mbreza.Crisps.Crisps;
import mbreza.Crisps.CrispsOnion;
import mbreza.Crisps.CrispsPapirka;

public class ChocolateFactory {

    public Chocolate create(String chocolateType) {
        if(chocolateType.equals("white")){
            return new WhiteChocolate();
        } else if(chocolateType.equals("dark")){
            return new DarkChocolate();
        }
        return null;
    }

}
