package Shop;


public class Accesorio extends Producto {
    double peso;
    String metal;
    
    
    //pesos: oro, plata, acero
    public Accesorio(double peso, String desc, String metal, int codigo, double precio) {
        super(desc, codigo, precio);
        this.peso = peso;
        this.metal = metal;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double getPrecio() {
        
        double precio=0.0;
        
        if (this.metal.equals("oro")) {
            precio += this.peso * 35000;
        }
        if (this.metal.equals("plata")) {
            precio += this.peso * 50000;
        }
        if (this.metal.equals("acero")) {
            precio += this.peso * 15000;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "(Bijouterie)";
    }
}