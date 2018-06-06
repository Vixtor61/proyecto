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
public class chooseTrop {
    chose type;
training trainer = new training();
    public void Tropa(chose type) {
        this.type = type;
    }
    
    public void tellItLikeItIs() {
        switch (type) {
            case NIGarmy:
                troopBuilder NIGer = new NIGBuilder();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                tropa nig = trainer.getTropa();
                break;
                    
            case JOOarmy:
                troopBuilder JOOer = new JOOBuilder();
                trainer.setTroopBuilder(JOOer);
                trainer.constructTRooP();

                tropa joo = trainer.getTropa();
                break;
                         
            
                        
            default:
                System.out.println("OII m8 there are no troops whith that name");
                break;
        }
}
   }
