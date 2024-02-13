package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Informacion extends JPanel {

    private JTextArea id, valor, descripcion, idCamara, operador, velocidad, placa;

    private JLabel idLabel, valorLabel, descripcionLabel, idCamaraLabel, operadorLabel, velocidadLabel, placaLabel;

    private InterfazMain interfazMain;

    public Informacion(){

        Border borde = BorderFactory.createTitledBorder("Datos");
        setBorder( borde);
        setLayout(new GridLayout(7,2));

        id = new JTextArea();
        valor = new JTextArea();
        descripcion = new JTextArea();
        idCamara = new JTextArea();
        operador = new JTextArea();
        velocidad = new JTextArea();
        placa = new JTextArea();

        idLabel = new JLabel("Id");
        valorLabel = new JLabel("Valor");
        descripcionLabel = new JLabel("Descripcion");
        idCamaraLabel = new JLabel("IdCamara");
        operadorLabel = new JLabel("Operador");
        velocidadLabel = new JLabel("Velocidad (Km/h)");
        placaLabel = new JLabel("Placa");

        add(idLabel);
        add(valorLabel);
        add(descripcionLabel);
        add(idCamaraLabel);
        add(operadorLabel);
        add(velocidadLabel);
        add(placaLabel);
        add(id);
        add(valor);
        add(descripcion);
        add(idCamara);
        add(operador);
        add(velocidad);
        add(placa);


    }

}
