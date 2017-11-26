package org.okis.mapper;

import java.util.List;

import org.okis.beans.Categoria;
import org.okis.dao.ICategoriaDao;

public class CategoriaServiceImpl implements CategoriaService {

	
	private ICategoriaDao  daoCategoria;

	public void setDaoCategoria(ICategoriaDao daoCategoria) {
		this.daoCategoria = daoCategoria;
	}

	@Override
	public List<Categoria> listadoCat() {
		// TODO Auto-generated method stub
		
		List<Categoria> lista = daoCategoria.listaCategorias();
		return lista;
	}
	
	
	
	
}
