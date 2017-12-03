package org.okis.dtos;

import java.util.List;

import org.okis.beans.Usuarios;
import org.okis.mapper.UsuariosService;

public class ListadoUsuariosOutDTOImpl implements ListadoUsuariosOutDTO {

	List<Usuarios> listaUsuarios;

	public List<Usuarios> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuarios> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	private UsuariosService ususer;	
	

	public void setUsuser(UsuariosService ususer) {
		this.ususer = ususer;
	}

	@Override
	public List<Usuarios> LisUsuarios() {
		// TODO Auto-generated method stub
		
		listaUsuarios = 	ususer.getUsuarios();
		
		return listaUsuarios;
	}
	
	
	
}
