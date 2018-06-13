/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import edificios.rtype;
import edificios.troopmaker;
import java.util.ArrayList;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class RACE {
    private int resources1;
    private int resources2;
    private int resources3;
    private int live;
    public ArrayList<tropa> TropList = new ArrayList<tropa>();
    public ArrayList<rtype> rtypeList = new ArrayList<rtype>();
    public ArrayList<troopmaker> tropmakerList = new ArrayList<troopmaker>();

    public int getResources() {
        return resources1;
    }

    public void setResources(int resources) {
        this.resources1 = resources;
    }

    public int getLive() {
        return live;
    }

    public int getResources2() {
        return resources2;
    }

    public void setResources2(int resources2) {
        this.resources2 = resources2;
    }

    public int getResources3() {
        return resources3;
    }

    public void setResources3(int resources3) {
        this.resources3 = resources3;
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
