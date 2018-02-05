package org.okis.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.okis.dtos.AddinDTO;
import javax.ws.rs.core.MediaType;

@Path("/addin")
public interface AddinRestService {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/set")
	public AddinDTO insertMarketData(AddinDTO info);
	
	

}
