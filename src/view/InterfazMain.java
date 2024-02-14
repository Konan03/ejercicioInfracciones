package view;

import javax.swing.*;
import java.awt.*;

public class InterfazMain extends JFrame {

    private Banner banner;
    private Informacion informacion;
    private Botones botones;

    public InterfazMain (){
        setTitle("Infraciones LugoGod");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null);

        banner = new Banner();
        add(banner, BorderLayout.NORTH);
        informacion = new Informacion();
        add(informacion, BorderLayout.CENTER);
        botones = new Botones(informacion);
        add(botones, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        InterfazMain gui = new InterfazMain();
        gui.setVisible(true);
    }

}
