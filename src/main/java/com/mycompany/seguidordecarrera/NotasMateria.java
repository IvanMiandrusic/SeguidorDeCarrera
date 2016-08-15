/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ivan
 */
public class NotasMateria {

    private ArrayList<String> notas = new ArrayList(Arrays.asList("0", "0", "0", "0", "0", "0", "0"));
    Materia materia;


    NotasMateria(Materia unaMat) {
        this.materia = unaMat;

    }

    public boolean aproboPrimerParcial() {
        return (Integer.parseInt(this.notas.get(0)) > 3 || Integer.parseInt(this.notas.get(2)) > 3 || Integer.parseInt(this.notas.get(3)) > 3);
    }

    public boolean aproboSegundoParcial() {
        return (Integer.parseInt(this.notas.get(1)) > 3 || Integer.parseInt(this.notas.get(4)) > 3 || Integer.parseInt(this.notas.get(5)) > 3);
    }

    public boolean aproboTP() {
        return (Integer.parseInt(this.notas.get(6)) > 3);
    }

    public void actualizar(ArrayList<String> nuevas) {
        this.notas = nuevas;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }



}
