package mbreza.Simple;

public class GameFactory {

    public Game createGame(GameType gameType){
        switch (gameType){
            case FPS:
                return new FPS();
            case RPG:
                return new RPG();
            default:
                return null;
        }
    }
}
