/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

/**
 *
 * @author chimu
 */
public class Libro extends Recurso{

    public Libro(String titulo, String autor, int idetificador) {
        super(titulo, autor, idetificador);
    }

    @Override
    public void prestar() {
        setEsta_prestado(true);
    }

    @Override
    public void devolver() {
        setEsta_prestado(false);
    }
    
    
}
