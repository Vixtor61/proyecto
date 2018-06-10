/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import java.util.ArrayList;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class NIG extends RACE{
    

    public ArrayList<tropa> TropList = new ArrayList<tropa>();
    
    public void SHOW(){
        System.out.print("Showing all NIG trops: ");
        for (tropa TropList : TropList){
            
            System.out.print(TropList.getrace()+" troop type:"+TropList.getType()+ " troop atacck:"+TropList.getAtackt()+" troop life:"+TropList.getVida()+" \n");
            
        
        }
    }
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
    
}
