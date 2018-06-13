/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;




/**
 *
 * @author UCA
 */

public class EDChoser {
    choseEd type;
Rtypemaker trainer = new Rtypemaker();
Ttypemaker trainer1 = new Ttypemaker();
    public EDChoser(choseEd type) {
        this.type = type;
    }
    
    public rtype createtropp() {
        switch (type) {
            case rtype1:
                Eresource_Builder NIGer = new rtype1();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                rtype nig = trainer.getTropa();
                return nig;
                
                    
            case rtype2:
                Eresource_Builder JOOer = new rtype2();
                trainer.setTroopBuilder(JOOer);
                
                trainer.constructTRooP();

                rtype joo = trainer.getTropa();
                return joo;
                case rtype3:
                Eresource_Builder JOOe = new rtype3();
                trainer.setTroopBuilder(JOOe);
                
                trainer.constructTRooP();

                rtype joo1 = trainer.getTropa();
                return joo1;
                
                         
            
                        
            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
}
   }

