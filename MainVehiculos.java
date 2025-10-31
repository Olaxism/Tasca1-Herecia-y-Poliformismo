package sprint1;

public class MainVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vamos a probar Vehiculos");
		
		
		Vehiculo v1 = new Vehiculo ("Camry");
		Vehiculo v2 = new Vehiculo ("Corolla");
		Vehiculo v3 = new Vehiculo ("Supra");
		Vehiculo v4 = new Vehiculo ("Yaris");
		
		v1.acelerar();
		Vehiculo.frenar();
		v2.acelerar();
		v3.acelerar();
		v4.acelerar();

        System.out.println(Vehiculo.getMarca());
	}

}
