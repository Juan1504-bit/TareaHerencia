package co.edu.uniquindio.poo.model;


public class EnvioExpres extends EnvioNacional {
    private int horasMaximas;

    public EnvioExpres(String codigo, String destinatario, double pesoKg,
                       String ciudadDestino, boolean domicilio, int horasMaximas) {
        super(codigo, destinatario, pesoKg, ciudadDestino, domicilio);
        this.horasMaximas = horasMaximas;
    }

    public int getHorasMaximas() {
        return horasMaximas;
    }

    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto() * 1.30;
        if (horasMaximas <= 24) {
            costo = costo + 5000;
        }
        return costo;
    }

    @Override
    public TipoEnvio getTipo() {
        return TipoEnvio.EXPRES;
    }

    @Override
    public String toString() {
        return super.toString() + " | Horas máximas: " + horasMaximas;
    }
}