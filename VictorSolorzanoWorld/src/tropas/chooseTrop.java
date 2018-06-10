/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tropas;

/**
 *
 * @author victor
 */
import tropas.chose;
import tropas.training;
import razas.JOOS;
public class chooseTrop {
    chose type;
training trainer = new training();
    public chooseTrop(chose type) {
        this.type = type;
    }
    
    public tropa createtropp() {
        switch (type) {
            case NIGarmy:
                troopBuilder NIGer = new NIGBuilder();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                tropa nig = trainer.getTropa();
                return nig;
                
                    
            case JOOarmy:
                troopBuilder JOOer = new JOOBuilder();
                trainer.setTroopBuilder(JOOer);
                trainer.constructTRooP();

                tropa joo = trainer.getTropa();
                return joo;
                         
            
                        
            default:
                System.out.println("OII m8 there are no troops whith that name");
                break;
        }
        return null;
}
   }
