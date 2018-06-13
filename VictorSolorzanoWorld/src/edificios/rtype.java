/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import razas.JOOS;
import tropas.tropa;

/**
 *
 * @author UCA
 */
public class rtype extends edificio {
    int resourceP = 0;
    String type = "";
    int fases = 0;
    int fasesactual=0;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getResourceP() {
        return resourceP;
    }

    public void setResourceP(int resourceP) {
        this.resourceP = resourceP;
    }
    
    public void makeresource(){
        
    }
     public void sumResources(JOOS merchant){
     merchant.setResources(merchant.getResources()+resourceP);
     
   
}
}
