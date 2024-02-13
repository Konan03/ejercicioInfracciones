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
        setLayout(new BorderLayout());

        JPanel panelIzquierda = new JPanel(new GridLayout(7,1));
        JPanel panelDerecha = new JPanel(new GridLayout(7,1));

        id = new JTextArea();
        valor = new JTextArea();
        descripcion = new JTextArea();
        idCamara = new JTextArea();
        operador = new JTextArea();
        velocidad = new JTextArea();
        placa = new JTextArea();

        Border border = BorderFactory.createTitledBorder("");
        id.setBorder(border);
        valor.setBorder(border);
        descripcion.setBorder(border);
        idCamara.setBorder(border);
        operador.setBorder(border);
        velocidad.setBorder(border);
        placa.setBorder(border);

        idLabel = new JLabel("Id");
        valorLabel = new JLabel("Valor");
        descripcionLabel = new JLabel("Descripcion");
        idCamaraLabel = new JLabel("IdCamara");
        operadorLabel = new JLabel("Operador");
        velocidadLabel = new JLabel("<html>Velocidad<br>(Km/h)</html>");
        placaLabel = new JLabel("Placa");

        panelIzquierda.add(idLabel);
        panelIzquierda.add(valorLabel);
        panelIzquierda.add(descripcionLabel);
        panelIzquierda.add(idCamaraLabel);
        panelIzquierda.add(operadorLabel);
        panelIzquierda.add(velocidadLabel);
        panelIzquierda.add(placaLabel);

        panelDerecha.add(id);
        panelDerecha.add(valor);
        panelDerecha.add(descripcion);
        panelDerecha.add(idCamara);
        panelDerecha.add(operador);
        panelDerecha.add(velocidad);
        panelDerecha.add(placa);

        add(panelIzquierda, BorderLayout.WEST);
        add(panelDerecha, BorderLayout.CENTER);

    }

}
