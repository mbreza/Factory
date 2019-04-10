package mbreza;

import mbreza.Abstract.BatmanFactory;
import mbreza.Abstract.IronManFactory;
import mbreza.Abstract.PopCulture;
import mbreza.Reflection.FruitFactory;
import mbreza.Simple.Game;
import mbreza.Simple.GameFactory;
import mbreza.Simple.GameType;
import mbreza.Wytworcza.Book;
import mbreza.Wytworcza.BookFactory;
import mbreza.Wytworcza.FantasyFactory;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        FruitFactory appleFactory = new FruitFactory();
        appleFactory.create("Orange").getType();

        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.createGame(GameType.FPS);
        game.getType();

        BookFactory bookFactory = new FantasyFactory();
        Book fantasy = bookFactory.createBook();
        fantasy.getType();

        PopCulture ironMan = new PopCulture(new IronManFactory());
        ironMan.getComic().getType();
        ironMan.getMovie().getType();

        PopCulture batman = new PopCulture(new BatmanFactory());
        batman.getComic().getType();
        batman.getMovie().getType();
    }
}
