
package Negocio.Venta;

import java.util.List;
import Persistencia.TO.TOVenta;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class VentaBO {
    //lista de tipo venta
    
	List<TOVenta> ventas;
	
	
	//constructor, se guarda en la lista una venta
	public VentaBO() {
		ventas = new ArrayList<>();
		TOVenta venta1= new TOVenta("Jose","Perez",78945612,"probando@gmail.com","Chile","Santiago","Boleto tipo A","Explanada","masculino");
	
		ventas.add(venta1);
		
	}
        
       //obtiene toda la lista de clientes
	public List<TOVenta> obtenerVentas(){
		return ventas;
	}
	
	
}
