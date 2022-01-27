/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author USER
 */
public class VentaModelo {
   
	private String nombres;
	private String apellidos;
        private int documento;
        private String correo;
        private String pais;
        private String departamento;
        private String tipo_boleto;
        private String ubicacion;
        private String sexo;

	
	
	public VentaModelo() {
	}
	
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

        public int getDocumento() {
            return documento;
        }

        public void setDocumento(int documento) {
            this.documento = documento;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public String getTipo_boleto() {
            return tipo_boleto;
        }

        public void setTipo_boleto(String tipo_boleto) {
            this.tipo_boleto = tipo_boleto;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        
        
        
}
