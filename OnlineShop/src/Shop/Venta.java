package Shop;

import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Venta {
    
    ArrayList<Producto> listaProd;
    Cliente cliente;
    static int cantVentas;
    int nroFact;
    LocalDate fecha;

    public Venta(Cliente cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        listaProd=new ArrayList();
    }
    
    public void agregarProducto(Producto p){
        listaProd.add(p);
    }
    
    public double calcularImporte(){
        double total = 0;
        for (Producto p:this.listaProd) {
            total += p.getPrecio();
        }
        return total;
    }

    public int getNroFact() {
        int nroFact = 1091;
        return nroFact;
    }

    public void imprimirFactura(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Factura N°: " + getNroFact() +" - "+  this.fecha);
        for (Producto p: this.listaProd) {
            System.out.println(p.toString());
        }
        System.out.println("Total a pagar:.............. $ " + this.calcularImporte() );
        System.out.println("-------------------------------------------------------------------------");
        
    }
}
