package sprint_1.tasca_1.nivel_2.classes;

public abstract class Telefono {

    private String marca;
    private String modelo;
    private String numero;

    public Telefono (String marca, String modelo, String numero) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumero() {
        return numero;
    }

    public String llamar(String numElegido) {
        System.out.println("Llamando al número: " + numElegido);
        return numElegido;
    }

    @Override
    public String toString() {
        return "Telefono [marca= " + getMarca() + ", modelo= " + getModelo() + ", numero= " + getNumero() + "]";
    }
}
