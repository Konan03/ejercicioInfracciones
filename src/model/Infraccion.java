package model;

import java.time.LocalDate;

public abstract class Infraccion {
    private int id;
    private LocalDate fecha;
    private double valor;
    private String descripcion;
    private double descuento;


    public Infraccion(int id, LocalDate fecha, double valor, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public Infraccion(int id, LocalDate fecha, double valor, String descripcion, double descuento) {
        this.id = id;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
        this.descuento = descuento;
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Infraccion{" + "\n" +
                "    id=" + id + "," + "\n" +
                "    fecha=" + fecha + "," + "\n" +
                "    valor=" + valor + "," + "\n" +
                "    descripcion='" + descripcion + '\'' + "\n" +
                '}';
    }



}
