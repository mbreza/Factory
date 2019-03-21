package mbreza.Fruit;

public class AppleFactory {

    public Fruit create(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("mbreza.Fruit."+name);
        Fruit fruit = (Fruit) c.newInstance();
        return fruit;
    }

}
