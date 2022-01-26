

/**
 *
 * @author USER
 */
public class Ventaboleto {
    Integer id;
    String nombres;
    String apellidos;
    String correo;
    Integer Doc_ident;
    String Sexo;
    String Pais;
    String Departamento;
    
    

    Ventaboleto(Integer id,String nombres, String apellidos, String correo, Integer Doc_ident,String Sexo,
            String Pais, String Departamento){ 
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.Doc_ident = Doc_ident;
        this.Sexo = Sexo;
        this.Pais = Pais;
        this.Departamento = Departamento;
    }
}
