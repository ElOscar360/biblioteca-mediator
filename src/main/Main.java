package main;

import colleague.Estudiante;
import mediator.BibliotecaMediator;
import mediator.Mediator;
import model.Libro;

public class Main {

    public static void main(String[] args) {
        Mediator mediador = new BibliotecaMediator();

        Libro libro = new Libro("Patrones de Diseño");

        Estudiante ana = new Estudiante("Ana", mediador);
        Estudiante carlos = new Estudiante("Carlos", mediador);

        ana.solicitarLibro(libro);      // Ana pide el libro -> disponible
        carlos.solicitarLibro(libro);   // Carlos pide el mismo libro -> no disponible
        ana.devolverLibro(libro);       // Ana lo devuelve -> vuelve a estar disponible
        carlos.solicitarLibro(libro);   // Carlos vuelve a pedirlo -> aprobado
    }
}
