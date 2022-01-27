
package Venta;


import Negocio.Venta.VentaBO;


/**
 *
 * @author USER
 */
public class TestVenta {
   public static void main(String[] args) {
		//objeto business object
		VentaBO clienteBusinessObject = new VentaBO();
		
		
		//obtiene todos los clientes
		clienteBusinessObject.obtenerVentas().forEach(System.out::println);
	}
}
