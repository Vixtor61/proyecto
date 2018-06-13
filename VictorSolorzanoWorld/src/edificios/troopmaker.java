/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import razas.JOOS;
import razas.NIG;
import tropas.chooseTrop;
import tropas.chose;


/**
 *
 * @author UCA
 */
public class troopmaker extends edificio {
    int fasesactual = 0;
    int fases=0;
    public void maketroop(JOOS JO,String Type){
        if(Type == "especial"){
            chooseTrop f= new chooseTrop(chose.JOOespecial);
        JO.TropList.add(f.createtropp());
        }
        if(Type == "army"){
            /*
            chooseTrop f= new chooseTrop(chose.JOOarmy);
        JO.TropList.add(f.createtropp());
*/        
}
        
    }
    public void maketroop(NIG nig,String Type){
        if(Type == "especial"){
              chooseTrop f= new chooseTrop(chose.NIGespecial);
        nig.TropList.add(f.createtropp());
      
        }
    }
    
}
