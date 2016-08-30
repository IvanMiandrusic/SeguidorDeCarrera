/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera.panels;

import com.mycompany.seguidordecarrera.Alumno;
import com.mycompany.seguidordecarrera.Materia;
import com.mycompany.seguidordecarrera.Resumen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.JComboBox;

/**
 *
 * @author Ivan
 */
public class ModificarNotas extends javax.swing.JFrame {

    private ArrayList<String> notas;
    private Materia matActual;
    private Resumen resuPanel;
    private Alumno alumno;

    public ModificarNotas() {
        initComponents();
        this.bloquearCB();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    private void bloquearCB() {
        this.cbPRPP.setEnabled(false);
        this.cbSRPP.setEnabled(false);
        this.cbPRSP.setEnabled(false);
        this.cbSRSP.setEnabled(false);
        this.inicializarActionListenersCB();

    }

    public void cargarDatos(Materia unaMat, Resumen unPanel) {
        this.matActual = unaMat;
        this.resuPanel = unPanel;
        this.alumno = this.resuPanel.getAlumno();
        this.notas = this.alumno.getNotas(unaMat);
    }

    public void cargarDatosNotas(Materia unaMat, Resumen unPanel) {
        this.cargarDatos(unaMat, unPanel);
        this.lbMat.setText(unaMat.getNombre());
        if (this.notas.get(0).equals("1")) {

        } else {
            this.cbPP.setSelectedIndex(Integer.parseInt(this.notas.get(0)));
            this.cbSP.setSelectedIndex(Integer.parseInt(this.notas.get(1)));
            this.cbPRPP.setSelectedIndex(Integer.parseInt(this.notas.get(2)));
            this.cbSRPP.setSelectedIndex(Integer.parseInt(this.notas.get(3)));
            this.cbPRSP.setSelectedIndex(Integer.parseInt(this.notas.get(4)));
            this.cbSRSP.setSelectedIndex(Integer.parseInt(this.notas.get(5)));
            this.cbTP.setSelectedIndex(Integer.parseInt(this.notas.get(6)));

        }
    }

    public void guardarNotas() {
        try {
            if (!this.cbPP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(0, this.cbPP.getSelectedItem().toString());
            }
            if (!this.cbSP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(1, this.cbSP.getSelectedItem().toString());
            }
            if (!this.cbPRPP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(2, this.cbPRPP.getSelectedItem().toString());
            }
            if (!this.cbSRPP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(3, this.cbSRPP.getSelectedItem().toString());
            }
            if (!this.cbPRSP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(4, this.cbPRSP.getSelectedItem().toString());
            }
            if (!this.cbSRSP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(5, this.cbSRSP.getSelectedItem().toString());
            }

            if (!this.cbTP.getSelectedItem().toString().equals(" ")) {
                this.notas.set(6, this.cbTP.getSelectedItem().toString());
            }

            this.alumno.actualizarNotas(this.notas, this.matActual);

        } catch (Exception e) {
        }
    }

    private void inicializarActionListenersCB() {
        this.cbPP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if (selected.toString().equals("1") || selected.toString().equals("2") || selected.toString().equals("3")) {
                    cbPRPP.setEnabled(true);
                } else {
                    cbPRPP.setSelectedIndex(0);
                    cbPRPP.setEnabled(false);
                }
            }
        });

        this.cbPRPP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if (selected.toString().equals("1") || selected.toString().equals("2") || selected.toString().equals("3")) {
                    cbSRPP.setEnabled(true);
                } else {
                    cbSRPP.setSelectedIndex(0);
                    cbSRPP.setEnabled(false);
                }
            }
        });

        this.cbSP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if (selected.toString().equals("1") || selected.toString().equals("2") || selected.toString().equals("3")) {
                    cbPRSP.setEnabled(true);
                } else {
                    cbPRSP.setSelectedIndex(0);
                    cbPRSP.setEnabled(false);
                }
            }
        });

        this.cbPRSP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if (selected.toString().equals("1") || selected.toString().equals("2") || selected.toString().equals("3")) {
                    cbSRSP.setEnabled(true);
                } else {
                    cbSRSP.setSelectedIndex(0);
                    cbSRSP.setEnabled(false);
                }
            }
        });
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbMat = new javax.swing.JLabel();
        lbUno = new javax.swing.JLabel();
        lbCuatro = new javax.swing.JLabel();
        lbDos = new javax.swing.JLabel();
        lbTres = new javax.swing.JLabel();
        lbCinco = new javax.swing.JLabel();
        lbSeis = new javax.swing.JLabel();
        lbSiete = new javax.swing.JLabel();
        cbPP = new javax.swing.JComboBox<>();
        cbSP = new javax.swing.JComboBox<>();
        cbPRPP = new javax.swing.JComboBox<>();
        cbSRPP = new javax.swing.JComboBox<>();
        cbPRSP = new javax.swing.JComboBox<>();
        cbSRSP = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cbTP = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Notas"));

        lbMat.setText("jLabel1");

        lbUno.setText("Primer Parcial");

        lbCuatro.setText("Segundo Parcial");

        lbDos.setText("1er Recu Primer Parcial");

        lbTres.setText("2do Recu Primer Parcial");

        lbCinco.setText("1er Recu Segundo Parcial");

        lbSeis.setText("2do Recu Segundo Parcial");

        lbSiete.setText("Trabajo Practico");

        cbPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));

        cbPRPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbSRPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbPRSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbSRSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbTP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jSeparator1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCinco)
                                    .addComponent(lbSeis)
                                    .addComponent(lbSiete)
                                    .addComponent(lbCuatro)
                                    .addComponent(lbUno)
                                    .addComponent(lbDos)
                                    .addComponent(lbTres))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPRPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbSRPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbPRSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbSRSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbMat)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPRPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSRPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTres))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCuatro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPRSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCinco))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSRSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSiete))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardarNotas();
        this.resuPanel.actualizarTablaEnCurso(this.notas);
        dispose();
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
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbPP;
    private javax.swing.JComboBox<String> cbPRPP;
    private javax.swing.JComboBox<String> cbPRSP;
    private javax.swing.JComboBox<String> cbSP;
    private javax.swing.JComboBox<String> cbSRPP;
    private javax.swing.JComboBox<String> cbSRSP;
    private javax.swing.JComboBox<String> cbTP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCinco;
    private javax.swing.JLabel lbCuatro;
    private javax.swing.JLabel lbDos;
    private javax.swing.JLabel lbMat;
    private javax.swing.JLabel lbSeis;
    private javax.swing.JLabel lbSiete;
    private javax.swing.JLabel lbTres;
    private javax.swing.JLabel lbUno;
    // End of variables declaration//GEN-END:variables
}
