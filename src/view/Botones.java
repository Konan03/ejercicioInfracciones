package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Botones extends JPanel {

    private final static String AGREGAR_MULTA = "Agregar multa";
    private final static String MOSTAR_MULTAS = "Mostar multas";
    private final static String APLICAR_DESCUENTO = "Aplicar descuento";

    private JButton agregarMulta, mostrarMultas, aplicarDescuento;

    private InterfazMain interfazMain;

    public Botones (){

        Border borde = BorderFactory.createTitledBorder("");
        setBorder( borde);
        setLayout(new GridLayout(1,3));

        agregarMulta = new JButton(AGREGAR_MULTA);

        mostrarMultas = new JButton(MOSTAR_MULTAS);

        aplicarDescuento = new JButton(APLICAR_DESCUENTO);


        add(agregarMulta);
        add(mostrarMultas);
        add(aplicarDescuento);

    }
}
