package Shop;


public class Pantalon extends Producto {
    int talla;
    String modelo;
    
    
    //modelos: oxford, skinny, recto
    
    public Pantalon(int talla, String modelo, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.talla = talla;
        this.modelo = modelo;
        
       
        
      
        
    }
    
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public double getPrecio() {
                
        double precio=0.0;
        
        if ( this.modelo.equals("oxford")) {   
           
            double aumento=this.precio *PantalonEnum.OXFORD.getPorcentaje();
            precio = this.precio + aumento;
            
        }
        if ( this.modelo.equals("skinny")) {   
           
            double aumento=this.precio *PantalonEnum.SKINNY.getPorcentaje();
            precio = this.precio + aumento;
            
        }
        if ( this.modelo.equals("recto")) {   
           
            double aumento=this.precio *PantalonEnum.RECTO.getPorcentaje();
            precio = this.precio + aumento;
            
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "(talle: " + this.talla + ")";
    }
    
    
}
