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
public class RACE {
    private int resources;
    private int live;
    public ArrayList<tropa> TropList = new ArrayList<tropa>();

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }
    
    public void SHOW(){
        System.out.print("Showing all trops: \n");
        for (tropa TropList : TropList){
            
            System.out.print("trop race:"+TropList.getrace()+" troop type:"+TropList.getType()+ " troop atacck:"+TropList.getAtackt()+" troop life:"+TropList.getVida()+" \n");
            
        
        }
    }
    
    
}
