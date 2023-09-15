package Shop;


public class Cliente {
    String nombre;
    int dni;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
    
}
