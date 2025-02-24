/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bibliotecataller;

import javax.swing.JOptionPane;

/**
 *
 * @author chimu
 */
public class BibliotecaTaller {

    public static void main(String[] args) {
        int volver = JOptionPane.YES_OPTION; // Inicializar la variable volver para que el ciclo while se ejecute al menos una vez

        while (volver == JOptionPane.YES_OPTION) {
            String message = "Menú de opciones:\n"
                    + "1. Solicitar libro \n"
                    + "2. Devolver libro \n"
                    + "3. Crear usuario \n"
                    + "4. Agregar libro \n";

            int op_menu = Integer.parseInt(JOptionPane.showInputDialog(null, message, "MENU", JOptionPane.QUESTION_MESSAGE));

            Libro libro = null; // Declarar la variable libro fuera del switch

            switch (op_menu) {
                case 1:
                    String titulo = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    String autor = JOptionPane.showInputDialog(null, "Ingrese el autor del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    int identificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el identificador del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE));
                    String date = JOptionPane.showInputDialog(null, "Ingrese la fecha del prestamo", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    libro = new Libro(titulo, autor, identificador); // Asignar valor a la variable libro
                    libro.prestar();
                    libro.setDate_loan(date);
                    break;
                case 2:
                    titulo = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    autor = JOptionPane.showInputDialog(null, "Ingrese el autor del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    identificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el identificador del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE));
                    libro = new Libro(titulo, autor, identificador); // Asignar valor a la variable libro
                    libro.devolver(); // Asumiendo que existe un método devolver en la clase Libro
                    break;
                case 3:
                    String name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE);
                    int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de documento", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE));
                    Usuario usuario = new Usuario(name, documento);
                    break;
                case 4:
                    titulo = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    autor = JOptionPane.showInputDialog(null, "Ingrese el autor del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE);
                    identificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el identificador del libro", "DATOS PRESTAMO", JOptionPane.QUESTION_MESSAGE));
                    libro = new Libro(titulo, autor, identificador); // Asignar valor a la variable libro
                    libro.setEsta_prestado(false);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            // Usar JOptionPane.YES_NO_OPTION para preguntar si desea volver al menú
            volver = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú anterior?", "MENU", JOptionPane.YES_NO_OPTION);
        }
    }
}