/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

/**
 *
 * @author chimu
 */
public  abstract class Recurso {
    private String titulo;
    private String autor;
    private int idetificador;
    private String date_loan;
    private boolean esta_prestado;

    public Recurso(String titulo, String autor, int idetificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.idetificador = idetificador;
    }

    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdetificador() {
        return idetificador;
    }

    public void setIdetificador(int idetificador) {
        this.idetificador = idetificador;
    }

    public String getDate_loan() {
        return date_loan;
    }

    public void setDate_loan(String date_loan) {
        this.date_loan = date_loan;
    }

    public boolean isEsta_prestado() {
        return esta_prestado;
    }

    public void setEsta_prestado(boolean esta_prestado) {
        this.esta_prestado = esta_prestado;
    }
        
 public abstract void prestar();
 public  abstract void devolver();

}
