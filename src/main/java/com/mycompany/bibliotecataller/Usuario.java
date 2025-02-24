/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

import java.util.ArrayList;

/**
 *
 * @author chimu
 */
public class Usuario {

    private String name;
    private int document;
    private boolean tiene_prestamos;
    private ArrayList<Integer> identificador_libros_prestados = new ArrayList<>();

    public Usuario(String name, int document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public boolean isTiene_prestamos() {
        return tiene_prestamos;
    }

    public void setTiene_prestamos(boolean tiene_prestamos) {
        this.tiene_prestamos = tiene_prestamos;
    }

    public ArrayList<Integer> getIdentificador_libros_prestados() {
        return identificador_libros_prestados;
    }

    public void setIdentificador_libros_prestados(ArrayList<Integer> identificador_libros_prestados) {
        this.identificador_libros_prestados = identificador_libros_prestados;
    }

    public void anadir_libro(int identificador) {

        identificador_libros_prestados.add(identificador);
    }

    public void devolvio_libro(int indentificador) {
    }
}
