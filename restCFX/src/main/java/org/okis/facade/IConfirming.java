package org.okis.facade;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.beans.Oficina;
import org.okis.dtos.ListadoAnticipoInDTO;
import org.okis.dtos.ListadoAnticipoOutDTO;
import org.okis.dtos.ListadoCuentasInDTO;
import org.okis.dtos.ListadoCuentasOutDTO;
import org.okis.dtos.ListadoOficinasOutDTO;
import org.okis.dtos.ListadoOficinasOutDTOImpl;


@Path("/confirming/")
@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_XML)
//@WebService
public interface IConfirming {

	@POST
	@Path("/obtenerListadoAnticipos/")
	@WebResult(name="ListadoAnticipoOutDTO")
	public ListadoAnticipoOutDTO obtenerListadoAnticipos(ListadoAnticipoInDTO in) throws Exception;
	
	
	
	@POST
	@Path("/obtenerCuentas/")
	@WebResult(name="ListadoCuentasOutDTO")
	public ListadoCuentasOutDTO obtieneListadoCuentas(ListadoCuentasInDTO in) throws Exception;
	

	
	@POST
	@Path("/obtenerOficinas/")	
	public ListadoOficinasOutDTOImpl obtieneListdoOficinas(Oficina oficina) throws Exception;
	
}



