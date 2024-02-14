package servicios;

import model.Infraccion;
import model.InfraccionCamara;
import model.InfraccionOrdinaria;

import java.util.ArrayList;
import java.util.List;

public class ServicioInfracciones {

    public static final double DESCUENTO_CAMARA = 0.9;
    public static final double DESCUENTO_ORDINARIA = 0.95;
    private static List<Infraccion> infracciones = new ArrayList<>();

    public static void addInfraccion(Infraccion infraccion) {
        if (infraccion != null) infracciones.add(infraccion);
    }

    public static double calcularTotalInfracciones() {
        double total = 0;
        for (Infraccion infra: infracciones)
        {
          total = total + ((1- infra.getDescuento())*infra.getValor());
        }
        return total;
    }


    public static void printInfracciones () {
        for (Infraccion infra: infracciones){
            System.out.println(infra);
        }
    }

}
