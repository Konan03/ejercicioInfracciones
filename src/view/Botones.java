package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JPanel implements ActionListener {

    private final static String AGREGAR_MULTA = "Agregar multa";
    private final static String MOSTAR_MULTAS = "Mostar multas";
    private final static String APLICAR_DESCUENTO = "Aplicar descuento";

    private JButton agregarMulta, mostrarMultas, aplicarDescuento;

    private InterfazMain interfazMain;
    private Informacion informacion;

    public Botones (){

        Border borde = BorderFactory.createTitledBorder("");
        setBorder( borde);
        setLayout(new GridLayout(1,3));

        agregarMulta = new JButton(AGREGAR_MULTA);
        agregarMulta.addActionListener(this);
        agregarMulta.setActionCommand(AGREGAR_MULTA);

        mostrarMultas = new JButton(MOSTAR_MULTAS);
        mostrarMultas.addActionListener(this);
        mostrarMultas.setActionCommand(MOSTAR_MULTAS);

        aplicarDescuento = new JButton(APLICAR_DESCUENTO);
        aplicarDescuento.addActionListener(this);
        aplicarDescuento.setActionCommand(APLICAR_DESCUENTO);

        add(agregarMulta);
        add(mostrarMultas);
        add(aplicarDescuento);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals(AGREGAR_MULTA)) {
            informacion.guardarInfracion();
        }
        if (actionCommand.equals(MOSTAR_MULTAS)) {
            informacion.mostrarInfracciones();
        }
        if (actionCommand.equals(APLICAR_DESCUENTO)) {
            informacion.aplicarDescuento();
        }
    }
}
