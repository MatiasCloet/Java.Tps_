
package Shop;



public enum PantalonEnum {
    OXFORD(0.15),
    SKINNY(0.25),
    RECTO(0.15);
    
   
    private double porcentaje;
    
     PantalonEnum(double porcentaje){
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
     
    
}
