package view;

import javax.swing.*;
import java.awt.*;

public class InterfazMain extends JFrame {

    public InterfazMain (){
        setTitle("Infraciones LugoGod");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

    }


    public static void main(String[] args) {
        InterfazMain gui = new InterfazMain();
        gui.setVisible(true);
    }

}
