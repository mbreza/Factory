package mbreza.Chocolate;

import java.io.Serializable;

public class ChocolateFactory implements Serializable {

    private static Chocolate instance = null;

    public Chocolate create(String chocolateType) {
        if (instance == null) {
            synchronized (ChocolateFactory.class) {
                if(instance == null) {
                    if (chocolateType.equals("white")) {
                        instance =  new WhiteChocolate();
                    } else if (chocolateType.equals("dark")) {
                        instance =  new DarkChocolate();
                    }
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return create("");
    }

}
