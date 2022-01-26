
import Interfaces.Persistencia;
import Interfaces.Venta;



/**
 *
 * @author USER
 */
class Ventaxagenciaeventos implements Venta  {

   Persistencia persistencia;

  

    public Ventaxagenciaeventos(Persistencia persistencia) {
        this.persistencia = persistencia;
    }
  

    @Override
    public void registrardatosdeboleto(Integer id,String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento,String tipo) {
        //Registrar venta de boleto por agencia
         persistencia.registrarboleto(id,nombres,apellidos,correo,Doc_ident,Sexo,Pais,Departamento,tipo);
    }
    
}
