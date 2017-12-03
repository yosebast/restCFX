package org.okis.mapper;

import java.util.List;

import org.okis.beans.Usuarios;
import org.okis.dao.IUsuarioDao;

public class UsuariosService {
	
	
	private IUsuarioDao usuDao;	
	
	public void setUsuDao(IUsuarioDao usuDao) {
		this.usuDao = usuDao;
	}




	public List<Usuarios> getUsuarios(){
		
	
		 List<Usuarios> lista = usuDao.listadoUsuarios();
		
		 return lista;
		
	}
	
	
	

}
