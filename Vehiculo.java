package sprint1;

public class Vehiculo {

	private static final String marca = "Toyota";
	private static String modelo;
	private final double potencia = 75.0;
	private static String frenar;
	private String acelerar;

	public Vehiculo (String modelo) {
	Vehiculo.modelo = modelo;
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

