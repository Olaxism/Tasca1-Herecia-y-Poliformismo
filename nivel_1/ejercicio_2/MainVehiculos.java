package sprint_1.tasca_1.nivel_1.ejercicio_2;

import sprint_1.tasca_1.nivel_1.ejercicio_2.classes.Vehiculo;

public class MainVehiculos {

    public static void main(String[] args) {

        System.out.println("\nVamos a probar Vehiculos");
        System.out.println("");


        Vehiculo v1 = new Vehiculo ();
        Vehiculo v2 = new Vehiculo ();


        v1.acelerar();
        Vehiculo.frenar();
        v2.acelerar();
    }
}
