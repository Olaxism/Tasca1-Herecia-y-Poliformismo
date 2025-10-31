package sprint1;

public class Instrumento {

	private String nombre;
	private double precio;
	private static String tocando;
	
	static {
	System.out.println("Bloque estatico ejecutado");
	}
	
	public Instrumento (String nombre, double precio, String tocando) {
	this.nombre = nombre;
	this.precio = precio;
	Instrumento.tocando = tocando;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String tocar() {
		System.out.print(tocando);
		return tocando;
	}
	
	
	@Override
	public String toString() {
		return "\nInstrumento {Nombre= " + getNombre() +
		", Precio= " + getPrecio() + " euros.}";}
}

