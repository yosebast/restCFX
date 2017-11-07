package org.okis.beans;

public class Seccion {
	
	private int idseccion;
	private String nomseccion;
	
	public Seccion(){}
	
	public Seccion(int idseccion, String nomseccion){
		this.idseccion = idseccion;
		this.nomseccion = nomseccion;
		
	}

	public int getIdseccion() {
		return idseccion;
	}

	public void setIdseccion(int idseccion) {
		this.idseccion = idseccion;
	}

	public String getNomseccion() {
		return nomseccion;
	}

	public void setNomseccion(String nomseccion) {
		this.nomseccion = nomseccion;
	}


}
