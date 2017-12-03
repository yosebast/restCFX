package org.okis.facadeImpl;

import org.okis.dtos.ListadoUsuariosInDTO;
import org.okis.dtos.ListadoUsuariosOutDTO;
import org.okis.dtos.ListadoUsuariosOutDTOImpl;
import org.okis.facade.IGestionUsuarios;

public class GestionUsuariosImpl implements IGestionUsuarios {

	private ListadoUsuariosOutDTO listadosUsuarios;	
	
	public ListadoUsuariosOutDTO getListadosUsuarios() {
		return listadosUsuarios;
	}

	public void setListadosUsuarios(ListadoUsuariosOutDTO listadosUsuarios) {
		this.listadosUsuarios = listadosUsuarios;
	}


	@Override
	public ListadoUsuariosOutDTOImpl listadoUsuarios(ListadoUsuariosInDTO in) {
		// TODO Auto-generated method stub
		
		listadosUsuarios.LisUsuarios();
		
		ListadoUsuariosOutDTO lista = getListadosUsuarios();
		
		return (ListadoUsuariosOutDTOImpl) lista;
	}

}
