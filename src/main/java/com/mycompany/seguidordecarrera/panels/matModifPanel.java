/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera.panels;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.seguidordecarrera.Correlativa;
import com.mycompany.seguidordecarrera.Materia;
import com.mycompany.seguidordecarrera.Seguidor;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class matModifPanel extends javax.swing.JFrame {

    LinkedList<Correlativa> newCorrelativas = new LinkedList();
    ArrayList<Materia> mats = new ArrayList();
    Materia matActual;
    AdminPanel admPanel;
    LinkedList<Correlativa> correlativaMat;

    public matModifPanel() {
        initComponents();
        agregarRadioButtons();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbModPanel = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        cbCorrelativas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAddCorrelativa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorrelativas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModCerrar = new javax.swing.JButton();
        btnModGuardar = new javax.swing.JButton();
        txtModCodigo = new javax.swing.JTextField();
        txtModNombre = new javax.swing.JTextField();
        cbModNivel = new javax.swing.JComboBox<>();
        rbFirma = new javax.swing.JRadioButton();
        rbAprob = new javax.swing.JRadioButton();
        btnEliminarCorr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setText("jLabel1");

        cbCorrelativas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        cbCorrelativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCorrelativasActionPerformed(evt);
            }
        });

        jLabel1.setText("Correlativa:");

        btnAddCorrelativa.setText("Agregar");
        btnAddCorrelativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCorrelativaActionPerformed(evt);
            }
        });

        tbCorrelativas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nivel", "Materia", "Codigo", "Cond. Cursada"
            }
        ));
        jScrollPane1.setViewportView(tbCorrelativas);

        jLabel2.setText("Nombre");

        jLabel3.setText("Nivel");

        jLabel4.setText("Codigo");

        btnModCerrar.setText("Cerrar");
        btnModCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCerrarActionPerformed(evt);
            }
        });

        btnModGuardar.setText("Guardar");
        btnModGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModGuardarActionPerformed(evt);
            }
        });

        txtModCodigo.setText("");

        txtModNombre.setText("");

        cbModNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5" }));

        rbFirma.setText("Firma");
        rbFirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFirmaActionPerformed(evt);
            }
        });

        rbAprob.setText("Aprobada");

        btnEliminarCorr.setText("Eliminar Correlativa");
        btnEliminarCorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCorrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCorrelativas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModNombre)
                                    .addComponent(txtModCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(cbModNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(rbFirma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbAprob)
                                        .addGap(22, 22, 22)
                                        .addComponent(btnAddCorrelativa))
                                    .addComponent(lbNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModGuardar)
                                .addGap(130, 130, 130)
                                .addComponent(btnEliminarCorr)
                                .addGap(121, 121, 121)
                                .addComponent(btnModCerrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtModCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbModNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbCorrelativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCorrelativa)
                            .addComponent(rbFirma)
                            .addComponent(rbAprob))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCorr)
                    .addComponent(btnModCerrar)
                    .addComponent(btnModGuardar))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFirmaActionPerformed

    private void btnModGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModGuardarActionPerformed
        if (matActual.getNombre() != txtModNombre.getText() || matActual.getCodigo() != txtModCodigo.getText() || matActual.getNivel() != cbModNivel.getSelectedItem()) {
            matActual.setCodigo(txtModCodigo.getText());
            matActual.setNombre(txtModNombre.getText());
            matActual.setNivel(cbModNivel.getSelectedItem().toString());
            if (!this.newCorrelativas.isEmpty()) {
                this.newCorrelativas.stream().forEach(m -> matActual.AgregarCorrelativa(m));
            }
            admPanel.actualizarTabla(matActual);
            dispose();
        }
    }//GEN-LAST:event_btnModGuardarActionPerformed

    private void btnModCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCerrarActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnModCerrarActionPerformed

    private void btnAddCorrelativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCorrelativaActionPerformed

if(rbFirma.isSelected() || rbAprob.isSelected()){
        DefaultTableModel tbAux = (DefaultTableModel) tbCorrelativas.getModel();
        Materia element;
        Correlativa newCorrelat = new Correlativa();
        String cond = "";
        Iterator<Materia> it = mats.iterator();
        LinkedList<Correlativa> correlat = this.matActual.getCorrelativas();
        while (it.hasNext()) {
            element = it.next();
            if (element.getNombre() == cbCorrelativas.getSelectedItem().toString()) {
                /*TODO: PROBLEMA CON LAS CORRELATIVAS REPETIDAS :/*/ if (((correlat.stream().filter(c -> c.getMateria().getNombre().equals(cbCorrelativas.getSelectedItem().toString())).collect(Collectors.toList())).size() > 0) || ((this.newCorrelativas.stream().filter(c -> c.getMateria().getNombre().equals(cbCorrelativas.getSelectedItem().toString())).collect(Collectors.toList())).size() > 0)) {
                    Seguidor.lanzarAlerta(cbCorrelativas.getSelectedItem().toString() + " ya forma parte de las correlativas de " + this.matActual.getNombre());
                } else {
                    newCorrelat.setMateria(element);

                    if (rbFirma.isSelected()) {
                        newCorrelat.setCondAprob("F");
                        this.newCorrelativas.add(newCorrelat);
                        cond = "F";
                    } else if (rbAprob.isSelected()) {
                        newCorrelat.setCondAprob("A");
                        this.newCorrelativas.add(newCorrelat);
                        cond = "A";
                    }
                    String[] fila = new String[4];
                    fila[0] = element.getNivel();
                    fila[1] = element.getNombre();
                    fila[2] = element.getCodigo();
                    fila[3] = cond;

                    tbAux.addRow(fila);

                }
            } else {
            }
        }
    }else{
    Seguidor.lanzarAlerta("Debe seleccionar una condicion de Correlativa");
}
    }//GEN-LAST:event_btnAddCorrelativaActionPerformed

    private void cbCorrelativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCorrelativasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCorrelativasActionPerformed

    private void btnEliminarCorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCorrActionPerformed
        int selectedRow = tbCorrelativas.getSelectedRow();
        if(selectedRow != -1){
        String codigo = tbCorrelativas.getValueAt(selectedRow, 2).toString();
        Materia aEliminar = this.mats.stream().filter(m -> m.getCodigo().equals(codigo)).findFirst().get();
        this.matActual.eliminarCorrelativas(aEliminar);
         int modelIndex = tbCorrelativas.convertRowIndexToModel(selectedRow);
        DefaultTableModel model = (DefaultTableModel)tbCorrelativas.getModel();
        model.removeRow(modelIndex);
        }else{
            Seguidor.lanzarAlerta("Debe seleccionar una Correlativa para ser eliminada");
        }
    }//GEN-LAST:event_btnEliminarCorrActionPerformed

    public void datosDeCampos(Materia unaMat, AdminPanel unPanel) {
        matActual = unaMat;
        admPanel = unPanel;
        txtModCodigo.setText(unaMat.getCodigo());
        txtModNombre.setText(unaMat.getNombre());
        cbModNivel.addItem(unaMat.getNivel());
        cbModNivel.setSelectedItem(unaMat.getNivel());
        cbCorrelativas.setSelectedItem("Seleccione una Correlativa");
        mats = unPanel.getMatList();
        lbNombre.setText(this.matActual.getNombre());
        correlativaMat = this.matActual.getCorrelativas();
        cargarTablaCorrelat();
        Materia element;
        Iterator<Materia> it = mats.iterator();
        while (it.hasNext()) {
            element = it.next();
            if (element.getNombre() != this.matActual.getNombre()) {
                cbCorrelativas.addItem(element.getNombre());
            }
        }

    }

    public void llenarTablaCorrelat(String key, Materia unaMat) {
        DefaultTableModel tbAdmin = (DefaultTableModel) tbCorrelativas.getModel();
        String[] fila = new String[4];
        fila[0] = (unaMat.getNivel()) + "";
        fila[1] = unaMat.getNombre();
        fila[2] = unaMat.getCodigo();
        fila[3] = key;
        tbAdmin.addRow(fila);

    }

    public void cargarTablaCorrelat() {

        try {

            correlativaMat.stream().forEach(m -> this.llenarTablaCorrelat(m.getCondAprob(), m.getMateria()));
        } catch (Exception e) {
        }

    }

    public void agregarRadioButtons() {
        gbModPanel.add(rbFirma);
        gbModPanel.add(rbAprob);
    }

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
            java.util.logging.Logger.getLogger(matModifPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matModifPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matModifPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matModifPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matModifPanel().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCorrelativa;
    private javax.swing.JButton btnEliminarCorr;
    private javax.swing.JButton btnModCerrar;
    private javax.swing.JButton btnModGuardar;
    private javax.swing.JComboBox<String> cbCorrelativas;
    private javax.swing.JComboBox<String> cbModNivel;
    private javax.swing.ButtonGroup gbModPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JRadioButton rbAprob;
    private javax.swing.JRadioButton rbFirma;
    private javax.swing.JTable tbCorrelativas;
    private javax.swing.JTextField txtModCodigo;
    private javax.swing.JTextField txtModNombre;
    // End of variables declaration//GEN-END:variables
}
