package mbreza;

import mbreza.Simple.Game;
import mbreza.Simple.GameFactory;
import mbreza.Simple.GameType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    GameFactory gameFactory;

    @Before
    public void setup(){
        gameFactory = GameFactory.createInstance();
    }

    @Test
    public void fpsTest() {
        Game fpsGame = gameFactory.createGame(GameType.FPS);
        assertEquals(fpsGame.getType(), "FPS");
    }

    @Test
    public void rpgTest() {
        Game rpgGame = gameFactory.createGame(GameType.RPG);
        assertEquals(rpgGame.getType(), "RPG");
    }

}
