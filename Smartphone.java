package sprint_1.tasca_1.nivel_2;


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
