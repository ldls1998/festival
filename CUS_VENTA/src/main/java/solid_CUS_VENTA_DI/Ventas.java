package solid_CUS_VENTA_DI;

import java.util.ArrayList;
import java.util.List;

public class Ventas implements IVenta {

    // ya no hay necesidad de dar acceso a la lista
    private List<Boleto> boletos;

    public Ventas() {
        this.boletos = new ArrayList<>();
    }

    public void registrarVenta(Boleto boleto) {
        boletos.add(boleto);
        System.out.println("Registramos venta de : " + boleto.getNombres());
    }

    /**
     * Con la implementacion se realiza una busqueda flexible
     * Ahora la clase Supervisor regresa una lista, en lugar de que TRABAJE CON LA LISTA DE VENTAS.
     * 
     * @return
     */
    
    
    @Override
    public Iterable<Boleto> obtenerVentas() {
        List<Boleto> encontrados = new ArrayList<>();
        for (Boleto boleto : boletos){
         
                encontrados.add(boleto);
          
        }
        return encontrados;
    }

}
