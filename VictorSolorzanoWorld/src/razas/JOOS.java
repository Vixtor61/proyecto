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
import java.util.ArrayList;
public class JOOS extends RACE {
    public ArrayList<tropa> TropList = new ArrayList<tropa>();
    
    public void SHOW(){
        System.out.print("Showing all JOO trops: ");
        for (tropa TropList : TropList){
            
            System.out.print(TropList.getrace()+" troop type:"+TropList.getType()+ " troop atacck:"+/*TropList.getAtackt()+*/" troop life:"+TropList.getVida()+" \n");
            
        
        }
    }
    public tropa getTrop(int index){
        int aux;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
            System.out.print(aux+ " HEY");
           
            //System.out.print(tropList.getrace()+" troop type:"+tropList.getType()+ " troop atacck:"+tropList.getAtackt()+" troop life:"+tropList.getVida()+" ");
            if(index == aux){
                System.out.print("HHHHHH");
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
            System.out.print(aux+ " HEY");
           
            //System.out.print(tropList.getrace()+" troop type:"+tropList.getType()+ " troop atacck:"+tropList.getAtackt()+" troop life:"+tropList.getVida()+" ");
            if(index == aux){
                System.out.print("HHHHHH");
                aux2 = tropList.getVida();
                tropList.vida(aux2 - rest);
                
            }
        
        }
        
        
    }
    
    
}
