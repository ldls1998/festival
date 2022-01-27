/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author USER
 */
/*Principio solid D*/
public interface Persistencia {
    void registrarviaje(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento);
    void registrarboleto(String nombres,String apellidos,String correo,Integer Doc_ident,
    String Sexo,String Pais,String Departamento,String tipo,String ubicacion);
}
