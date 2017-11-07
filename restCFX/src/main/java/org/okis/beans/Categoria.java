package org.okis.beans;

public class Categoria {
	
	private int idcategoria;
	private String nomcategoria;
	private String descripcion;

	public Categoria(){}
	
	
	public Categoria(int idcategoria, String nomcategoria, String descripcion){
		this.idcategoria = idcategoria;
		this.nomcategoria = nomcategoria;
		this.descripcion = descripcion;
		
		
	}


	public int getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getNomcategoria() {
		return nomcategoria;
	}


	public void setNomcategoria(String nomcategoria) {
		this.nomcategoria = nomcategoria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
