package model;

import java.time.LocalDate;

public class InfraccionOrdinaria extends Infraccion{
    private String agente;
    private String tipoInfracion;
    private String infractor;

    public InfraccionOrdinaria(int id, LocalDate fecha, double valor, String descripcion, String agente, String tipoInfracion, String infractor) {
        super(id, fecha, valor, descripcion);
        this.agente = agente;
        this.tipoInfracion = tipoInfracion;
        this.infractor = infractor;
    }

    public InfraccionOrdinaria(int id, LocalDate fecha, double valor, String descripcion, double descuento, String agente, String tipoInfracion, String infractor) {
        super(id, fecha, valor, descripcion, descuento);
        this.agente = agente;
        this.tipoInfracion = tipoInfracion;
        this.infractor = infractor;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getTipoInfracion() {
        return tipoInfracion;
    }

    public void setTipoInfracion(String tipoInfracion) {
        this.tipoInfracion = tipoInfracion;
    }

    public String getInfractor() {
        return infractor;
    }

    public void setInfractor(String infractor) {
        this.infractor = infractor;
    }

    @Override
    public String toString() {
        return "InfraccionOrdinaria{" + "\n" +
                "    " + super.toString() + "," + "\n" +
                "    agente='" + agente + '\'' + "," + "\n" +
                "    tipoInfraccion='" + tipoInfracion + '\'' + ","+ "\n" +
                "    infractor='" + infractor + '\'' + "\n" +
                '}';
    }
}
