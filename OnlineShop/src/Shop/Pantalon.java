package Shop;


public class Pantalon extends Producto {
    int talla;
    String modelo;
    
    
    //modelos: oxford, skinny, recto
    //talles: S, M, L, XL
    
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
        
        if (this.modelo.equals("Oxford")) {
            precio = this.precio + this.precio * 0.15;
        }
        if (this.modelo.equals("Skinny")){
            precio = this.precio + this.precio * 0.25;
        }
        if (this.modelo.equals("Recto")){
            precio = this.precio - this.precio * 0.15;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "(talle: " + this.talla + ")";
    }
    
    
}
