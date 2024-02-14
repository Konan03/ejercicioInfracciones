package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InfraccionCamara extends Infraccion{
    private int idCamara;
    private String operador;
    private double velocidad;
    private String placa;


    public InfraccionCamara(int id, LocalDate fecha, double valor, String descripcion, int idCamara, String operador, double velocidad, String placa) {
        super(id, fecha, valor, descripcion);
        this.idCamara = idCamara;
        this.operador = operador;
        this.velocidad = velocidad;
        this.placa = placa;
    }

    public InfraccionCamara(int id, LocalDate fecha, double valor, String descripcion, double descuento, int idCamara, String operador, double velocidad, String placa) {
        super(id, fecha, valor, descripcion, descuento);
        this.idCamara = idCamara;
        this.operador = operador;
        this.velocidad = velocidad;
        this.placa = placa;
    }

    public int getIdCamara() {
        return idCamara;
    }

    public void setIdCamara(int idCamara) {
        this.idCamara = idCamara;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "InfraccionCamara{" + "\n" +
                "    " + super.toString() + "," + "\n" +
                "    idCamara=" + idCamara + "," + "\n" +
                "    operador='" + operador + '\'' + "," + "\n" +
                "    velocidad=" + velocidad + "," + "\n" +
                "    placa='" + placa + '\'' + "\n" +
                '}';
    }

}
