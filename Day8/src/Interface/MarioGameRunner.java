package Interface;

public class MarioGameRunner
{
        public static void main(String[] args)
        {
            GamingConsole game = new ChessGame();
            //GamingConsole game = new MarioGame();
            //ChessGame game = new ChessGame();
            //MarioGame game = new MarioGame();
            game.up();
            game.down();
            game.left();
            game.right();
        }
}
