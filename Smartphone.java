package sprint1;

import java.util.ArrayList;

public class Smartphone extends Telefono {
	
	private ArrayList<Camara> camaras;
	private ArrayList<Reloj> relojes;

	public Smartphone (String marca, String modelo, String numero) {
		super (marca, modelo, numero);
		this.camaras = new ArrayList<>();
		this.relojes = new ArrayList<>();
	}
	
	public void añadirCamara(Camara camara) {
		camaras.add(camara);
	}

	public void añadirReloj(Reloj reloj) {
		relojes.add(reloj);
	}
	
	public void fotografiar() {
		if (!camaras.isEmpty()) {
			for(Camara camara : camaras) {
				camara.fotografiar();
			}
		}else {
			System.out.println("Ups! Al parecer no tiene camaras este teléfono");
		}
	}
	
	public void alarma() {
		if (!relojes.isEmpty()) {
			for (Reloj reloj : relojes) {
				reloj.alarma();
			}
		}else {
			System.out.println("Al parecer el reloj de este telefono no tiene alarma");
		}
	}

	@Override
	public String toString() {
		return "Smartphone [camaras= " + camaras + ", relojes= " + relojes + ", getMarca= " + getMarca()
				+ ", getModelo= " + getModelo() + ", getNumero= " + getNumero() + "]";
	}
	
	
}
