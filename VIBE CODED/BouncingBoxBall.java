
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BouncingBoxBall extends JPanel implements ActionListener {

    private final int WIDTH = 800, HEIGHT = 650;
    private final int BOX_SIZE = 250;
    private final int GAP_WIDTH = 70;
    private final int BOX_TOP = 350;
    private final int BOX_BOTTOM = BOX_TOP + BOX_SIZE;
    private final int RADIUS = 10;
    private final double GRAVITY = 0.5;
    private final double BOUNCE_LOSS = 0.85;

    private final double boxX = (WIDTH - BOX_SIZE) / 2.0;
    private double gapOffset = 0;
    private double gapDir = 2;

    private List<double[]> balls; // each: {x, y, vx, vy}

    public BouncingBoxBall() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        balls = new ArrayList<>();
        balls.add(new double[]{WIDTH / 2.0, 0, 1.5, 0});
        Timer timer = new Timer(16, this);
        timer.start();
    }

    private void updateGap() {
        gapOffset += gapDir;
        double maxOffset = BOX_SIZE - GAP_WIDTH;
        if (gapOffset <= 0 || gapOffset >= maxOffset) {
            gapDir = -gapDir;
            gapOffset = Math.max(0, Math.min(gapOffset, maxOffset));
        }
    }

    private void updateBalls() {
        double gapStart = boxX + gapOffset;
        double gapEnd = gapStart + GAP_WIDTH;

        List<double[]> newBalls = new ArrayList<>();

        for (double[] b : balls) {
            b[3] += GRAVITY;      // vy += gravity
            b[0] += b[2];         // x += vx
            b[1] += b[3];         // y += vy

            boolean inBoxVertically = b[1] + RADIUS > BOX_TOP && b[1] - RADIUS < BOX_BOTTOM;

            if (inBoxVertically) {
                if (b[0] - RADIUS <= boxX && b[2] < 0) {
                    b[0] = boxX + RADIUS;
                    b[2] = -b[2];
                } else if (b[0] + RADIUS >= boxX + BOX_SIZE && b[2] > 0) {
                    b[0] = boxX + BOX_SIZE - RADIUS;
                    b[2] = -b[2];
                }
            }

            if (b[1] + RADIUS >= BOX_BOTTOM && b[3] > 0) {
                if (b[0] >= gapStart && b[0] <= gapEnd) {
                    // falls through the gap, keep falling
                } else {
                    b[1] = BOX_BOTTOM - RADIUS;
                    b[3] = -b[3] * BOUNCE_LOSS;
                }
            }

            if (b[1] - RADIUS > HEIGHT) {
                // ball exited through the gap -> doubles, drops from top again
                newBalls.add(new double[]{WIDTH / 2.0 - 20, 0, 1.2, 0});
                newBalls.add(new double[]{WIDTH / 2.0 + 20, 0, -1.2, 0});
            } else {
                newBalls.add(b);
            }
        }

        balls = newBalls;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateGap();
        updateBalls();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.CYAN);

        double gapStart = boxX + gapOffset;
        double gapEnd = gapStart + GAP_WIDTH;

        // left wall, right wall
        g2.drawLine((int) boxX, BOX_TOP, (int) boxX, BOX_BOTTOM);
        g2.drawLine((int) (boxX + BOX_SIZE), BOX_TOP, (int) (boxX + BOX_SIZE), BOX_BOTTOM);
        // bottom wall, split around the gap
        g2.drawLine((int) boxX, BOX_BOTTOM, (int) gapStart, BOX_BOTTOM);
        g2.drawLine((int) gapEnd, BOX_BOTTOM, (int) (boxX + BOX_SIZE), BOX_BOTTOM);

        g2.setColor(Color.ORANGE);
        for (double[] b : balls) {
            g2.fillOval((int) (b[0] - RADIUS), (int) (b[1] - RADIUS), RADIUS * 2, RADIUS * 2);
        }

        g2.setColor(Color.WHITE);
        g2.drawString("Balls: " + balls.size(), 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Box Ball");
        BouncingBoxBall panel = new BouncingBoxBall();
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}