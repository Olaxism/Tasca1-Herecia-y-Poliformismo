package sprint_1.tasca_1.nivel_1.ejercicio_2;

public class MainVehiculos {

    public static void main(String[] args) {

        System.out.println("\nVamos a probar Vehiculos");
        System.out.println("");


        Vehiculo v1 = new Vehiculo ("Camry");
        Vehiculo v2 = new Vehiculo ("Corolla");


        v1.acelerar();
        Vehiculo.frenar();
        v2.acelerar();
    }

}

