package mbreza;

import mbreza.Reflection.Apple;
import mbreza.Reflection.Fruit;
import mbreza.Reflection.FruitFactory;
import mbreza.Reflection.Orange;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReflectionTest {

    FruitFactory fruitFactory;

    @Before
    public void setup(){
        fruitFactory = FruitFactory.createInstance();
    }

    @Test
    public void addFruitTest() {
        fruitFactory.addFruit("Orange", Orange.class);
        assertTrue(fruitFactory.getFruitTypes().containsKey("Orange"));
        assertTrue(fruitFactory.getFruitTypes().containsValue(Orange.class));
    }

    @Test
    public void createFruitTest() throws InvocationTargetException, NoSuchMethodException,
                                        InstantiationException, IllegalAccessException {
        fruitFactory.addFruit("Apple", Apple.class);
        Fruit apple = fruitFactory.createFruit("Apple");
        assertEquals(apple.getType(), "Apple");
    }
}
