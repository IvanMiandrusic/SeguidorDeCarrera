/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;


/**
 *
 * @author Ivan
 */
public class Materia {
    private int id;
    private String nombre;
    private String nivel;
    private int estado = 0;
    private ArrayList<String> days = new ArrayList(Arrays.asList("-", "-"));
    private LinkedList<Correlativa> correlativas;
    private boolean puede = true;
    private String codigo;

    
    public Materia(String unCodigo, String unNombre, String unNivel) {
    this.setNombre(unNombre);
    this.setNivel(unNivel);
    this.setCodigo(unCodigo);
    this.correlativas = new LinkedList<>();

    }
    
    public void agregarDias(String dia1, String dia2){
        this.days.set(0, dia1);
        this.days.set(1, dia2);
    }
    
    public LinkedList getCorrelativas(){
        return this.correlativas;
    }
    
    public void AgregarCorrelativa(Correlativa m){
        this.correlativas.add(m);
    }
    
    
    public void eliminarCorrelativas(Materia aMat){
        Correlativa aEliminar = this.correlativas.stream().filter(c -> (c.getMateria().getCodigo()).equals(aMat.getCodigo())).findFirst().get();
        this.correlativas.remove(aEliminar);
        this.correlativas.stream().forEach(c->System.out.print(c.mat.nombre));
        
    }
    
    public boolean tieneCorrelativas(){
        if(this.correlativas.size()>0){
            return true;
        }else{
            return false;
        }
    }
    
   
    

   
    
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

    

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setCorrelativas( LinkedList correlat) {
        this.correlativas = correlat;
    }

    public boolean isPuede() {
        return puede;
    }

    public void setPuede(boolean puede) {
        this.puede = puede;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDia1(){
       return this.days.get(0);
    }
    
    public String getDia2(){
       return this.days.get(1);
    }

                       
}