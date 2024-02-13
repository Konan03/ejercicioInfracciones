package model;

import java.time.LocalDate;

public abstract class Infraccion {
    private int id;
    private LocalDate fecha;
    private double valor;
    private String descripcion;


    public Infraccion(int id, LocalDate fecha, double valor, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Infraccion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", valor=" + valor +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
