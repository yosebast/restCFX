package org.okis.beans;

public class Subcategoria {
	
	private int idsubcategoria;
	private int idcategoria;
	private String nomsubcategoria;
	
	public Subcategoria(){}
	
	public Subcategoria(int idsubcategoria, int idcategoria, String nomsubcategoria){
		this.idsubcategoria = idsubcategoria;
		this.idcategoria = idcategoria;
		this.nomsubcategoria = nomsubcategoria;
	}

	public int getIdsubcategoria() {
		return idsubcategoria;
	}

	public void setIdsubcategoria(int idsubcategoria) {
		this.idsubcategoria = idsubcategoria;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNomsubcategoria() {
		return nomsubcategoria;
	}

	public void setNomsubcategoria(String nomsubcategoria) {
		this.nomsubcategoria = nomsubcategoria;
	}

	
	
	

}
