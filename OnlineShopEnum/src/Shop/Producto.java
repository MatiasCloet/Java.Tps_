package Shop;


public abstract class Producto {
    protected String desc;
    protected int codigo; 
    protected double precio;

    public Producto(String desc, int codigo, double precio) {
        this.desc = desc;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public abstract double getPrecio();
       
    

    @Override
    public String toString() {
        return this.desc + "........ $ " + this.getPrecio();
    }
    
    
}
