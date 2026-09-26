package mediator;

import colleague.Estudiante;
import model.Libro;

/**
 * Mediador concreto: centraliza toda la lógica de préstamos y
 * devoluciones para que los estudiantes no dependan entre sí.
 */
public class BibliotecaMediator implements Mediator {

    @Override
    public void solicitarPrestamo(Estudiante estudiante, Libro libro) {
        System.out.println(estudiante.getNombre() + " solicita el libro \"" + libro.getTitulo() + "\".");

        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Biblioteca: préstamo aprobado para " + estudiante.getNombre() + ".");
        } else {
            System.out.println("Biblioteca: el libro no está disponible.");
        }
    }

    @Override
    public void devolverLibro(Estudiante estudiante, Libro libro) {
        System.out.println(estudiante.getNombre() + " devuelve el libro \"" + libro.getTitulo() + "\".");
        libro.setDisponible(true);
        System.out.println("Biblioteca: libro disponible nuevamente.");
    }
}
