/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventary;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Inventary {
    private ArrayList<Object1> Object1List = new ArrayList<Object1>(); //List of objects type Object one
    private final int ObjectMax; //Maximun Object 1 type on list
    private Object1 onUse; //Current Object
    public Inventary() {
        this.ObjectMax = 5;
    }

    public void setOnUse(Object1 onUse) {
        this.onUse = onUse;
    }

    public Object1 getOnUse() {
        return onUse;
    }
    //Select Current Object
    public void useObjectOfList(Object1 ObjecttoUse){
        for(Object1 Oactual : this.Object1List){
            if(Oactual.equals(ObjecttoUse)){
                this.setOnUse(Oactual);
            }
        }
    }
    //Add object to the lsit
    public void addObject1(Object1 add){
        if(this.Object1List.size() < this.ObjectMax){
            this.Object1List.add(add);
        }
    }
    // remove Object from the list
    public void RemoveObject(Object1 remove){
        this.Object1List.remove(remove);
    }
    // Drop Object fron
    public void DropObject(Object1 remove){
        this.Object1List.remove(remove);
    }
    
    
}
