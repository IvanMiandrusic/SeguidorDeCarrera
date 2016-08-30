/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera.panels;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mycompany.seguidordecarrera.Alumno;
import com.mycompany.seguidordecarrera.Materia;
import com.mycompany.seguidordecarrera.Resumen;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import com.mycompany.seguidordecarrera.Seguidor;
import com.mycompany.seguidordecarrera.Seguidor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ivan
 */
public class AdminPanel extends javax.swing.JFrame {

    ArrayList<Materia> materias = new ArrayList();
    File fichero = new File("Datos\\materias.json");
    Materia materia;
    Alumno elAlumno;
    String datos[];
    Resumen resuPanel;
    DefaultTableModel tbAdmin;

    public AdminPanel(Resumen panel) {
        initComponents();
        leerMaterias();
        this.resuPanel = panel;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreMat = new javax.swing.JTextField();
        btnCrearMat = new javax.swing.JButton();
        btnModMat = new javax.swing.JButton();
        cbNivelMat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMatAdmin = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoMat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGuardarAdmin = new javax.swing.JButton();
        btnDeleteMat = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jLabel3.setText("Correlativas: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Admin Panel"));

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Nivel:");

        txtNombreMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMatActionPerformed(evt);
            }
        });

        btnCrearMat.setText("Crear");
        btnCrearMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMatActionPerformed(evt);
            }
        });

        btnModMat.setText("Modificar Mat");
        btnModMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModMatActionPerformed(evt);
            }
        });

        cbNivelMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbNivelMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelMatActionPerformed(evt);
            }
        });

        tbMatAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Nivel"
            }
        ));
        jScrollPane1.setViewportView(tbMatAdmin);

        jLabel4.setText("Codigo: ");

        txtCodigoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModMat)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbNivelMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoMat))
                                .addComponent(txtNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56)
                            .addComponent(btnCrearMat))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearMat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbNivelMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnModMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGuardarAdmin.setText("Guardar");
        btnGuardarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAdminActionPerformed(evt);
            }
        });

        btnDeleteMat.setText("Eliminar Mat");
        btnDeleteMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMatActionPerformed(evt);
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
                        .addComponent(btnGuardarAdmin)
                        .addGap(131, 131, 131)
                        .addComponent(btnDeleteMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuardarAdmin)
                    .addComponent(btnDeleteMat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarTabla(Materia unamat) {
        DefaultTableModel tbAdmin = (DefaultTableModel) tbMatAdmin.getModel();     
        int selectedRow = tbMatAdmin.getSelectedRow();
        tbAdmin.setValueAt(unamat.getCodigo(), selectedRow, 1);
        tbAdmin.setValueAt(unamat.getNombre(), selectedRow, 2);
        tbAdmin.setValueAt(unamat.getNivel(), selectedRow, 3);

    }

    public ArrayList<Materia> getMatList() {
        return this.materias;
    }

    public void leerMaterias() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            Gson gson = new GsonBuilder().create();
            Materia[] mats = gson.fromJson(reader, Materia[].class);
            this.tbAdmin = (DefaultTableModel) tbMatAdmin.getModel();
            for (int i = 0; mats[i] != null; i++) {
                String[] fila = new String[4];
                fila[0] = mats[i].getId() + "";
                fila[1] = mats[i].getCodigo();
                fila[2] = mats[i].getNombre();
                fila[3] = (mats[i].getNivel()) + "";
                tbAdmin.addRow(fila);
                this.agregarMat(mats[i]);

            }

        } catch (Exception e) {
        }
    }

    public void guardarMateria(ArrayList<Materia> unasMat) {

        try {
            BufferedWriter bw;//Instancia de BW 
            bw = new BufferedWriter(new FileWriter(fichero));//Inicialización de "BW" con "FW" como parámetro con "fichero" como parámetro
            if (this.materias == null) {

            } else {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String s = gson.toJson(materias);
                bw.write(s);
                bw.close();
            }
        } catch (Exception e) {
            Seguidor.lanzarAlerta("No se pudieron guardar los datos!n" + e.getMessage());
        }

    }

    public void agregarMat(Materia unaMat) {
        this.materias.add(unaMat);
    }


    private void btnCrearMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMatActionPerformed
        if (txtNombreMat.getText().equals("") || txtCodigoMat.getText().equals("")) {
            Seguidor.lanzarAlerta("Las Materias deben tener un Nombre y un Codigo.");
        } else if(this.controlarCodigo(txtCodigoMat.getText())){
            try {
                DefaultTableModel tbAdmin = (DefaultTableModel) tbMatAdmin.getModel();
                String nivel = (cbNivelMat.getSelectedItem().toString());
                Materia mat = new Materia(txtCodigoMat.getText(), txtNombreMat.getText(), nivel);
                String nombre = mat.getNombre();
                String codigo = mat.getCodigo();
                String id = mat.getId() + "";
                String[] fila = new String[4];
                fila[1] = codigo;
                fila[2] = nombre;
                fila[3] = nivel;
                Materia element;
                if (this.materias == null) {
                    mat.setId(1);
                    this.agregarMat(mat);
                    tbAdmin.addRow(fila);

                } else {
                    Iterator<Materia> it = materias.iterator();
                    while (it.hasNext()) {
                        element = it.next();
                        String nombre1 = element.getNombre();
                        String codigo1 = element.getCodigo();
                        if (nombre1.equals(nombre) || codigo1.equals(codigo)) {
                            Seguidor.lanzarAlerta("El Nombre o Codigo ya han sido ingresados");
                            return;
                        } else {

                        }
                    }
                    mat.setId(materias.size() + 1);
                    this.agregarMat(mat);
                    fila[0] = mat.getId() + "";
                    tbAdmin.addRow(fila);

                }
            } catch (Exception e) {
            }

        }else{
            Seguidor.lanzarAlerta("El codigo de Materia ya existe");
        }
    }//GEN-LAST:event_btnCrearMatActionPerformed

    private boolean controlarCodigo(String unCodigo){
        if(this.materias.stream().filter(m->m.getCodigo().equals(unCodigo)).collect(Collectors.toList()).size()>0){
         return false;   
        }else{
            return true;
        }
    }
    
    private void cbNivelMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNivelMatActionPerformed

    private void btnGuardarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAdminActionPerformed
        this.guardarMateria(materias);
        dispose();
    }//GEN-LAST:event_btnGuardarAdminActionPerformed

    private void txtNombreMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMatActionPerformed

    private void txtCodigoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMatActionPerformed

    private void btnModMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModMatActionPerformed

        if (tbMatAdmin.getSelectedRow() == -1) {
            Seguidor.lanzarAlerta("No se ha seleccionado una Materia para ser Modificada");
        } else {
            int selectedRow = tbMatAdmin.getSelectedRow();
            String codigo = tbMatAdmin.getValueAt(selectedRow, 1).toString();
            Iterator<Materia> it = materias.iterator();
            Materia element;
            while (it.hasNext()) {
                element = it.next();
                String codigoAux = element.getCodigo();
                if (codigoAux.equals(codigo)) {
                    matModifPanel modifPnl = new matModifPanel();
                    modifPnl.datosDeCampos(element, this);
                    modifPnl.setVisible(true);
                    return;
                } else {

                }
            }
        }
    }//GEN-LAST:event_btnModMatActionPerformed

    public Materia obtenerMateriaPorNombre(String unNombre){
            Iterator<Materia> it = materias.iterator();
            Materia element = null;
            Materia mat;
            while (it.hasNext()) {
                element = it.next();
                String nomAux = element.getNombre();
                if (nomAux.equals(unNombre)) {
                    break;
            }
       }
            return element;
    }

    public Alumno getElAlumno() {
        return elAlumno;
    }

    public void setElAlumno(Alumno elAlumno) {
        this.elAlumno = elAlumno;
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Seguidor.lanzarAlerta("Los Cambios no se Guardaran");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void removeMat(String codigo){
        this.materias.removeIf(m->m.getCodigo().equals(codigo));
    }
    
    private void btnDeleteMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMatActionPerformed
        if(this.tbMatAdmin.getSelectedRow() == 1){
            Seguidor.lanzarAlerta("Debe seleccionar una materia para eliminar");
        }else{
            int selectedRow = tbMatAdmin.getSelectedRow();
            String nombre = tbMatAdmin.getValueAt(selectedRow, 2).toString();
            String codigo = tbMatAdmin.getValueAt(selectedRow, 1).toString();
            this.removeMat(codigo);
            this.tbAdmin.removeRow(selectedRow);
            this.elAlumno.eliminarMateria(codigo);
            
            this.resuPanel.actualizarTablas(nombre);
            Seguidor.lanzarAlerta("La materia se a eliminado exitosamente");

        }
    }//GEN-LAST:event_btnDeleteMatActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMat;
    private javax.swing.JButton btnDeleteMat;
    private javax.swing.JButton btnGuardarAdmin;
    private javax.swing.JButton btnModMat;
    private javax.swing.JComboBox<String> cbNivelMat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMatAdmin;
    private javax.swing.JTextField txtCodigoMat;
    private javax.swing.JTextField txtNombreMat;
    // End of variables declaration//GEN-END:variables
}
