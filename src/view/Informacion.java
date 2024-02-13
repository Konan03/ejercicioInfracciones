package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Informacion extends JPanel {

    private JTextArea id, valor, descripcion, idCamara, operador, velocidad, placa, agente, tipoInfracionp, infractor;

    private JLabel idLabel, valorLabel, descripcionLabel, idCamaraLabel, operadorLabel, velocidadLabel, placaLabel, agenteLabel, tipoInfracionLabelp, infractorLabel;

    private Checkbox infraccionCamara, infracionOrdinaria;


    private InterfazMain interfazMain;

    public Informacion(){

        Border borde = BorderFactory.createTitledBorder("Datos");
        setBorder( borde);
        setLayout(new BorderLayout());

        Border border = BorderFactory.createTitledBorder("");

        // datos infracion
        JPanel panelIzquierda = new JPanel(new GridLayout(3,1));
        JPanel panelDerecha = new JPanel(new GridLayout(3,1));

        id = new JTextArea();
        id.setBorder(border);
        valor = new JTextArea();
        valor.setBorder(border);
        descripcion = new JTextArea();
        descripcion.setBorder(border);
        idLabel = new JLabel("Id");
        valorLabel = new JLabel("Valor");
        descripcionLabel = new JLabel("Descripcion");

        panelIzquierda.add(idLabel);
        panelIzquierda.add(valorLabel);
        panelIzquierda.add(descripcionLabel);
        panelDerecha.add(id);
        panelDerecha.add(valor);
        panelDerecha.add(descripcion);

        //panel tipo infraccion
        JPanel tipoInfracion = new JPanel();
        tipoInfracion.setLayout(new BorderLayout());

        // seleccionar infraccion
        JPanel seleccionInfraccion = new JPanel();
        seleccionInfraccion.setLayout(new GridLayout(1,1));

        infraccionCamara = new Checkbox("Infraccion camara");
        infracionOrdinaria = new Checkbox("Infraccion ordinaria");

        seleccionInfraccion.add(infraccionCamara);
        seleccionInfraccion.add(infracionOrdinaria);

        //panel infraccion camara
        JPanel infraccionCamara = new JPanel();
        infraccionCamara.setLayout(new BorderLayout());
        JPanel panelIzquierda2 = new JPanel(new GridLayout(4,1));
        JPanel panelDerecha2 = new JPanel(new GridLayout(4,1));
        infraccionCamara.setBorder(borde);

        idCamara = new JTextArea();
        idCamara.setBorder(border);
        operador = new JTextArea();
        operador.setBorder(border);
        velocidad = new JTextArea();
        velocidad.setBorder(border);
        placa = new JTextArea();
        placa.setBorder(border);

        idCamaraLabel = new JLabel("IdCamara");
        operadorLabel = new JLabel("Operador");
        velocidadLabel = new JLabel("<html>Velocidad<br>(Km/h)</html>");
        placaLabel = new JLabel("Placa");

        panelIzquierda2.add(idCamaraLabel);
        panelIzquierda2.add(operadorLabel);
        panelIzquierda2.add(velocidadLabel);
        panelIzquierda2.add(placaLabel);
        panelDerecha2.add(idCamara);
        panelDerecha2.add(operador);
        panelDerecha2.add(velocidad);
        panelDerecha2.add(placa);

        infraccionCamara.add(panelIzquierda2, BorderLayout.WEST);
        infraccionCamara.add(panelDerecha2, BorderLayout.EAST);

        //revisar, cuando descomento el panel de la infraccion camara desaparece

        //panel infraccion ordinaria
        /*
        JPanel infraccionOrdinaria = new JPanel();
        infraccionCamara.setLayout(new BorderLayout());
        JPanel panelIzquierda3 = new JPanel(new GridLayout(4,1));
        JPanel panelDerecha3 = new JPanel(new GridLayout(4,1));

        agente = new JTextArea();
        agente.setBorder(border);
        tipoInfracionp = new JTextArea();
        tipoInfracionp.setBorder(border);
        infractor = new JTextArea();
        infractor.setBorder(border);

        agenteLabel = new JLabel("Agente");
        tipoInfracionLabelp = new JLabel("Tipo");
        infractorLabel = new JLabel("Infractor");

        panelIzquierda3.add(agenteLabel);
        panelIzquierda3.add(tipoInfracionLabelp);
        panelIzquierda3.add(infractorLabel);
        panelDerecha3.add(agente);
        panelDerecha3.add(tipoInfracionp);
        panelDerecha3.add(infractor);

        infraccionOrdinaria.add(panelIzquierda3, BorderLayout.WEST);
        infraccionOrdinaria.add(panelDerecha3, BorderLayout.EAST);


         */
        //add
        tipoInfracion.add(seleccionInfraccion, BorderLayout.NORTH);
        tipoInfracion.add(infraccionCamara, BorderLayout.WEST);
        //tipoInfracion.add(infraccionOrdinaria, BorderLayout.EAST);

        add(panelIzquierda, BorderLayout.WEST);
        add(panelDerecha, BorderLayout.CENTER);
        add(tipoInfracion, BorderLayout.SOUTH);

    }

}
