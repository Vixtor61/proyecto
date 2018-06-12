/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author victor
 */
import tropas.tropa;

public class JOOS extends RACE {
   
    
    
    public tropa getTrop(int index){
        int aux;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
            
            if(index == aux){
              
                return tropList;
            }
        
        }
        return null;
    }
    public void restlife(int index,int rest){
        int aux;
        int aux2;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
            
           
            if(index == aux){
                
                aux2 = tropList.getVida();
                
                tropList.vida(aux2 - rest);
                System.out.print("THE JOO HAS - "+ rest + " of life left \n");
            }
        
        }
        
        
    }
    
    
}
