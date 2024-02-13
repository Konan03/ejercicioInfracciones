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
        for (Infraccion infra: infracciones){
            if(infra instanceof InfraccionCamara){
                total = total + (infra.getValor() * DESCUENTO_CAMARA);
            }else if(infra instanceof InfraccionOrdinaria){
                total = total + (infra.getValor() * DESCUENTO_ORDINARIA);
            }else{
                total = total + infra.getValor();
            }

        }
        return total;
    }


    public static void printInfracciones () {
        for (Infraccion infra: infracciones){
            System.out.println(infra);
        }
    }

}
