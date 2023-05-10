import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {
    private Timer timer;
    private int x, y, velX, velY;

    public Game() {
        x = 0;
        y = 0;
        velX = 1;
        velY = 1;
        timer = new Timer(5, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 550) {
            velX = -velX;
        }
        if (y < 0 || y > 350) {
            velY = -velY;
        }
        x += velX;
        y += velY;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
