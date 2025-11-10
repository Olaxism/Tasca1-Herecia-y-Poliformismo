package sprint_1.tasca_1.nivel_1.ejercicio_2.classes;

public class Vehiculo {

    private static final String marca = "Toyota";
    private static String modelo;
    private final double potencia;
    private static String frenar;
    private String acelerar;

    public Vehiculo () {
        this.potencia = 90.0;
    }

    public static String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public static String frenar() {
        System.out.println("El vehiculo esta frenando");
        return frenar;
    }

    public String acelerar() {
        System.out.println("El vehiculo esta acelerando");
        return acelerar;
    }

    @Override
    public String toString() {
        return "Vehiculo marca Toyota [Modelo= " + getModelo()
                + "potencia= " + potencia + "]";
    }
}
