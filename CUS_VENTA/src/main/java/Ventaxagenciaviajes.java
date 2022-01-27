
import Interfaces.Persistencia;
import Interfaces.Venta;
import Interfaces.Ventaxagen_viajes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ventaxagenciaviajes implements Venta, Ventaxagen_viajes{

   Persistencia persistencia;

  

    public Ventaxagenciaviajes(Persistencia persistencia) {
        this.persistencia = persistencia;
    }
  

  

    @Override
    public void registrardatosdelviaje(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento) { 
     //Registrar venta de boletos de viaje
     persistencia.registrarviaje(nombres, apellidos, correo, Doc_ident, Sexo, Pais, Departamento);
    }
    
      @Override
    public void registrardatosdeboleto(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento,String tipo) {
     //Registrar venta de boletos de festival
     persistencia.registrarboleto(nombres, apellidos, correo, Doc_ident, Sexo, Pais, Departamento, tipo);
    }
    
    
}
