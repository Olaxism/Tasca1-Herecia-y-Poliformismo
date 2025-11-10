package sprint_1.tasca_1.nivel_1.ejercicio_1;

import sprint_1.tasca_1.nivel_1.ejercicio_1.classes.Instrumento;
import sprint_1.tasca_1.nivel_1.ejercicio_1.classes.InstrumentoCuerda;
import sprint_1.tasca_1.nivel_1.ejercicio_1.classes.InstrumentoPercusion;
import sprint_1.tasca_1.nivel_1.ejercicio_1.classes.InstrumentoViento;

public class MainInstrumento {

    public static void main(String[] args) {
        System.out.println("Comencemos a tocar");

        InstrumentoPercusion i1 = new InstrumentoPercusion("Xilofono", 150.75);
        InstrumentoViento i2 = new InstrumentoViento("Fagot", 120.90);
        InstrumentoCuerda i3 = new InstrumentoCuerda("Bajo", 284.99);

        i1.tocar();
        i3.tocar();
        i2.tocar();

        System.out.println("Comprobacion del metodo estatico desde un atributo de la clase" + Instrumento.marca);
    }
}