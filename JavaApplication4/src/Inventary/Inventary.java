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
                Oactual.USE();
            }
        }
    }
    public void useObjectOfList(int ObjecttoUse){
        
        try{
            this.Object1List.get(ObjecttoUse);
            useObjectOfList(this.Object1List.get(ObjecttoUse));
        }
        catch(Exception e){
            System.out.print("sorry");
        }
        
    }
    //Add object to the lsit
    public void addObject1(Object1 add){
        if(this.Object1List.size() < this.ObjectMax){
            System.out.print("Object added\n");
    
            this.Object1List.add(add);
        }
        else{
        System.out.print("max object capacity reached\n");
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
    public Object1 getObject(int i){
        return this.Object1List.get(i);
    }
    
    
}

