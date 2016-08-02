/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

/**
 *
 * @author Ivan
 */
public class Alumno {
    LinkedList aprobadas = new LinkedList();
    LinkedList firmadas = new LinkedList();
    LinkedList puedeCursar = new LinkedList();
    LinkedList enCurso = new LinkedList();
    File fichero = new File("Datos\\datosAlumno.json");
    
    public Alumno(){
        
    }

    
    public void cargarDatos(){
        try {
            
            /*TODO::*/
        BufferedReader reader = new BufferedReader(new FileReader(this.fichero));
        Gson gson = new GsonBuilder().create();
        Materia[] mats = gson.fromJson(reader, Materia[].class);
            
        } catch (Exception e) {
        }
        
    }
    
    public LinkedList getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(LinkedList aprobadas) {
        this.aprobadas = aprobadas;
    }

    public LinkedList getFirmadas() {
        return firmadas;
    }

    public void setFirmadas(LinkedList firmadas) {
        this.firmadas = firmadas;
    }

    public LinkedList getEnCurso() {
        return enCurso;
    }

    public void setEnCurso(LinkedList enCurso) {
        this.enCurso = enCurso;
    }

    public LinkedList getPuedeCursar() {
        return puedeCursar;
    }

    public void setPuedeCursar(LinkedList puedeCursar) {
        this.puedeCursar = puedeCursar;
    }
    
    
    
}
