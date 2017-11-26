package org.okis.dtos;

import java.util.List;

import org.okis.beans.Categoria;
import org.okis.mapper.CategoriaService;

public class ListadoCategoriasOutDTOImpl implements ListadoCategoriasOutDTO {
	

	
	private List<Categoria> listaCategorias;

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}
	
	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
	
	private CategoriaService categoriaService;
	

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@Override
	public List<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		
		listaCategorias = categoriaService.listadoCat();
		return listaCategorias;
	}


	
	
	

}
