package org.okis.facade;

import java.util.List;

import javax.jws.WebResult;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.okis.beans.Prestamo;
import org.okis.beans.Productos;
import org.okis.dtos.ListadoPrestamosInDTO;
import org.okis.dtos.ListadoPrestamosOutDTOImpl;
import org.okis.dtos.ListadoProductosInDTO;
import org.okis.mapper.ProductoMapper;
import org.springframework.transaction.annotation.Transactional;



@Path("/operaciones/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public interface IOperacionesBancarias {	
	
	
	
	@POST
	@Path("/obtenerListadoPrestamos/")
	@WebResult(name="ListadoPrestamosOutDTOImpl")	
	public List<Prestamo> obtenerListadoPrestamos(ListadoPrestamosInDTO in) throws Exception;
	
	
	
	@POST
	@Path("/obtieneListadoProducto/")
	 public List<ProductoMapper> listaProductos(ListadoProductosInDTO in) throws Exception;
		 
		 
	 
	

}
