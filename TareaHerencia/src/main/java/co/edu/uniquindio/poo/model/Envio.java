package co.edu.uniquindio.poo.model;


public abstract class Envio {
    private final String codigo;
    private final String destinatario;
    private final double pesoKg;

    public Envio(String codigo, String destinatario, double pesoKg) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.pesoKg = pesoKg;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPesoKg() {
        return pesoKg;
    }


    public abstract double calcularCosto();

    public abstract TipoEnvio getTipo();

    @Override
    public String toString() {
        return "Tipo: " + getTipo()
                + " | Código: " + codigo
                + " | Destinatario: " + destinatario
                + " | Peso: " + pesoKg + " kg"
                + " | Costo: $" + String.format("%.0f", calcularCosto());
    }
}
