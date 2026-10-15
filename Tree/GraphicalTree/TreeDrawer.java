package GraphicalTree;

import javax.swing.*;
import java.awt.*;

public class TreeDrawer extends JPanel {
    private final BinaryTree root;
    private int counter;
    private static final int R = 20, X_GAP = 50, Y_GAP = 70, PAD = 40;

    public TreeDrawer(BinaryTree root) {
        this.root = root;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(
            root.size() * X_GAP + 2 * PAD,
            (root.getHeight() + 1) * Y_GAP + 2 * PAD));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ((Graphics2D) g).setRenderingHint(
            RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        counter = 0;
        draw(g, root, 0, true);    // pass 1: lines
        counter = 0;
        draw(g, root, 0, false);   // pass 2: circles (on top of lines)
    }

    // x position = in-order index, y position = depth
    private int draw(Graphics g, BinaryTree node, int depth, boolean lines) {
        if (node == BinaryTree.NIL) return -1;

        int lx = draw(g, node.getLeft(), depth + 1, lines);
        int x = PAD + counter++ * X_GAP;
        int y = PAD + depth * Y_GAP;
        int rx = draw(g, node.getRight(), depth + 1, lines);

        if (lines) {
            g.setColor(Color.DARK_GRAY);
            if (lx != -1) g.drawLine(x, y, lx, y + Y_GAP);
            if (rx != -1) g.drawLine(x, y, rx, y + Y_GAP);
        } else {
            g.setColor(new Color(173, 216, 230));
            g.fillOval(x - R, y - R, 2 * R, 2 * R);
            g.setColor(Color.BLACK);
            g.drawOval(x - R, y - R, 2 * R, 2 * R);
            String s = String.valueOf(node.getKey());
            FontMetrics fm = g.getFontMetrics();
            g.drawString(s, x - fm.stringWidth(s) / 2, y + fm.getAscent() / 2 - 2);
        }
        return x;
    }

    public static void show(BinaryTree root, String title) {
        JFrame f = new JFrame(title);
        f.add(new JScrollPane(new TreeDrawer(root)));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
    BinaryTree root = new BinaryTree(16);

    // Level 1
    root = root.grow(8);
    root = root.grow(24);

    // Level 2
    root = root.grow(4);
    root = root.grow(12);
    root = root.grow(20);
    root = root.grow(28);

    // Level 3
    root = root.grow(2);
    root = root.grow(6);
    root = root.grow(10);
    root = root.grow(14);
    root = root.grow(18);
    root = root.grow(22);
    root = root.grow(26);
    root = root.grow(30);

    // Level 4 (leaves)
    root = root.grow(1);
    root = root.grow(3);
    root = root.grow(5);
    root = root.grow(7);
    root = root.grow(9);
    root = root.grow(11);
    root = root.grow(13);
    root = root.grow(15);
    root = root.grow(17);
    root = root.grow(19);
    root = root.grow(21);
    root = root.grow(23);
    root = root.grow(25);
    root = root.grow(27);
    root = root.grow(29);
    root = root.grow(31);

    System.out.println("In-order: " + root.toString());
    System.out.println("Size:     " + root.size());        // 31
    System.out.println("Height:   " + root.getHeight());   // 4

    TreeDrawer.show(root, "Perfect AVL Tree (31 nodes)");
}
}