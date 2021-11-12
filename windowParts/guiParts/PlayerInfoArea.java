package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;


public class PlayerInfoArea  extends JPanel {
    private JLabel areaName;

    public PlayerInfoArea () {
        setLayout(new GridLayout(2,1));
        areaName = new JLabel("* Player info *", SwingConstants.CENTER);

        add(areaName);


    }

}