package Interfaces;


/**
 *
 * @author USER
 */

/*I: Principio de segregación de interfaz*/
public interface Venta {
   
     void registrardatosdeboleto(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento,String tipo,String ubicacion);
}
