package view;

import model.Infraccion;
import model.InfraccionCamara;
import model.InfraccionOrdinaria;
import servicios.ServicioInfracciones;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;


public class Informacion extends JPanel {

    private JTextArea id, valor, descripcion, idCamara, operador, velocidad, placa, agente, tipoInfracionp, infractor;

    private JLabel idLabel, valorLabel, descripcionLabel, idCamaraLabel, operadorLabel, velocidadLabel, placaLabel, agenteLabel, tipoInfracionLabelp, infractorLabel;

    private Checkbox infraccionCamaraChecbox, infraccionOrdinariaChecbox;


    private InterfazMain interfazMain;

    public Informacion(){

        Border borde = BorderFactory.createTitledBorder("Datos");
        setBorder( borde);
        setLayout(new BorderLayout());

        Border border = BorderFactory.createTitledBorder("");
        Font font = new Font("Arial", Font.PLAIN, 20);
        Font font2 = new Font("Arial", Font.PLAIN, 15);

        // datos infracion
        JPanel panelIzquierda = new JPanel(new GridLayout(3,1));
        JPanel panelDerecha = new JPanel(new GridLayout(3,1));

        id = new JTextArea();
        id.setBorder(border);
        id.setFont(font);
        valor = new JTextArea();
        valor.setBorder(border);
        valor.setFont(font);
        descripcion = new JTextArea();
        descripcion.setBorder(border);
        descripcion.setFont(font);
        idLabel = new JLabel("Id");
        idLabel.setFont(font);
        valorLabel = new JLabel("Valor");
        valorLabel.setFont(font);
        descripcionLabel = new JLabel("Descripcion");
        descripcionLabel.setFont(font);

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

        infraccionCamaraChecbox = new Checkbox("Infraccion camara");
        infraccionOrdinariaChecbox = new Checkbox("Infraccion ordinaria");

        infraccionCamaraChecbox.setFont(font);
        infraccionOrdinariaChecbox.setFont(font);

        seleccionInfraccion.add(infraccionCamaraChecbox);
        seleccionInfraccion.add(infraccionOrdinariaChecbox);

        //panel infraccion camara
        //Border borde2 = BorderFactory.createTitledBorder("");
        JPanel infraccionCamara = new JPanel();
        infraccionCamara.setLayout(new BorderLayout());
        //infraccionCamara.setBorder(borde2);
        JPanel panelIzquierda2 = new JPanel(new GridLayout(4,1));
        JPanel panelDerecha2 = new JPanel(new GridLayout(4,1));

        idCamara = new JTextArea(2,15);
        idCamara.setBorder(border);
        idCamara.setFont(font2);
        operador = new JTextArea();
        operador.setBorder(border);
        operador.setFont(font2);
        velocidad = new JTextArea();
        velocidad.setBorder(border);
        velocidad.setFont(font2);
        placa = new JTextArea();
        placa.setBorder(border);
        placa.setFont(font2);

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
        infraccionCamara.add(panelDerecha2, BorderLayout.CENTER);

        //panel infraccion ordinaria

        JPanel infraccionOrdinaria = new JPanel();
        infraccionOrdinaria.setLayout(new BorderLayout());
        //infraccionOrdinaria.setBorder(borde2);
        JPanel panelIzquierda3 = new JPanel(new GridLayout(4,1));
        JPanel panelDerecha3 = new JPanel(new GridLayout(4,1));

        agente = new JTextArea(2,15);
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
        infraccionOrdinaria.add(panelDerecha3, BorderLayout.CENTER);

        //add
        add(panelIzquierda, BorderLayout.WEST);
        add(panelDerecha, BorderLayout.CENTER);
        add(tipoInfracion, BorderLayout.SOUTH);

        tipoInfracion.add(seleccionInfraccion, BorderLayout.NORTH);
        tipoInfracion.add(infraccionCamara, BorderLayout.WEST);
        tipoInfracion.add(infraccionOrdinaria, BorderLayout.EAST);

        infraccionCamaraChecbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boolean seleccionado = e.getStateChange() == ItemEvent.SELECTED;
                gestionarCheckboxInfraccionCamara(seleccionado);
            }
        });

        infraccionOrdinariaChecbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boolean seleccionado = e.getStateChange() == ItemEvent.SELECTED;
                gestionarCheckboxInfraccionOrdinaria(seleccionado);
            }
        });

    }

    private void gestionarCheckboxInfraccionCamara(boolean seleccionado) {
        infraccionOrdinariaChecbox.setEnabled(!seleccionado);
        agente.setEnabled(!seleccionado);
        tipoInfracionp.setEnabled(!seleccionado);
        infractor.setEnabled(!seleccionado);
        agenteLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
        tipoInfracionLabelp.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
        infractorLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
    }

    private void gestionarCheckboxInfraccionOrdinaria(boolean seleccionado) {
        infraccionCamaraChecbox.setEnabled(!seleccionado);
        idCamara.setEnabled(!seleccionado);
        operador.setEnabled(!seleccionado);
        velocidad.setEnabled(!seleccionado);
        placa.setEnabled(!seleccionado);
        idCamaraLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
        operadorLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
        velocidadLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
        placaLabel.setForeground(seleccionado ? Color.GRAY : Color.BLACK);
    }


    public void guardarInfraccion() {
        if (infraccionCamaraChecbox.getState() || infraccionOrdinariaChecbox.getState()) {
            String idTexto = null;
            String valorTexto = null;
            String descripcionTexto = null;
            String idcamaraTexto = null;
            String operadorTexto = null;
            String velocidadTexto = null;
            String placaTexto = null;
            String agenteTexto = null;
            String tipoInfraccionTexto = null;
            String infractorTexto = null;

            if(infraccionCamaraChecbox.getState()){
                idTexto = id.getText();
                valorTexto = valor.getText();
                descripcionTexto = descripcion.getText();
                idcamaraTexto = idCamara.getText();
                operadorTexto = operador.getText();
                velocidadTexto = velocidad.getText();
                placaTexto = placa.getText();
            } else {
                idTexto = id.getText();
                valorTexto = valor.getText();
                descripcionTexto = descripcion.getText();
                agenteTexto = agente.getText();
                tipoInfraccionTexto = tipoInfracionp.getText();
                infractorTexto = infractor.getText();
            }

            if (!idTexto.isEmpty() && !valorTexto.isEmpty() && !descripcionTexto.isEmpty()){
                try {
                    double valorInfraccion = Double.parseDouble(valorTexto);
                    int id = Integer.parseInt(idTexto);
                    Infraccion infra;
                    if(infraccionCamaraChecbox.getState()){
                        int camaraId = Integer.parseInt(idcamaraTexto);
                        double velocidadInfraccion = Double.parseDouble(velocidadTexto);
                        infra = new InfraccionCamara(id, LocalDate.now() ,valorInfraccion, descripcionTexto, camaraId, operadorTexto, velocidadInfraccion, placaTexto );
                    } else {
                        infra = new InfraccionOrdinaria(id, LocalDate.now() ,valorInfraccion, descripcionTexto, agenteTexto, tipoInfraccionTexto, infractorTexto);
                    }

                    ServicioInfracciones.addInfraccion(infra);

                    JOptionPane.showMessageDialog(this, "Infracción agregada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception e){
                    JOptionPane.showMessageDialog(this, "Error: El valor ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: Debes seleccionar un tipo de infracción.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarInfracciones() {
        ServicioInfracciones.printInfracciones();
    }

    public void aplicarDescuento(){
        System.out.println(ServicioInfracciones.calcularTotalInfracciones());
    }

}
