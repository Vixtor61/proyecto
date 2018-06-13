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
import razas.JOOS;
import razas.NIG;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class play {
 private int turn;
 public void Start(){
     
 }
 
 public void atack(JOOS atacker,NIG atacked, int index){
     int a = atacker.getTrop(index).getAtackt();
     atacked.restlife(index, a
     );
    
   
}
 
 public void atack(tropa atacker,tropa atacked, int index){
     atacked.restlife(atacker.getAtackt());
    
   
}
 
 public void atack(tropa atacker,edificio atacked){
     atacked.restlife(atacker.getAtackt());
     }
 
 public void atack(tropa atacker,troopmaker atacked){
     atacked.restlife(atacker.getAtackt());
     }
 
 
 public void atack(tropa atacker,rtype atacked){
     atacked.restlife(atacker.getAtackt());
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
