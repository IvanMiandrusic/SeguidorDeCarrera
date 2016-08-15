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
import com.mycompany.seguidordecarrera.panels.ModifEnCurso;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class Resumen extends javax.swing.JFrame {

    AdminPanel admin = new AdminPanel();
    ModifEnCurso modifPanel = new ModifEnCurso();
    Alumno alumno;
    Materia matActual;
    int selectedRow;
    ArrayList<Materia> materias;
    DefaultTableModel tb;
    File ficheroMats = new File("Datos\\materias.json");
    File ficheroAlumnos = new File("Datos\\alumnos.json");

    public Resumen() {

        initComponents();
        tb = (DefaultTableModel) tbEnCurso.getModel();
        this.cargarDatosAlumno();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firmadas_Lb = new javax.swing.JLabel();
        aprobadas_Lb = new javax.swing.JLabel();
        enCurso_Lb = new javax.swing.JLabel();
        porcentajeFirmadas_Lb = new javax.swing.JLabel();
        porcentajeAprobadas_Lb = new javax.swing.JLabel();
        promedioGral_Lb = new javax.swing.JLabel();
        promedioB_Lb = new javax.swing.JLabel();
        nroFinalesPend_Lb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEnCurso = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnFirma = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resumen");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguidor de Carrera"));

        jLabel1.setText("Materias Totales: 43");

        firmadas_Lb.setText("Firmadas: ");

        aprobadas_Lb.setText("Aprobadas: ");

        enCurso_Lb.setText("En Curso: ");

        porcentajeFirmadas_Lb.setText("% Firmadas: ");

        porcentajeAprobadas_Lb.setText("% Aprobadas: ");

        promedioGral_Lb.setText("Promedio Gral: ");

        promedioB_Lb.setText("Promedio \"Bueno\": ");

        nroFinalesPend_Lb.setText("Finales Pendientes: ");

        jButton1.setText("General");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firmadas_Lb)
                            .addComponent(aprobadas_Lb)
                            .addComponent(enCurso_Lb))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porcentajeFirmadas_Lb)
                            .addComponent(porcentajeAprobadas_Lb)
                            .addComponent(nroFinalesPend_Lb))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(promedioGral_Lb)
                            .addComponent(promedioB_Lb))))
                .addGap(67, 302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firmadas_Lb)
                    .addComponent(porcentajeFirmadas_Lb)
                    .addComponent(promedioGral_Lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprobadas_Lb)
                    .addComponent(porcentajeAprobadas_Lb)
                    .addComponent(promedioB_Lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enCurso_Lb)
                    .addComponent(nroFinalesPend_Lb)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
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

        btnNuevo.setText("Nueva");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModif.setText("Modificar");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnFirma.setText("Firmada");
        btnFirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmaActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModif)
                    .addComponent(btnCerrar)
                    .addComponent(btnFirma)
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
            this.modifPanel.cargarDatos(this.matActual, this);
            this.modifPanel.setVisible(true);
        }
    }//GEN-LAST:event_btnModifActionPerformed

    public void actualizarNotas(Materia unaMat, ArrayList unasNotas){
        
        
    }
    
    private void obtenerMatSelect() {
        this.selectedRow = tbEnCurso.getSelectedRow();
        String nombre = tbEnCurso.getValueAt(this.selectedRow, 0).toString();
        matActual = this.admin.obtenerMateriaPorNombre(nombre);
    }

    private void btnFirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmaActionPerformed
        this.obtenerMatSelect();
        if(this.alumno.firmarMateria(matActual)){
               this.tb.removeRow(this.selectedRow);
        Seguidor.lanzarAlerta("Felicitaciones!! has firmado: " + this.matActual.getNombre());
        }
     
    }//GEN-LAST:event_btnFirmaActionPerformed

    public void agregarAlumno(Alumno unAlumno) {
        this.alumno = unAlumno;
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

    private void cargarDatosAlumno() {

        try {
            if (this.ficheroAlumnos.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(this.ficheroAlumnos));
                Gson gson = new GsonBuilder().create();
                Alumno alum = gson.fromJson(reader, Alumno.class);
                LinkedList<Materia> enCurso = alum.getEnCurso();
                if (enCurso.size() > 0) {
                    for (int i = 0; enCurso.get(i) != null; i++) {
                        Materia unaMat = this.admin.obtenerMateriaPorNombre(enCurso.get(i).getNombre());
                        String[] fila = new String[10];
                        fila[0] = enCurso.get(i).getNombre();
                        fila[1] = enCurso.get(i).getDia1();
                        fila[2] = enCurso.get(i).getDia2();
                        fila[3] = alum.getNotas(enCurso.get(i)).get(0);
                        fila[4] = alum.getNotas(enCurso.get(i)).get(1);
                        fila[5] = alum.getNotas(enCurso.get(i)).get(2);
                        fila[6] = alum.getNotas(enCurso.get(i)).get(3);
                        fila[7] = alum.getNotas(enCurso.get(i)).get(4);
                        fila[8] = alum.getNotas(enCurso.get(i)).get(5);
                        fila[9] = alum.getNotas(enCurso.get(i)).get(6);
                        tb.addRow(fila);
                        this.agregarAlumno(alum);

                    }
                }else{
                    this.agregarAlumno(alum);
                    }
            
                }
             else {
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
    private javax.swing.JLabel aprobadas_Lb;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFirma;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel enCurso_Lb;
    private javax.swing.JLabel firmadas_Lb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nroFinalesPend_Lb;
    private javax.swing.JLabel porcentajeAprobadas_Lb;
    private javax.swing.JLabel porcentajeFirmadas_Lb;
    private javax.swing.JLabel promedioB_Lb;
    private javax.swing.JLabel promedioGral_Lb;
    private javax.swing.JTable tbEnCurso;
    // End of variables declaration//GEN-END:variables
}
