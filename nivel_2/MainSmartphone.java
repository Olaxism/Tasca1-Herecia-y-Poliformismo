package sprint_1.tasca_1.nivel_2;

import sprint_1.tasca_1.nivel_2.classes.Smartphone;

public class MainSmartphone {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Smartphone s1 = new Smartphone ("Samsung", "Galaxy A14", "629-47-37-27");
        Smartphone s2 = new Smartphone ("Motorola", "Moto G84", "672-57-67-77");
        Smartphone t1 = new Smartphone("SonyEricsson", "W910i", "673-21-32-43");


        s1.llamar(s2.getNumero());
        s1.alarma();
        s1.fotografiar();
        t1.alarma();
    }
}

