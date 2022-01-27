/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controllers;

import Presentación.Venta.VentaView;
import Negocio.VentaModelo;
/**
 *
 * @author USER
 */
public class VentaController {
   //objetos vista y modelo
	private VentaView vista;
	private VentaModelo modelo;
 
	//constructor para inicializar el modelo y la vista
	//constructor para inicializar el modelo y la vista
	public VentaController(VentaModelo modelo, VentaView vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public String getNombres() {
		return modelo.getNombres();
	}
	public void setNombres(String nombres) {
		this.modelo.setNombres(nombres);
	}
	public String getApellidos() {
		return modelo.getApellidos();
	}
	public void setApellidos(String apellidos) {
		this.modelo.setApellidos(apellidos);
	}

        public int getDocumento() {
           return modelo.getDocumento();
        }

        public void setDocumento(int documento) {
            this.modelo.setDocumento(documento);
        }

        public String getCorreo() {
            return modelo.getCorreo();
        }

        public void setCorreo(String correo) {
            this.modelo.setCorreo(correo);
        }

        public String getPais() {
             return modelo.getPais();
        }

        public void setPais(String pais) {
           this.modelo.setPais(pais);
        }

        public String getDepartamento() {
            return modelo.getDepartamento();
        }

        public void setDepartamento(String departamento) {
           this.modelo.setDepartamento(departamento);
        }

        public String getTipo_boleto() {
            return modelo.getTipo_boleto();
        }

        public void setTipo_boleto(String tipo_boleto) {
            this.modelo.setTipo_boleto(tipo_boleto);
        }

        public String getUbicacion() {
           return modelo.getUbicacion();
        }

        public void setUbicacion(String ubicacion) {
            this.modelo.setUbicacion(ubicacion);
        }

        public String getSexo() {
           return modelo.getSexo();
        }

        public void setSexo(String sexo) {
           this.modelo.setSexo(sexo);
        }
        
	//pasa el modelo a la vista para presentar los datos
	public void actualizarVista() {
		vista.imprimirDatosVenta(modelo.getNombres(),modelo.getApellidos(),modelo.getDocumento(),modelo.getCorreo(),modelo.getPais(),
                        modelo.getDepartamento(),modelo.getTipo_boleto(),modelo.getUbicacion(),modelo.getSexo());
	} 
}
