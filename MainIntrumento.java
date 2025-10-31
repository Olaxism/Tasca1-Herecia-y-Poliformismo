package sprint1;

public class MainIntrumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Comencemos a tocar");

		
		Instrumento I1 = new Instrumento ("Xilófono", 32.50, "\nEsta sonando un instrumento de percusión.");
		Instrumento I2 = new Instrumento ( "Fagot", 120.90, "\nEsta sonando un instrumento de viento.");
		Instrumento I3 = new Instrumento ("Bajo", 285.00, "\nEsta sonando un intrumento de cuerda.");
		
		I1.tocar();
		I3.tocar();
		I2.tocar();
		I2.tocar();
		
		I1.toString();
		System.out.println(I1.toString() + I2.toString() + I3.toString());
	}
}
