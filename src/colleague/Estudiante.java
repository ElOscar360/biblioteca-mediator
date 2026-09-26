package colleague;

import mediator.Mediator;
import model.Libro;

/**
 * Colega del patrón Mediator: el estudiante solo conoce al mediador,
 * nunca a otros estudiantes.
 */
public class Estudiante {

    private final String nombre;
    private final Mediator mediador;

    public Estudiante(String nombre, Mediator mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarLibro(Libro libro) {
        mediador.solicitarPrestamo(this, libro);
    }

    public void devolverLibro(Libro libro) {
        mediador.devolverLibro(this, libro);
    }
}
