package servicios;

import model.Infraccion;

import java.util.ArrayList;
import java.util.List;

public class ServicioInfracciones {

    private static List<Infraccion> infracciones = new ArrayList<>();

    public static void addInfraccion(Infraccion infraccion) {
        if (infraccion != null) infracciones.add(infraccion);
    }

    public static double calcularTotalInfracciones() {
        double total = 0;
        for (Infraccion infra: infracciones){
            total = total + infra.getValor();
        }
        return total;
    }


    public static void printInfracciones () {
        for (Infraccion infra: infracciones){
            System.out.println(infra);
        }
    }

}
