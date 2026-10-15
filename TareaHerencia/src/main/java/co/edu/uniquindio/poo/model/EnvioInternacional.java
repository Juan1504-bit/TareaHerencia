package co.edu.uniquindio.poo.model;


public class EnvioInternacional extends Envio {
    private String paisDestino;
    private boolean seguro;

    public EnvioInternacional(String codigo, String destinatario, double pesoKg,
                              String paisDestino, boolean seguro) {
        super(codigo, destinatario, pesoKg);
        this.paisDestino = paisDestino;
        this.seguro = seguro;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public boolean isSeguro() {
        return seguro;
    }

    @Override
    public double calcularCosto() {
        double costo = 15000 + 9000 * getPesoKg();
        if (seguro) {
            costo = costo + 20000;
        }
        return costo;
    }

    @Override
    public TipoEnvio getTipo() {
        return TipoEnvio.INTERNACIONAL;
    }

    @Override
    public String toString() {
        String texto;
        if (seguro) {
            texto = "Sí";
        } else {
            texto = "No";
        }
        return super.toString()
                + " | País: " + paisDestino
                + " | Seguro: " + texto;
    }
}