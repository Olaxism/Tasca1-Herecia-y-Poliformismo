package sprint_1.tasca_1.nivel_2.interfaces;

public interface Camara {

    default void fotografiar() {
        System.out.println("Se esta haciendo una foto");
    }
}
