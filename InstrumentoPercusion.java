package sprint_1.tasca_1.nivel_1.ejercicio_1;

public class InstrumentoPercusion extends Instrumento{

    public InstrumentoPercusion (String nombre, double precio) {
        super (nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se esta tocando un intrumento de percusión");
    }
}