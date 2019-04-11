package mbreza;

import mbreza.Abstract.BatmanFactory;
import mbreza.Abstract.IronManFactory;
import mbreza.Abstract.PopCulture;
import mbreza.Reflection.Apple;
import mbreza.Reflection.Fruit;
import mbreza.Reflection.FruitFactory;
import mbreza.Reflection.Orange;
import mbreza.Simple.GameFactory;
import mbreza.Simple.GameType;
import mbreza.Wytworcza.*;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException,
                                                    NoSuchMethodException, InvocationTargetException {

        FruitFactory appleFactory = FruitFactory.createInstance();
        appleFactory.addFruit("Orange", Orange.class);
        appleFactory.addFruit("Apple", Apple.class);

        Fruit orange = appleFactory.createFruit("Orange");
        orange.getType();

        Fruit apple = appleFactory.createFruit("Apple");
        apple.getType();

        GameFactory gameFactory = GameFactory.createInstance();
        gameFactory.createGame(GameType.FPS).getType();

        BookFactory fantasyBookFactory = FantasyFactory.createInstance();
        Book fantasy = fantasyBookFactory.createBook(BookType.GameOfThrones);
        fantasy.getType();

        BookFactory horrorBookFactory = HorrorFactory.createInstance();
        Book horror = horrorBookFactory.createBook(BookType.It);
        horror.getType();

        PopCulture ironMan = new PopCulture(IronManFactory.createInstance());
        ironMan.getComic().getType();
        ironMan.getMovie().getType();

        PopCulture batman = new PopCulture(BatmanFactory.createInstance());
        batman.getComic().getType();
        batman.getMovie().getType();
    }
}
