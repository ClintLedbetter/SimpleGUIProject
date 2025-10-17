package simplegui;

import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the main window (frame)
        JFrame frame = new JFrame("Example GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Add a label and a button to the panel
        JLabel label = new JLabel("Welcome to my First GUI in Java!");
        JButton button = new JButton("Click Me");

        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
//commit
