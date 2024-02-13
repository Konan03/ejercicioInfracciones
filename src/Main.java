import model.Infraccion;
import model.InfraccionCamara;
import servicios.ServicioInfracciones;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio...");

        Infraccion infra1 = new InfraccionCamara(123,  LocalDate.now(), 10000, "Velocidad", 111, "Juan", 90, "ABC123");
        Infraccion infra2 = new InfraccionCamara(456,  LocalDate.now(), 20000, "Velocidad", 111, "Juan", 95, "XYZ456");

        ServicioInfracciones.addInfraccion(infra1);
        ServicioInfracciones.addInfraccion(infra2);

        ServicioInfracciones.printInfracciones();
        System.out.println("Total infracciones: " + ServicioInfracciones.calcularTotalInfracciones());


        System.out.println("Fin...");

    }
}