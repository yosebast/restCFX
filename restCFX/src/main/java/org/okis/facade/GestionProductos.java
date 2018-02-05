package org.okis.facade;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.mapper.ProductoMapper;



@Path("/productosService/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public interface GestionProductos {
	
	
	
	@POST
	@Path("/ListadoAllProductos/")
	public List<ProductoMapper> obtieneAllProductos();
	

}
