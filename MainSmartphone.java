package sprint1;

public class MainSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone s1 = new Smartphone ("Samsung", "Galaxy A14", "629-47-37-27");
		Smartphone s2 = new Smartphone ("Motorola", "Moto G84", "672-57-67-77");
	    //Telefono t1 = new Telefono ("SonyEricsson", "W910i", "673-21-32-43");
		//Porque no puedo hacer un telefono que no sea Smart?
		//Pude hacerlo en el proceso de hacer el ejercicio si la clase Telefono no era abstracta.
		
	    Camara c1 = new Camara();
	    Reloj r1 = new Reloj();
	    
	    Camara c2 = new Camara();
	    Reloj r2 = new Reloj();
		
	    s1.añadirCamara(c1);
	    s1.añadirReloj(r1);
	    
	    s2.añadirCamara(c2);
	    s2.añadirReloj(r2);
	    
	    s1.llamar(s2.getNumero()); // El Smartphone 1 esta llamando al Smartphone 2
	    s1.alarma();
	    s1.fotografiar();
	}

}
