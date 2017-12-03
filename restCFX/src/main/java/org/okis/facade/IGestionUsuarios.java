package org.okis.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.dtos.ListadoUsuariosInDTO;
import org.okis.dtos.ListadoUsuariosOutDTOImpl;


@Path("/administracion/")
@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_XML)
//@WebService
public interface IGestionUsuarios {
	
	
	
	@POST
	@Path("/obtenerUsuarios/")	
	public ListadoUsuariosOutDTOImpl listadoUsuarios(ListadoUsuariosInDTO in);

}
