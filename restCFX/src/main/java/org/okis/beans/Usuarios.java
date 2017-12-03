package org.okis.beans;

import java.util.Date;

public class Usuarios {
	
	private Integer idusuario;
	private String nombre;
	private String apellidos;
	private String email;
	private Integer edad;
	private String tlf;
	private String fotoUrl;
	private String clave;
	private Date reg_date;
	
	public Usuarios(){
		super();
	}

	public Usuarios(Integer idusuario, String nombre, String apellidos, String email, Integer edad, String tlf,
			String fotoUrl, String clave, Date reg_date) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.edad = edad;
		this.tlf = tlf;
		this.fotoUrl = fotoUrl;
		this.clave = clave;
		this.reg_date = reg_date;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	

	
}
