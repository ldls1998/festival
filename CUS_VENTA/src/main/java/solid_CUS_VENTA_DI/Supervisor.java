package com.isaias.solid.v1.dependencyinversion.con_dip;

import solid_CUS_VENTA_DI.Boleto;
import solid_CUS_VENTA_DI.IVenta;

/**
 * Clase de alto nivel
 */
public class Supervisor {

    // tendra una referencia y podra trabajar con cualquiera que implemente a IVenta
    private IVenta venta;

 
    public Supervisor(IVenta venta) {
        this.venta = venta;
    }

    public void totalVentas() {
        
        Iterable<Boleto> boleto = venta.obtenerVentas();

        for (Boleto b : boleto){
                System.out.println(b.toString());
            
        }
       
    }

}
