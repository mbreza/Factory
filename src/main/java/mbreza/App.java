package mbreza;

import mbreza.Abstract.BatmanFactory;
import mbreza.Abstract.IronManFactory;
import mbreza.Abstract.PopCulture;
import mbreza.Reflection.FruitFactory;
import mbreza.Simple.GameFactory;
import mbreza.Simple.GameType;
import mbreza.Wytworcza.*;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        FruitFactory appleFactory = new FruitFactory();
        appleFactory.create("Orange").getType();

        //wszystko ok
        GameFactory gameFactory = GameFactory.createInstance();
        gameFactory.createGame(GameType.FPS).getType();

        //wszystko ok
        BookFactory fantasyBookFactory = FantasyFactory.createInstance();
        Book fantasy = fantasyBookFactory.createBook(BookType.GameOfThrones);
        fantasy.getType();

        //wszystko ok
        BookFactory horrorBookFactory = HorrorFactory.createInstance();
        Book horror = horrorBookFactory.createBook(BookType.It);
        horror.getType();

        //wszystko ok
        PopCulture ironMan = new PopCulture(IronManFactory.createInstance());
        ironMan.getComic().getType();
        ironMan.getMovie().getType();

        //wszystko ok
        PopCulture batman = new PopCulture(BatmanFactory.createInstance());
        batman.getComic().getType();
        batman.getMovie().getType();
    }
}
