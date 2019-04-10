package mbreza.Reflection;

public class FruitFactory {

    public Fruit create(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("mbreza.Reflection."+name);
        Fruit fruit = (Fruit) c.newInstance();
        return fruit;
    }

}
