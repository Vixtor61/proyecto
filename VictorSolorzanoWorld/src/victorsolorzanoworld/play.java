/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;


import edificios.EDChoser;
import edificios.choseEd;
import razas.JOOS;
import razas.NIG;
import razas.RACE;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class play {
 private int turn;
 
 public void atack(JOOS atacker,NIG atacked, int index){
     int a = atacker.getTrop(index).getAtackt();
     atacked.restlife(index, a
     );
    
   
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
