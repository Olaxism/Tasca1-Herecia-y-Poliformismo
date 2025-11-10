package sprint_1.tasca_1.nivel_1.ejercicio_1.classes;

public abstract class Instrumento {

    private String nombre;
    private double precio;
    public static String marca;

    static {
        System.out.println("Bloque estatico ejecutado");
     marca = "JBL";
    }

    public Instrumento (String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void tocar();

    @Override
    public String toString() {
        return "\nInstrumento {Nombre= " + getNombre() +
                ", Precio= " + getPrecio() + " euros.}";}
    }

