package Blackjack;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    // Screen Settings
    final int originalTileSize = 16; // Original tile size before scaling
    final int scale = 3; // Enlarge scale
    final int tileSize = originalTileSize * scale; // Actual tile size

    // Screen size parameters
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768px
    final int screenLength = tileSize * maxScreenRow; // 576px

    // Game clock
    Thread gameThread;


    // Constructor that sets the dimensions of the screen
    public GamePanel() {
        this.setPreferredSize(new Dimension(this.screenWidth, this.screenLength));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); // Off-screen painting buffer == better rendering performance
    }

    public void startGame() {
        gameThread = new Thread(this); // Instantiate thread and pass GamePanel through to constructor
        gameThread.start(); // Built in start method in Thread class
    }

    // Game Loop
    @Override
    public void run() {
        // As long as gameThread exists
        while (gameThread != null) {
            System.out.println("GameLoop");
        }
    }
}
