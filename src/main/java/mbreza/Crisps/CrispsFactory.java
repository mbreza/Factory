package mbreza.Crisps;

import mbreza.Abstract.AbstractFactory;

public class CrispsFactory implements AbstractFactory<Crisps> {

    @Override
    public Crisps create(String crispsType) {
        if(crispsType.equals("onion")){
            return new CrispsOnion();
        } else if(crispsType.equals("paprika")){
            return new CrispsPapirka();
        }
        return null;
    }
}
