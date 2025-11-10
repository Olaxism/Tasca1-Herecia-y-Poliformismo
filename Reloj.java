package sprint_1.tasca_1.nivel_2.interfaces;

public interface Reloj {

    default void alarma() {
        System.out.println("Está sonando la alarma");
    }
}
