package co.edu.uniquindio.poo.model;


public class EnvioNacional extends Envio {
    private String ciudadDestino;
    private boolean domicilio;

    public EnvioNacional(String codigo, String destinatario, double pesoKg,
                         String ciudadDestino, boolean domicilio) {
        super(codigo, destinatario, pesoKg);
        this.ciudadDestino = ciudadDestino;
        this.domicilio = domicilio;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    @Override
    public double calcularCosto() {
        double costo = 6000 + 2000 * getPesoKg();
        if (domicilio) {
            costo = costo + 3000;
        }
        return costo;
    }

    @Override
    public TipoEnvio getTipo() {
        return TipoEnvio.NACIONAL;
    }

    @Override
    public String toString() {
        String texto;
        if (domicilio) {
            texto = "Sí";
        } else {
            texto = "No";
        }
        return super.toString()
                + " | Ciudad: " + ciudadDestino
                + " | Domicilio: " + texto;
    }
}
