/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import java.util.LinkedList;


/**
 *
 * @author Ivan
 */
public class Materia {
    private int id;
    private String nombre;
    private String nivel;
    private String notas[] = new String[7];
    private int estado = 0;
    private LinkedList correlativas = new LinkedList();
    private boolean puede = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public LinkedList getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(LinkedList correlativas) {
        this.correlativas = correlativas;
    }

    public boolean isPuede() {
        return puede;
    }

    public void setPuede(boolean puede) {
        this.puede = puede;
    }

    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Materia(String unCodigo, String unNombre, String unNivel) {
    this.setNombre(unNombre);
    this.setNivel(unNivel);
    this.setCodigo(unCodigo);


    }
  
                       
}