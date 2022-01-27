
import Interfaces.Persistencia;
import Interfaces.Venta;


/**
 *
 * @author USER
 */

class Ventaxweb implements Venta {
 
    
    
   Persistencia persistencia;

  

    public Ventaxweb(Persistencia persistencia) {
        this.persistencia = persistencia;
    }
  
    @Override
    public void registrardatosdeboleto(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento,String tipo,String ubicacion) {
       //Registrar venta de boleto por agencia de eventos
      //persistencia.registrarboleto(nombres, apellidos, correo, Doc_ident, Sexo, Pais, Departamento, tipo);
    }
}
