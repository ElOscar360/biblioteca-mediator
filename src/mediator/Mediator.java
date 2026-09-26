package mediator;

import colleague.Estudiante;
import model.Libro;

/**
 * Define el contrato de comunicación entre los estudiantes (colegas)
 * y la biblioteca. Ningún estudiante conoce a otro directamente: todo
 * pasa por una implementación de esta interfaz.
 */
public interface Mediator {

    void solicitarPrestamo(Estudiante estudiante, Libro libro);

    void devolverLibro(Estudiante estudiante, Libro libro);
}
