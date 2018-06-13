/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import tropas.tropa;


/**
 *
 * @author victor
 */
public class NIG extends RACE{
    

    
    
    public tropa getTrop(int index){
        int aux;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
           
            System.out.print(tropList.getrace()+" troop type:"+tropList.getType()+ " troop atacck:"+tropList.getAtackt()+" troop life:"+tropList.getVida()+" ");
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
                System.out.print("THE NIG HAS - "+ rest + " of life left \n");
            }
        
        }
        
}
}
