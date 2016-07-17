/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seguidordecarrera;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Ivan
 */
public class Seguidor {
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resumen resu = new Resumen();
        resu.setVisible(true);
        
    }
    
    public static void lanzarAlerta(String unMensaje){
        JOptionPane.showMessageDialog(null, unMensaje);
    }
    
}
