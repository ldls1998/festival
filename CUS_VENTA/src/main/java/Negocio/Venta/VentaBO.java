
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
                TOVenta venta2= new TOVenta("Mariana","Balceda",456789123,"probando123@gmail.com","Argentina","Buenos Aires","Boleto tipo B","Sur","femenino");
		ventas.add(venta1);
                ventas.add(venta2);
		
	}
        
       //obtiene toda la lista de clientes
	public List<TOVenta> obtenerVentas(){
		return ventas;
	}
	
	
}
