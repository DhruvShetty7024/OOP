class Game {
    void type() {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game {
    
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game {
    
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

class Main {
    public static void main(String[] args) {
        Game game1 = new Cricket();
        Game game2 = new Chess();

        game1.type();
        game2.type();
    }
}
