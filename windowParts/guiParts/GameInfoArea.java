package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;


public class GameInfoArea  extends JPanel {
    private JLabel areaName;

    public GameInfoArea () {
        setLayout(new GridLayout(2,1));
        areaName = new JLabel("* Game info *", SwingConstants.CENTER);

        add(areaName);


    }

}
