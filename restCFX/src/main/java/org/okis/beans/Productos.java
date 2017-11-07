package org.okis.beans;

import java.sql.Blob;
import java.util.Date;

public class Productos {

	
	private int idProducto;
	private int seccion;
	private int categoria;
	private int subcategoria;
	private String titulo;
	private Double precio;
	private Date fechaPublicacion;
	private String estado;
	private Integer visitas;
	private String nomImagen;
	private java.sql.Blob urlFoto;
	
	
	public Productos(){}


	public Productos(int idProducto, int seccion, int categoria, int subcategoria, String titulo, Double precio,
			Date fechaPublicacion, String estado, Integer visitas, String nomImagen, Blob urlFoto) {
		super();
		this.idProducto = idProducto;
		this.seccion = seccion;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaPublicacion = fechaPublicacion;
		this.estado = estado;
		this.visitas = visitas;
		this.nomImagen = nomImagen;
		this.urlFoto = urlFoto;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public int getSeccion() {
		return seccion;
	}


	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public int getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(int subcategoria) {
		this.subcategoria = subcategoria;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Integer getVisitas() {
		return visitas;
	}


	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}


	public String getNomImagen() {
		return nomImagen;
	}


	public void setNomImagen(String nomImagen) {
		this.nomImagen = nomImagen;
	}


	public java.sql.Blob getUrlFoto() {
		return urlFoto;
	}


	public void setUrlFoto(java.sql.Blob urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	


	
	

	
	
}

	
	
	
	
	
