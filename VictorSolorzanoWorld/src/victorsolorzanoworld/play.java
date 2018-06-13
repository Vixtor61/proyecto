/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;


import edificios.EDChoser;
import edificios.choseEd;
import edificios.edificio;
import edificios.rtype;
import edificios.troopmaker;
import edificios.vehiclemaker;
import razas.JOOS;
import razas.NIG;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class play {
 private int fasecounter;
 private int turn;
 private JOOS j = null;
private NIG n = null;

 public void Start(){
     j = new JOOS();
     n = new NIG();
     while(j.defeat && n.defeat){
         j.menuEdificio(j);
     }
 }
 
 public void atack(JOOS atacker,NIG atacked, int index){
     int a = atacker.getTrop(index).getAtackt();
     atacked.restlife(index, a
     );
    
   
}
 
 public void atack(tropa ataked,int g){
     ataked.restlife(g);
 }
 public void atack(rtype ataked,int g){
     ataked.restlife(g);
 }
 public void atack(troopmaker ataked,int g){
     ataked.restlife(g);
 }
 public void atack(vehiclemaker ataked,int g){
     ataked.restlife(g);
 }   
   

 public void addB(JOOS a){
     EDChoser d = new EDChoser(choseEd.tmaker);
     
     a.tropmakerList.add(d.createTmaker());
 }
 public void addB(NIG a){
     EDChoser d = new EDChoser(choseEd.tmaker);
     
     a.tropmakerList.add(d.createTmaker());
 }
}
