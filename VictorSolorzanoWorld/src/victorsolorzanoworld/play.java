/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;


import razas.JOOS;
import razas.RACE;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class play {
 private int turn;
 
 public void atack(JOOS atacker,JOOS atacked, int index){
     atacked.restlife(index, atacker.getTrop(index).getAtackt()
     );
   
}
}
