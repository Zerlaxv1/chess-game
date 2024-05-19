import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessBoard extends JPanel {

    public static final int SQUARE_SIZE = 64;
    public static final int NUM_SQUARES = 8;
    public static final int BOARD_SIZE = NUM_SQUARES * SQUARE_SIZE;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, BOARD_SIZE, BOARD_SIZE);
        frame.setUndecorated(true);

        ChessBoard chessBoard = new ChessBoard();
        frame.add(chessBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        boolean white = true;
        for (int y = 0; y < NUM_SQUARES; y++) {
            for (int x = 0; x < NUM_SQUARES; x++) {
                if (white) {
                    g.setColor(Color.WHITE.darker());
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x * SQUARE_SIZE, y * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
                white = !white;
            }
            white = !white;
        }
    }

    @SuppressWarnings("unused")
    public ChessBoard() {
        Player white = new Player();
        Player black = new Player();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / 64;
                int y = e.getY() / 64;
                
                System.out.print("x: " + x + ", y: " + y);
            }
        });
    }
}