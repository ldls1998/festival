/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
class Boleto_tipoA extends Boleto {

    public Boleto_tipoA(Integer id, String nombres, String apellidos, String correo, Integer Doc_ident, String Sexo, String Pais, String Departamento) {
        super(id, nombres, apellidos, correo, Doc_ident, Sexo, Pais, Departamento);
    }

    @Override
         int precio() { return 100; }
}
    

