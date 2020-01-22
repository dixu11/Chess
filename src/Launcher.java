import swing.core.GameEngine;

public final class Launcher {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        GameEngine engine = configuration.buildGame();
        engine.start();
    }
}


//todo bot losing
//todo bot checking
//todo bot fleeing pawn vs knight

//todo ten kto mnie proni jest za silny gdyby chciał sie wymieniać - nie broni mnie

//szach mat nie dziala