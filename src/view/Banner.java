package view;

import javax.swing.*;
import java.awt.*;

public class Banner extends JPanel {

    public Banner(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/data/img/multas.jpg"));
        JLabel img = new JLabel(icon);
        img.setPreferredSize(new Dimension(700, 200));
        setLayout(new BorderLayout());
        add(img, BorderLayout.CENTER);
    }
}
