package org.okis.dtos;



import java.io.IOException;
import java.io.Serializable;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class ListadoAnticipoInDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String nif;

	
	private String nombre;
	
	
	private String descripcion;


	private String tipoNif;

	

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoNif() {
		return tipoNif;
	}

	public void setTipoNif(String tipoNif) {
		this.tipoNif = tipoNif;
	}

		public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		ListadoAnticipoInDTO d = new ListadoAnticipoInDTO();
		
		System.out.println(new ObjectMapper().writeValueAsString(d));
	}
	
	
}
