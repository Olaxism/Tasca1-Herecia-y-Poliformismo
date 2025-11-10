package sprint_1.tasca_1.nivel_2.classes;


import sprint_1.tasca_1.nivel_2.interfaces.Camara;
import sprint_1.tasca_1.nivel_2.interfaces.Reloj;

public class Smartphone extends Telefono implements Camara, Reloj {

    public Smartphone (String marca, String modelo, String numero) {
        super (marca, modelo, numero);
    }

    @Override
    public String toString() {
        return "Smartphone [Marca= " + getMarca()
                + ", Modelo= " + getModelo() + ", Numero= " + getNumero() + "]";
    }

}
