import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SnakeGame extends JFrame {
    Board board = new Board();

    SnakeGame(){
        Component add = add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();

    }
}