/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera.panels;

import com.mycompany.seguidordecarrera.Alumno;
import com.mycompany.seguidordecarrera.Materia;
import com.mycompany.seguidordecarrera.Resumen;
import com.mycompany.seguidordecarrera.Seguidor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Ivan
 */
public class NuevaEnCursoPanel extends javax.swing.JFrame {

    ArrayList<Materia> mats;
    Alumno alumno;
    Resumen resumenPanel;
    
    public NuevaEnCursoPanel() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void datosDeCampo(Resumen unResu, AdminPanel unAdmin ,Alumno unAlumno){
        
        this.mats = unAdmin.getMatList();
        this.resumenPanel = unResu;
        this.alumno = unAlumno;

        Materia element;
        Iterator<Materia> it = mats.iterator();
        while (it.hasNext()) {
            element = it.next();
            if(this.alumno.noCursoMateria(element)){
            if(!element.tieneCorrelativas()){
            this.cbSelecMat.addItem(element.getNombre());
            }else if(unAlumno.puedeCursar(element)){
                this.cbSelecMat.addItem(element.getNombre());
            } 
            }
         
            
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnModificarEnCurso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbSelecMat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDia1 = new javax.swing.JComboBox<>();
        cbDia2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnModificarEnCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Materia En Curso"));

        jLabel1.setText("Seleccionar Materia: ");

        cbSelecMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Materia" }));
        cbSelecMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecMatActionPerformed(evt);
            }
        });

        jLabel2.setText("Dia 1: ");

        jLabel3.setText("Dia 2: ");

        cbDia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miarcoles", "Jueves", "Viernes", "Sabado" }));
        cbDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDia1ActionPerformed(evt);
            }
        });

        cbDia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","Lunes", "Martes", "Miarcoles", "Jueves", "Viernes", "Sabado" }));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnModificarEnCursoLayout = new javax.swing.GroupLayout(pnModificarEnCurso);
        pnModificarEnCurso.setLayout(pnModificarEnCursoLayout);
        pnModificarEnCursoLayout.setHorizontalGroup(
            pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnModificarEnCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbSelecMat, 0, 215, Short.MAX_VALUE)
                    .addComponent(cbDia1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDia2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(pnModificarEnCursoLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        pnModificarEnCursoLayout.setVerticalGroup(
            pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnModificarEnCursoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cbSelecMat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pnModificarEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnModificarEnCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnModificarEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSelecMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecMatActionPerformed
       
    }//GEN-LAST:event_cbSelecMatActionPerformed

    private void cbDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDia1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selected = cbSelecMat.getSelectedItem().toString();
        if (selected.equals("Seleccione una Materia") ) {
            Seguidor.lanzarAlerta("No se ha seleccionado una Materia para cursar");
        }else{
           Materia aCursar = this.mats.stream().filter(m->m.getNombre().equals(selected)).findFirst().get();
           String dia1 = this.cbDia1.getSelectedItem().toString();
           String dia2 = this.cbDia2.getSelectedItem().toString();
           if(this.alumno.noCursoMateria(aCursar)){
               
               if(dia1.equals(dia2)){
                    Seguidor.lanzarAlerta("Los dias de cursada no deben coincidir");
                       return;
               }else{
                   this.alumno.cursarMateria(aCursar);
                   this.resumenPanel.nuevaMatTablaEnCurso(aCursar, dia1, dia2);
                
               }
                
           }else{
                Seguidor.lanzarAlerta("La Materia seleccionada se encuentra en curso o ah sido cursada anteriormente");
           }
           
          
           dispose();   
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevaEnCursoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaEnCursoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaEnCursoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaEnCursoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaEnCursoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDia1;
    private javax.swing.JComboBox<String> cbDia2;
    private javax.swing.JComboBox<String> cbSelecMat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnModificarEnCurso;
    // End of variables declaration//GEN-END:variables
}
