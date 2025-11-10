package sprint_1.tasca_1.nivel_2;

public interface Reloj {

    default void alarma() {
        System.out.println("Está sonando la alarma");
    }
}
