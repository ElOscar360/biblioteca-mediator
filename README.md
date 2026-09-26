# Biblioteca Mediator


## Estructura del proyecto

```
biblioteca-mediator/
└── src/
    ├── mediator/
    │   ├── Mediator.java            # Interfaz del patrón
    │   └── BibliotecaMediator.java  # Mediador concreto
    ├── colleague/
    │   └── Estudiante.java          # Colega: solo conoce al mediador
    ├── model/
    │   └── Libro.java               # Título + disponibilidad
    └── main/
        └── Main.java                # Escenario de prueba
```

## Cómo funciona

- `Estudiante` no tiene ninguna referencia a otros estudiantes; solo
  conoce a un `Mediator`.
- Cuando un estudiante solicita o devuelve un libro, delega la acción
  en el mediador (`mediador.solicitarPrestamo(...)` /
  `mediador.devolverLibro(...)`).
- `BibliotecaMediator` es quien decide si el préstamo se aprueba o se
  rechaza según la disponibilidad del `Libro`, y quien actualiza esa
  disponibilidad al recibir una devolución.


## Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto (`biblioteca-mediator/`):

```bash
# Compilar
javac -encoding UTF-8 -d out $(find src -name "*.java")

# Ejecutar
java -cp out main.Main
```

## Salida esperada

```
Ana solicita el libro "Patrones de Diseño".
Biblioteca: préstamo aprobado para Ana.
Carlos solicita el libro "Patrones de Diseño".
Biblioteca: el libro no está disponible.
Ana devuelve el libro "Patrones de Diseño".
Biblioteca: libro disponible nuevamente.
Carlos solicita el libro "Patrones de Diseño".
Biblioteca: préstamo aprobado para Carlos.
```
