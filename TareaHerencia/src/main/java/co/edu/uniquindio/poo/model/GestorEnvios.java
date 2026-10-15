package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class GestorEnvios {
    private ArrayList<Envio> envios = new ArrayList<Envio>();

    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }

    public void mostrarEnvios() {
        for (Envio e : envios) {
            System.out.println(e);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Envio e : envios) {
            total = total + e.calcularCosto();
        }
        return total;
    }


    public double calcularTotalPorTipo(TipoEnvio tipo) {
        double total = 0;
        for (Envio e : envios) {
            if (e.getTipo() == tipo) {
                total = total + e.calcularCosto();
            }
        }
        return total;
    }

    public Envio buscarPorCodigo(String codigo) {
        for (Envio e : envios) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }
}