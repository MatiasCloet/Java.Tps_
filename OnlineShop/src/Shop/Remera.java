package Shop;


public class Remera extends Producto {
    char talle;

    //talles: S, M, L, XL
    public Remera (char talle, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
       
    }

    public char getTalle() {
        return talle;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    } 
    
    @Override
    public double getPrecio() {
        
        double precio=0.0;
        
        if (this.talle == 'S' ){
            precio = this.precio + this.precio * 0.05;
        }
        if (this.talle == 'M' ){
            precio = this.precio + this.precio * 0.10;
        }
        if (this.talle == 'L' ){
            precio = this.precio + this.precio * 0.15;
        }
        if (this.talle == 'X'){
            precio = this.precio + this.precio * 0.20;
        }
        return precio;
    }
   

    @Override
    public String toString() {
        return super.toString() + "(talle: " + this.talle + ")";
    }
}
