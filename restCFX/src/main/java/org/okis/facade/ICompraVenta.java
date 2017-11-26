package org.okis.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.dtos.ListadoCategoriasInDTO;
import org.okis.dtos.ListadoCategoriasOutDTOImpl;

@Path("operacionescompraventa")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ICompraVenta {
	
	
	@POST
	@Path("/obtienelistadoCategorias/")
	public ListadoCategoriasOutDTOImpl listaCategorias(ListadoCategoriasInDTO in);
		
		
	
	
	
	

}
