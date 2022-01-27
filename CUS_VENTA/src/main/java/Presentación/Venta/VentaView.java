package Presentación.Venta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class VentaView {
    	public void imprimirDatosVenta(String nombres, String apellidos, int documento, String correo, String pais, String departamento, String tipo_boleto, String ubicacion, String sexo) {
		System.out.println("**** DATOS VENTA ****");
		System.out.println("nombres: "+nombres);
		System.out.println("apellidos: "+apellidos);
		System.out.println("documento: "+documento);
                System.out.println("documento: "+correo);
                System.out.println("documento: "+pais);
                System.out.println("documento: "+departamento);
                System.out.println("Boleto: "+tipo_boleto);
                System.out.println("Ubicacion: "+ubicacion);
                System.out.println("Sexo: "+sexo);
	}

}
