package Shop;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Ejecutable {
    public static void main(String[] args){
        
        LocalDate hoy = LocalDate.now();
        Scanner t = new Scanner(System.in);
        
        Cliente c = new Cliente("Miguel", 348634823);
        Venta v = new Venta(c,hoy );
        
        int rta = 0;
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("¿Desea realizar una compra?");
        System.out.println("(1)si/(2)no: ");
        rta = t.nextInt();
        if (rta == 1) {
            int rta2 = 0;
            System.out.println("Cuantos productos desea comprar: ");
            rta2 = t.nextInt();
            for (int i = 0; i < rta2; i++) {
                elegirProd(t,v);
            }
            v.imprimirFactura();
        }
        else{
            System.out.println("Mi loco, pa fuera -->");
        }
        
       
    
    
    }

    private static void elegirProd(Scanner t, Venta v) {
        
        int rta = 0;
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ingrese el numero que corresponda al que tipo de producto desea comprar: ");
        System.out.println("1- Remera "
                         +  "\n" + "2- Pantalon" 
                         +  "\n" + "3 - Accesorio");
        rta = t.nextInt();
        if (rta == 1) {
            crearRemera(t,v);
        }
        if (rta == 2) {
            crearPantalon(t,v);
        }
        if (rta == 3) {
            crearAccesorio(t,v);
        }
    }
    
    private static void crearPantalon(Scanner t, Venta v){
        System.out.println("-------------------------------------------------------------------------");
        int talla;
        System.out.println("Ingrese la talla del pantalon: ");
        talla = t.nextInt();
        String modelo;
        System.out.println("Ingrese el modelo del pantalon: ");
        modelo = t.next();
        String desc;
        System.out.println("Descripcion del pantalon: ");
        desc = t.next();
        int codigo;
        System.out.println("Codigo del producto: ");
        codigo = t.nextInt();
        double precio;
        System.out.println("Precio del pantalon: ");
        precio = t.nextDouble();
        Pantalon p = new Pantalon(talla, modelo, desc, codigo, precio);
        v.agregarProducto(p);
        
        
    }
    
    private static void crearRemera(Scanner t, Venta v){
        System.out.println("-------------------------------------------------------------------------");
        char talle;
        System.out.println("Ingrese el talle de la remera: ");
        talle = t.next().charAt(0);
        String desc;
        System.out.println("Descripcion de la remera: ");
        desc = t.next();
        int codigo;
        System.out.println("Codigo del producto: ");
        codigo = t.nextInt();
        double precio;
        System.out.println("Precio de la remera: ");
        precio = t.nextDouble();
        Remera r = new Remera(talle, desc, codigo, precio);
        v.agregarProducto(r);
        
        
        
    }
    
    private static void crearAccesorio(Scanner t, Venta v){
        System.out.println("-------------------------------------------------------------------------");
        double peso;
        System.out.println("Ingrese el peso del metal: ");
        peso = t.nextDouble();
        String metal;
        System.out.println("Ingrese el tipo de metal del accesorio: ");
        metal = t.next();
        String desc;
        System.out.println("Descripcion del accesorio: ");
        desc = t.next();
        int codigo;
        System.out.println("Codigo del producto: ");
        codigo = t.nextInt();
        double precio;
        System.out.println("Precio del accesorio: ");
        precio = t.nextDouble();
        Accesorio a = new Accesorio(peso, desc, metal, codigo, precio);
        v.agregarProducto(a);
        
    }
}
