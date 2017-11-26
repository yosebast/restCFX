package org.okis.dtos;



import org.springframework.stereotype.Component;


@Component
public class ListadoAnticipoOutDTO  {
	
	
	private String nif;

	private String descripcion;

	private String nombre;

	

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
