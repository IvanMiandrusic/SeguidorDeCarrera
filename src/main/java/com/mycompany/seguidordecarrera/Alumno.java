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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author Ivan
 */
public class Alumno {

    private LinkedList<Materia> aprobadas = new LinkedList();
    private LinkedList<Materia> firmadas = new LinkedList();
    private LinkedList<Materia> puedeCursar = new LinkedList();
    private LinkedList<Materia> enCurso = new LinkedList();
    private LinkedList<NotasMateria> notasDeMat = new LinkedList();
    private int nroFirmadas = 0;
    private int nroAprob = 0;

    public Alumno() {

    }

    public boolean puedeCursar(Materia unaMat) {
        LinkedList<Correlativa> correlat = unaMat.getCorrelativas();
        Iterator<Correlativa> it = correlat.iterator();
        Correlativa element;
        LinkedList<Boolean> matches = new LinkedList();
        while (it.hasNext()) {
            element = it.next();
            Materia mat = element.getMateria();

            if (element.getCondAprob().equals("F") && this.firmadas.stream().anyMatch(f -> f.getCodigo().equals(mat.getCodigo()))) {
                matches.add(true);

            } else if (this.aprobadas.stream().anyMatch(a -> a.getCodigo().equals(mat.getCodigo()))) {
                matches.add(true);

            } else {
                matches.add(false);
            }

        }
        boolean resu = (matches.stream().allMatch(e -> e.equals(true)) && matches.size() > 0);
        return resu;

    }

    public boolean puedeFirmar(Materia unaMateria) {
        NotasMateria notMat = this.obtenerNotasMat(unaMateria);
        return (notMat.aproboPrimerParcial() && notMat.aproboSegundoParcial() && notMat.aproboTP());

    }

    public void eliminarMateria(String codigo) {
        this.firmadas.removeIf(m -> m.getCodigo().equals(codigo));
        this.aprobadas.removeIf(m -> m.getCodigo().equals(codigo));
        this.enCurso.removeIf(m -> m.getCodigo().equals(codigo));
        this.notasDeMat.removeIf(n -> n.getMateria().getCodigo().equals(codigo));
        
    }

    public boolean puedeAprobar(Materia unaMateria) {
        NotasMateria notMat = this.obtenerNotasMat(unaMateria);
        return (notMat.aproboFinales());

    }

    private NotasMateria obtenerNotasMat(Materia unaMat) {
        return this.notasDeMat.stream().filter(n -> n.getMateria().getCodigo().equals(unaMat.getCodigo())).findFirst().get();
    }

    public void actualizarNotas(ArrayList<String> unasNotas, Materia unaMateria) {
        NotasMateria notMat = this.obtenerNotasMat(unaMateria);
        notMat.actualizar(unasNotas);
    }

    public void cursarMateria(Materia unaMateria) {
        NotasMateria unaNota = new NotasMateria(unaMateria);
        this.notasDeMat.add(unaNota);
        this.enCurso.add(unaMateria);

    }

    public boolean noCursoMateria(Materia unaMat) {

        return !(this.firmadas.stream().anyMatch(m -> m.getCodigo().equals(unaMat.getCodigo()))) && !(this.aprobadas.stream().anyMatch(a -> a.getCodigo().equals(unaMat.getCodigo()))) && !(this.enCurso.stream().anyMatch(c -> c.getCodigo().equals(unaMat.getCodigo())));

    }

    public int NroMatFirmadas() {
        return this.nroFirmadas;
    }

    public int NroMatAprobadas() {
        return this.nroAprob;
    }

    public int cantFinalesPend() {
        return this.firmadas.size();
    }

    public int PorcentajeAprobadas() {
        return ((this.NroMatAprobadas()) * 100) / 43;
    }

    public int NroMatEnCurso() {
        return this.enCurso.size();
    }

    public int PorcentajeFirmadas() {
        return ((this.NroMatFirmadas()) * 100) / 43;
    }

    public int PromedioGeneral() {
        Iterator<NotasMateria> it = this.notasDeMat.iterator();
        NotasMateria element;
        int suma = 0;
        while (it.hasNext()) {
            element = it.next();
            //--------------------------------------------------------------------------- TERMINAR---------
        }
        return 0;
    }

    public boolean firmarMateria(Materia unaMateria) {
        boolean resu = false;
        if (this.puedeFirmar(unaMateria)) {
            this.firmadas.add(unaMateria);
            this.nroFirmadas = this.nroFirmadas + 1;
            Materia aEliminar = this.enCurso.stream().filter(m -> m.getCodigo().equals(unaMateria.getCodigo())).findFirst().get();
            this.enCurso.remove(aEliminar);
            resu = true;
        } else {
            Seguidor.lanzarAlerta("No cumple los requisitos necesarios para ser firmada");

        }
        return resu;
    }

    public boolean apruebaMateria(Materia unaMateria) {
        boolean resu = false;
        if (this.puedeAprobar(unaMateria)) {
            this.aprobadas.add(unaMateria);
            this.nroAprob = this.nroAprob + 1;
            Materia aEliminar = this.firmadas.stream().filter(m -> m.getCodigo().equals(unaMateria.getCodigo())).findFirst().get();
            this.firmadas.remove(aEliminar);
            resu = true;
        } else {
            Seguidor.lanzarAlerta("No cumple los requisitos necesarios para ser aprobada");

        }
        return resu;
    }

    public ArrayList<String> getNotas(Materia unaMateria) {
        NotasMateria notMat = this.obtenerNotasMat(unaMateria);
        return notMat.getNotas();
    }

    public void setNotas(ArrayList<String> notas, Materia unaMateria) {
        NotasMateria notMat = this.obtenerNotasMat(unaMateria);
        notMat.setNotas(notas);
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

    public void setFirmada(Materia firmada) {
        this.firmadas.add(firmada);
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
