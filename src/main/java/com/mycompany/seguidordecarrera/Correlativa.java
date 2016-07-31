
package com.mycompany.seguidordecarrera;

/**
 *
 * @author Ivan
 */
public class Correlativa {
    
    Materia mat;
    String condAprob;
    
    public void correlativa(String unaCond, Materia unaMat){
        
        this.mat = unaMat;
        this.condAprob = unaCond;
        
    }
    
    public Materia getMateria() {
        return mat;
    }

    public void setMateria(Materia correlat) {
        this.mat = correlat;
    }

    public String getCondAprob() {
        return condAprob;
    }

    public void setCondAprob(String condAprob) {
        this.condAprob = condAprob;
    }
    
    
}
