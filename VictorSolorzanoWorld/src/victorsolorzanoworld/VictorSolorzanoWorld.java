/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

/**
 *
 * @author victor
 */
import tropas.chooseTrop;
import tropas.chose;
import razas.JOOS;
import victorsolorzanoworld.play;
public class VictorSolorzanoWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        play p = new play();
        chooseTrop f= new chooseTrop(chose.JOOarmy);
        JOOS j = new JOOS();
        j.TropList.add(f.createtropp());
        f = new chooseTrop(chose.NIGarmy);
        
        j.TropList.add(f.createtropp());
        j.SHOW();
        System.out.print("U here \n");
        p.atack(j,j,0);
        j.SHOW();
       
        
        
    }
    
}
