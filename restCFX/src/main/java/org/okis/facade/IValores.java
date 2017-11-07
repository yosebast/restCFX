package org.okis.facade;

import javax.jws.WebResult;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.dtos.ListadoAccionesInDTO;
import org.okis.dtos.ListadoAccionesOutDTOImpl;
import org.okis.dtos.ListadoBonosInDTO;
import org.okis.dtos.ListadoBonosOutDTOImpl;
import org.okis.dtos.ListadoBrokersInDTO;
import org.okis.dtos.ListadoBrokersOutDTOImpl;


@Path("/valores/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public interface IValores {	
	
	@POST
	@Path("/obtenerListadoAcciones/")
	@WebResult(name="ListadoAccionesOutDTOImpl")
	public ListadoAccionesOutDTOImpl obtenerListadoValores(ListadoAccionesInDTO in) throws Exception;
	
	
	@POST
	@Path("/obtenerListadoBrokers/")
	@WebResult(name="ListadoBrokersOutDTOImpl")
	public ListadoBrokersOutDTOImpl obtieneListadoBrokers(ListadoBrokersInDTO in) throws Exception;
	
	@POST
	@Path("/obtieneListadoBonos/")
	@WebResult(name="ListadoBonosOutDTOImpl")
	public ListadoBonosOutDTOImpl obtieneListadoBonos(ListadoBonosInDTO in) throws Exception;

}
