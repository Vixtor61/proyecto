/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author UCA
 */

abstract class Eresource_Builder {
    protected rtype r;

    public edificio getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new rtype();
    }

    public abstract void buildrace();
    public abstract void buildtype();
    public abstract void buildvida();
    public abstract void buildR();

}

/* "ConcreteBuilder" */
class rtype1 extends Eresource_Builder{
    
    public void buildrace() {
        r.race("JOO ");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    public void buildtype() {
        r.type("especial");
    }

    public void buildvida() {
        r.vida(45);
    }
    public void buildR() {
        r.setResourceP(45);
    }
    
}

class rtype2 extends Eresource_Builder{
    
    public void buildrace() {
        r.race("JOO ");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    public void buildtype() {
        r.type("especial");
    }

    public void buildvida() {
        r.vida(45);
    }
    public void buildR() {
        r.setResourceP(45);
    }
    
}
class rtype3 extends Eresource_Builder{
    
    public void buildrace() {
        r.race("JOO ");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    public void buildtype() {
        r.type("especial");
    }

    public void buildvida() {
        r.vida(45);
    }
    public void buildR() {
        r.setResourceP(45);
    }
    
}

/* "Director" */
class Rtypemaker {
    private Eresource_Builder rtypebuilder;

    public void setTroopBuilder(Eresource_Builder pb) {
        rtypebuilder = pb;
    }

    public edificio getTropa() {
        return rtypebuilder.getTropa();
    }

    public void constructTRooP() {
        rtypebuilder.createNewRtypeProduct();
        rtypebuilder.buildvida();
        rtypebuilder.buildrace();
        rtypebuilder.buildtype();
        rtypebuilder.buildR();
       
    }
}
