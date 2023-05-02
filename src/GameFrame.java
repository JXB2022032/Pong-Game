import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel = new GamePanel();

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.DARK_GRAY);    // Background color of our game panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);   // set the game panel to the middle of the screen

    }
}
