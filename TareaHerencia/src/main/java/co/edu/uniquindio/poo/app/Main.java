package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

public class Main {
    static void main() {
        GestorEnvios gestor = new GestorEnvios();

        Envio e1 = new EnvioNacional("N-001", "Ana Gómez", 5, "Medellín", true);

        Envio e2 = new EnvioInternacional("I-001", "John Smith", 2, "Estados Unidos", true);

        Envio e3 = new EnvioExpres("E-001", "Luis Pérez", 5, "Bogotá", true, 12);

        Envio e4 = new EnvioExpres("E-002", "María Ruiz", 3, "Cali", false, 48);

        gestor.agregarEnvio(e1);
        gestor.agregarEnvio(e2);
        gestor.agregarEnvio(e3);
        gestor.agregarEnvio(e4);

        System.out.println("=== Envíos registrados ===");
        gestor.mostrarEnvios();

        System.out.println();
        System.out.println("=== Totales ===");
        System.out.println("Total general: $" + String.format("%.0f", gestor.calcularTotal()));
        System.out.println("Total nacionales: $"
                + String.format("%.0f", gestor.calcularTotalPorTipo(TipoEnvio.NACIONAL)));
        System.out.println("Total internacionales: $"
                + String.format("%.0f", gestor.calcularTotalPorTipo(TipoEnvio.INTERNACIONAL)));
        System.out.println("Total exprés: $"
                + String.format("%.0f", gestor.calcularTotalPorTipo(TipoEnvio.EXPRES)));

        System.out.println();
        Envio buscado = gestor.buscarPorCodigo("I-001");
        if (buscado != null) {
            System.out.println("Envío encontrado: " + buscado);
        } else {
            System.out.println("Envío no encontrado.");
        }
    }
}
