import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalculator implements ActionListener {
    int c, n;
    String s1, s2, s3, s4, s5;
    JFrame f;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
    JPanel p;
    TextField tf;
    GridBagLayout g;
    GridBagConstraints gbc;

    MyCalculator() {
        f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        tf = new TextField();
        tf.setPreferredSize(new Dimension(300, 50));
        f.add(tf, BorderLayout.NORTH);

        p = new JPanel();
        g = new GridBagLayout();
        p.setLayout(g);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        b1 = createButton("0");
        b2 = createButton("1");
        b3 = createButton("2");
        b4 = createButton("3");
        b5 = createButton("4");
        b6 = createButton("5");
        b7 = createButton("6");
        b8 = createButton("7");
        b9 = createButton("8");
        b10 = createButton("9");
        b11 = createButton("+");
        b12 = createButton("-");
        b13 = createButton("*");
        b14 = createButton("/");
        b15 = createButton("C");
        b16 = createButton("=");
        b17 = createButton(".");

        addButtonToPanel(b2, 0, 2);
        addButtonToPanel(b3, 1, 2);
        addButtonToPanel(b4, 2, 2);
        addButtonToPanel(b5, 0, 3);
        addButtonToPanel(b6, 1, 3);
        addButtonToPanel(b7, 2, 3);
        addButtonToPanel(b8, 0, 4);
        addButtonToPanel(b9, 1, 4);
        addButtonToPanel(b10, 2, 4);
        addButtonToPanel(b1, 0, 1);
        addButtonToPanel(b11, 3, 3);
        addButtonToPanel(b12, 3, 2);
        addButtonToPanel(b13, 3, 1);
        addButtonToPanel(b14, 2, 1);
        addButtonToPanel(b15, 0, 0);
        addButtonToPanel(b16, 3, 4);
        addButtonToPanel(b17, 1, 1);

        f.add(p, BorderLayout.CENTER);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(50, 50));
        button.addActionListener(this);
        return button;
    }

    private void addButtonToPanel(JButton button, int gridx, int gridy) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        p.add(button, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b2) {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b3) {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b4) {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b5) {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b6) {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b7) {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b8) {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b9) {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b10) {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b11) {
            s1 = tf.getText();
            tf.setText("");
            c = 1;
        }
        if (e.getSource() == b12) {
            s1 = tf.getText();
            tf.setText("");
            c = 2;
        }
        if (e.getSource() == b13) {
            s1 = tf.getText();
            tf.setText("");
            c = 3;
        }
        if (e.getSource() == b14) {
            s1 = tf.getText();
            tf.setText("");
            c = 4;
        }
        if (e.getSource() == b15) {
            s1 = tf.getText();
            tf.setText("");
            c = 5;
        }
        if (e.getSource() == b16) {
            s2 = tf.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 4) {
                int p = Integer.parseInt(s2);
                if (p != 0) {
                    n = Integer.parseInt(s1) / Integer.parseInt(s2);
                    tf.setText(String.valueOf(n));
                } else {
                    tf.setText("Error");
                }
            } else if (c == 5) {
                n = Integer.parseInt(s1) % Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == b17) {
            s3 = tf.getText();
            if (!s3.contains(".")) {
                s4 = ".";
                s5 = s3 + s4;
                tf.setText(s5);
            }
        }
    }

    public static void main(String[] abc) {
        new MyCalculator();
    }
}
