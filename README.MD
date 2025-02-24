# BibliotecaTaller

Este es un proyecto de Java que simula un sistema de gestión de una biblioteca. Permite realizar operaciones como solicitar libros, devolver libros, crear usuarios y agregar nuevos libros al sistema.

## Características principales

- **Solicitar libro**: Permite a los usuarios solicitar un libro ingresando su título, autor, identificador y fecha de préstamo.
- **Devolver libro**: Permite a los usuarios devolver un libro.
- **Crear usuario**: Permite registrar nuevos usuarios con un nombre y número de documento.
- **Agregar libro**: Permite agregar nuevos libros al sistema.

## Estructura del proyecto

- **BibliotecaTaller.java**: Clase principal que contiene el menú de opciones y la lógica de interacción con el usuario.
- **Libro.java**: Clase que representa un libro y hereda de la clase `Recurso`. Implementa los métodos `prestar` y `devolver`.
- **Recurso.java**: Clase abstracta que define las propiedades y métodos comunes para los recursos de la biblioteca (como libros).
- **Usuario.java**: Clase que representa a un usuario de la biblioteca, con métodos para gestionar los libros prestados.

## Requisitos

- Java 17 o superior.
- Maven para la gestión de dependencias y construcción del proyecto.

## Configuración

1. Clona el repositorio:
   ```bash
   git clone https://github.com/JuanJoseBastoGonzalez/MenuBiblioteca.git