/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.seguidordecarrera.panels.NuevaEnCursoPanel;
import com.mycompany.seguidordecarrera.panels.AdminPanel;
import com.mycompany.seguidordecarrera.panels.DetallesCursada;
import com.mycompany.seguidordecarrera.panels.ModificarNotas;
import com.mycompany.seguidordecarrera.panels.ModificarNotasFinal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Ivan
 */
public class Resumen extends javax.swing.JFrame {

    AdminPanel admin = new AdminPanel(this);
    ModificarNotas modifPanel = new ModificarNotas();
    Alumno alumno;
    Materia matActual;
    int selectedRow;
    ArrayList<Materia> materias;
    DefaultTableModel tb;
    String tableName;
    File ficheroMats = new File("Datos\\materias.json");
    File ficheroAlumnos = new File("Datos\\alumnos.json");

    public Resumen() {

        initComponents();
        tb = (DefaultTableModel) tbEnCurso.getModel();
        this.cargarDatosAlumno();
        this.tableName = "En Curso";
        this.inicializarActionListenersCB();
        this.cargarEstadisticas();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firmaLb = new javax.swing.JLabel();
        aprobLB = new javax.swing.JLabel();
        enCursoLb = new javax.swing.JLabel();
        porcFirmLb = new javax.swing.JLabel();
        porcAprobLb = new javax.swing.JLabel();
        promGralLb = new javax.swing.JLabel();
        promBuenoLb = new javax.swing.JLabel();
        lbFirmadas = new javax.swing.JLabel();
        lbAprobadas = new javax.swing.JLabel();
        lbEnCurso = new javax.swing.JLabel();
        lbProcentajeFirmadas = new javax.swing.JLabel();
        lbPorcentajeAprob = new javax.swing.JLabel();
        lbPromedioGral = new javax.swing.JLabel();
        lbPromedioBueno = new javax.swing.JLabel();
        cbTabla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnFirma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEnCurso = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resumen");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguidor de Carrera"));

        jLabel1.setText("Materias Totales: 43");

        firmaLb.setText("Finales Pend:");

        aprobLB.setText("Aprobadas:");

        enCursoLb.setText("En Curso:");

        porcFirmLb.setText("% Firmadas: ");

        porcAprobLb.setText("% Aprobadas: ");

        promGralLb.setText("Promedio Gral: ");

        promBuenoLb.setText("Promedio \"Bueno\": ");

        lbFirmadas.setText("-");

        lbAprobadas.setText("-");

        lbEnCurso.setText("-");

        lbProcentajeFirmadas.setText("-");

        lbPorcentajeAprob.setText("-");

        lbPromedioGral.setText("-");

        lbPromedioBueno.setText("-");

        cbTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Curso", "Finales Pend.", "Aprobadas" }));
        cbTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTablaActionPerformed(evt);
            }
        });

        jButton1.setText("General");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nueva");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModif.setText("Modificar");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        btnFirma.setText("Firmar");
        btnFirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firmaLb)
                                    .addComponent(enCursoLb, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEnCurso)
                                    .addComponent(lbFirmadas)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(aprobLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbAprobadas)))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(porcFirmLb)
                            .addComponent(porcAprobLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPorcentajeAprob)
                            .addComponent(lbProcentajeFirmadas))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(promGralLb)
                            .addComponent(promBuenoLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPromedioBueno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbPromedioGral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addComponent(jLabel1))
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firmaLb)
                    .addComponent(porcFirmLb)
                    .addComponent(promGralLb)
                    .addComponent(lbFirmadas)
                    .addComponent(lbProcentajeFirmadas)
                    .addComponent(lbPromedioGral)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprobLB)
                    .addComponent(porcAprobLb)
                    .addComponent(promBuenoLb)
                    .addComponent(lbAprobadas)
                    .addComponent(lbPorcentajeAprob)
                    .addComponent(lbPromedioBueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enCursoLb)
                    .addComponent(lbEnCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModif)
                    .addComponent(btnFirma)))
        );

        tbEnCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Dia 1", "Dia 2", "1er Parcial", "2do Parcial", "1er Recu (P.P.)", "2do Recu (P.P)", "1er Recu (S.P.)", "2do Recu (S.P.)", "TP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEnCurso);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar)
                    .addComponent(btnAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        NuevaEnCursoPanel nuevo = new NuevaEnCursoPanel();
        nuevo.datosDeCampo(this, this.admin, this.alumno);
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        this.admin.setElAlumno(this.alumno);
        this.admin.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    public void actualizarTablaEnCurso(ArrayList<String> notas) {
        this.tbEnCurso.setValueAt(notas.get(0), selectedRow, 3);
        this.tbEnCurso.setValueAt(notas.get(1), selectedRow, 4);
        this.tbEnCurso.setValueAt(notas.get(2), selectedRow, 5);
        this.tbEnCurso.setValueAt(notas.get(3), selectedRow, 6);
        this.tbEnCurso.setValueAt(notas.get(4), selectedRow, 7);
        this.tbEnCurso.setValueAt(notas.get(5), selectedRow, 8);
        this.tbEnCurso.setValueAt(notas.get(6), selectedRow, 9);

    }

    public void actualizarTablaFirmadas(ArrayList<String> notas) {
        this.tbEnCurso.setValueAt(notas.get(7), selectedRow, 1);
        this.tbEnCurso.setValueAt(notas.get(8), selectedRow, 2);
        this.tbEnCurso.setValueAt(notas.get(9), selectedRow, 3);
        this.tbEnCurso.setValueAt(notas.get(10), selectedRow, 4);
    }

    public void cargarEstadisticas() {
        this.lbFirmadas.setText(this.alumno.cantFinalesPend()+ "");
        this.lbAprobadas.setText(this.alumno.NroMatAprobadas() + "");
        this.lbEnCurso.setText(this.alumno.NroMatEnCurso() + "");
        this.lbProcentajeFirmadas.setText(this.alumno.PorcentajeFirmadas() + " %");
        this.lbPorcentajeAprob.setText(this.alumno.PorcentajeAprobadas() + " %");

    }

    public void nuevaMatTablaEnCurso(Materia unaMateria, String dia1, String dia2) {
        unaMateria.agregarDias(dia1, dia2);
        String[] fila = new String[4];
        fila[0] = unaMateria.getNombre();
        fila[1] = dia1;
        fila[2] = dia2;
        this.tb.addRow(fila);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DetallesCursada panel = new DetallesCursada();
        panel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        if (tbEnCurso.getSelectedRow() == -1) {
            Seguidor.lanzarAlerta("No se ha seleccionado una Materia para ser Modificada");
        } else {
            this.obtenerMatSelect();
            switch (this.tableName) {
                case "En Curso":
                    this.modifPanel.cargarDatosNotas(this.matActual, this);
                    this.modifPanel.setVisible(true);
                    break;

                case "Finales Pend.":
                    ModificarNotasFinal modifNotasPanel = new ModificarNotasFinal();
                    modifNotasPanel.cargarDatosNotasFinal(this.matActual, this);
                    modifNotasPanel.setVisible(true);
                    break;

            }

        }
    }//GEN-LAST:event_btnModifActionPerformed

    public void actualizarNotas(Materia unaMat, ArrayList unasNotas) {

    }

    private void obtenerMatSelect() {
        this.selectedRow = tbEnCurso.getSelectedRow();
        String nombre = tbEnCurso.getValueAt(this.selectedRow, 0).toString();
        matActual = this.admin.obtenerMateriaPorNombre(nombre);
    }

    private void btnFirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmaActionPerformed
        this.obtenerMatSelect();
        switch (this.cbTabla.getSelectedItem().toString()) {

            case "En Curso":
                if (this.alumno.firmarMateria(matActual)) {
                    this.tb.removeRow(this.selectedRow);
                    this.cargarEstadisticas();
                    Seguidor.lanzarAlerta("Felicitaciones!! has firmado: " + this.matActual.getNombre());
                }
                break;

            case "Finales Pend.":
                if (this.alumno.apruebaMateria(matActual)) {
                    this.tb.removeRow(this.selectedRow);
                    this.cargarEstadisticas();
                    Seguidor.lanzarAlerta("Felicitaciones!! has Aprobado: " + this.matActual.getNombre());
                }
                break;

            case "Aprobadas":
                break;

        }


    }//GEN-LAST:event_btnFirmaActionPerformed

    public void agregarAlumno(Alumno unAlumno) {
        this.alumno = unAlumno;
    }

    private void inicializarActionListenersCB() {
        this.cbTabla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                switch (selected.toString()) {
                    case "En Curso":
                        tableName = selected.toString();
                        btnNuevo.setEnabled(true);
                        btnFirma.setEnabled(true);
                        btnModif.setEnabled(true);
                        btnFirma.setText("Firmar");
                        cambiarColumnHeadersAprobadas("Materia", "Dia 1", "Dia 2", "1er Parcial", "2do Parcial", "1er Recu 1er P.", "2do Recu 1er P.", "1er Recu 2do P.", "2er Recu 2do P.", " TP ");
                        tb.setRowCount(0);
                        if (alumno.getEnCurso().size() > 0) {
                            cargarTablaEnCurso(alumno.getEnCurso());
                        }

                        break;

                    case "Finales Pend.":
                        tableName = selected.toString();
                        btnFirma.setText("Aprobar");
                        btnFirma.setEnabled(true);
                        btnNuevo.setEnabled(false);
                        btnModif.setEnabled(true);
                        cambiarColumnHeadersAprobadas("Materia", "1ra Instancia", "2da Instancia", "3ra Instancia", "4ta Instancia", " - ", " - ", " - ", " - ", " - ");
                        tb.setRowCount(0);
                        if (alumno.getFirmadas().size() > 0) {
                            cargarTablaFinalesPend(alumno.getFirmadas());
                        }
                        break;

                    case "Aprobadas":
                        tableName = selected.toString();
                        btnFirma.setEnabled(false);
                        btnNuevo.setEnabled(false);
                        btnModif.setEnabled(false);
                        cambiarColumnHeadersAprobadas("Materia", "1ra Instancia", "2da Instancia", "3ra Instancia", "4ta Instancia", " - ", " - ", " - ", " - ", " - ");
                        tb.setRowCount(0);
                        if (alumno.getAprobadas().size() > 0) {
                            cargarTablaAprobadas(alumno.getAprobadas());
                        }
                        break;
                }
            }
        });
    }

    private void cambiarColumnHeadersAprobadas(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        JTableHeader th = tbEnCurso.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);
        TableColumn tc3 = tcm.getColumn(3);
        TableColumn tc4 = tcm.getColumn(4);
        TableColumn tc5 = tcm.getColumn(5);
        TableColumn tc6 = tcm.getColumn(6);
        TableColumn tc7 = tcm.getColumn(7);
        TableColumn tc8 = tcm.getColumn(8);
        TableColumn tc9 = tcm.getColumn(9);
        tc0.setHeaderValue(a);
        tc1.setHeaderValue(b);
        tc2.setHeaderValue(c);
        tc3.setHeaderValue(d);
        tc4.setHeaderValue(e);
        tc5.setHeaderValue(f);
        tc6.setHeaderValue(g);
        tc7.setHeaderValue(h);
        tc8.setHeaderValue(i);
        tc9.setHeaderValue(j);
    }

    public void guardar() {

        try {
            BufferedWriter bwMats;//Instancia de BW 
            bwMats = new BufferedWriter(new FileWriter(this.ficheroMats));//Inicialización de "BW" con "FW" como parámetro con "fichero" como parámetro
            if (this.admin.getMatList() == null) {

            } else {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String s = gson.toJson(this.admin.getMatList());
                bwMats.write(s);
                bwMats.close();
            }

            BufferedWriter bwAlu;//Instancia de BW 
            bwAlu = new BufferedWriter(new FileWriter(this.ficheroAlumnos));//Inicialización de "BW" con "FW" como parámetro con "fichero" como parámetro
            if (this.alumno == null) {

            } else {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String a = gson.toJson(this.alumno);
                bwAlu.write(a);
                bwAlu.close();
            }
        } catch (Exception e) {
            Seguidor.lanzarAlerta("No se pudieron guardar los datos!n" + e.getMessage());
        }

    }

    public void cargarTablaEnCurso(LinkedList<Materia> matsEnCurso) {
        for (Materia mat : matsEnCurso) {
            String[] fila = new String[10];
            fila[0] = mat.getNombre();
            fila[1] = mat.getDia1();
            fila[2] = mat.getDia2();
            fila[3] = this.alumno.getNotas(mat).get(0);
            fila[4] = this.alumno.getNotas(mat).get(1);
            fila[5] = this.alumno.getNotas(mat).get(2);
            fila[6] = this.alumno.getNotas(mat).get(3);
            fila[7] = this.alumno.getNotas(mat).get(4);
            fila[8] = this.alumno.getNotas(mat).get(5);
            fila[9] = this.alumno.getNotas(mat).get(6);
            this.tb.addRow(fila);

        }

    }

    public void cargarTablaFinalesPend(LinkedList<Materia> mats) {
        for (Materia mat : mats) {
            String[] fila = new String[10];
            fila[0] = mat.getNombre();
            fila[1] = this.alumno.getNotas(mat).get(7);
            fila[2] = this.alumno.getNotas(mat).get(8);
            fila[3] = this.alumno.getNotas(mat).get(9);
            fila[4] = this.alumno.getNotas(mat).get(10);
            fila[5] = " ";
            fila[6] = " ";
            fila[7] = " ";
            fila[8] = " ";
            fila[9] = " ";
            this.tb.addRow(fila);
        }

    }
    
    public void actualizarTablas(String nombre){
        for(int i = 0; i<= (this.tbEnCurso.getRowCount()-1); i++){
             if(this.tbEnCurso.getValueAt(i, 0).equals(nombre)){
                 this.tb.removeRow(i);
             }else{
                 
             }
        }
        
    }

    public void cargarTablaAprobadas(LinkedList<Materia> mats) {
        for (Materia mat : mats) {
            String[] fila = new String[10];
            fila[0] = mat.getNombre();
            fila[1] = this.alumno.getNotas(mat).get(7);
            fila[2] = this.alumno.getNotas(mat).get(8);
            fila[3] = this.alumno.getNotas(mat).get(9);
            fila[4] = this.alumno.getNotas(mat).get(10);
            fila[5] = " ";
            fila[6] = " ";
            fila[7] = " ";
            fila[8] = " ";
            fila[9] = " ";
            this.tb.addRow(fila);
        }

    }

    private void cargarDatosAlumno() {

        try {
            if (this.ficheroAlumnos.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(this.ficheroAlumnos));
                Gson gson = new GsonBuilder().create();
                Alumno alum = gson.fromJson(reader, Alumno.class);
                LinkedList<Materia> enCurso = alum.getEnCurso();
                if (enCurso.size() > 0) {
                    this.agregarAlumno(alum);
                    this.cargarTablaEnCurso(enCurso);

                } else {
                    this.agregarAlumno(alum);
                }

            } else {
                this.alumno = new Alumno();
            }

        } catch (Exception e) {
        }
    }

    public AdminPanel getAdmin() {
        return admin;
    }

    public void setAdmin(AdminPanel admin) {
        this.admin = admin;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
        System.exit(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aprobLB;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFirma;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbTabla;
    private javax.swing.JLabel enCursoLb;
    private javax.swing.JLabel firmaLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAprobadas;
    private javax.swing.JLabel lbEnCurso;
    private javax.swing.JLabel lbFirmadas;
    private javax.swing.JLabel lbPorcentajeAprob;
    private javax.swing.JLabel lbProcentajeFirmadas;
    private javax.swing.JLabel lbPromedioBueno;
    private javax.swing.JLabel lbPromedioGral;
    private javax.swing.JLabel porcAprobLb;
    private javax.swing.JLabel porcFirmLb;
    private javax.swing.JLabel promBuenoLb;
    private javax.swing.JLabel promGralLb;
    private javax.swing.JTable tbEnCurso;
    // End of variables declaration//GEN-END:variables
}
