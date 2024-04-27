package Blackjack;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Blackjack"); // Create window object from JFrame library
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close window on exit

        GamePanel gamePanel = new GamePanel(); // Create GamePanel object
        window.add(gamePanel); // Add the gamePanel object to the window

        window.pack();

        window.setResizable(false); // Fix window size
        window.setLocationRelativeTo(null); // Window appears on screen center
        window.setVisible(true);

        gamePanel.startGame();
    }
}