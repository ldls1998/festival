package DB;

import Interfaces.Persistencia;


/**
 *
 * @author USER
 */
/*Principio  SOLID de responsabilidad única*/
public class VentaboletoDB implements Persistencia {
    
    
    

    @Override
    public void registrarviaje(String nombres, String apellidos, String correo, Integer Doc_ident, String Sexo, String Pais, String Departamento) {
   /*Guarda en la bd de la agencia de viajes*/
    
    }

    @Override
    public void registrarboleto(String nombres, String apellidos, String correo, Integer Doc_ident, String Sexo, String Pais, String Departamento, String tipo) {
       /*Guarda en la bd del festival*/  
   }
}
