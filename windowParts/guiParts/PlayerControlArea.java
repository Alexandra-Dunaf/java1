package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;


public class PlayerControlArea extends JPanel {

    private JButton upButton;
    private JButton leftButton;
    private JButton rightButton;
    private JButton downButton;
    private JButton emptyButton1;
    private JButton emptyButton2;

    public PlayerControlArea () {
        setLayout(new GridLayout(2, 3));
        JButton emptyButton1 = new JButton();
        emptyButton1.setEnabled(false);
        upButton = new JButton();
        upButton.setIcon(new ImageIcon("up.png"));
        JButton emptyButton2 = new JButton();
        emptyButton2.setEnabled(false);
        leftButton = new JButton();
        leftButton.setIcon(new ImageIcon("left.png"));
        rightButton = new JButton();
        rightButton.setIcon(new ImageIcon("right.png"));
        downButton = new JButton();
        downButton.setIcon(new ImageIcon("down.png"));

        add(emptyButton1);
        add(upButton);
        add(emptyButton2);
        add(leftButton);
        add(downButton);
        add(rightButton);


    }

}
