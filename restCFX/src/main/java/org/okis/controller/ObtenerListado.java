package org.okis.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.okis.beans.FileFormBean;
import org.okis.dtos.ListadoAnticipoInDTO;
import org.okis.dtos.ListadoAnticipoOutDTO;
import org.okis.facade.IConfirming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class ObtenerListado {
	
	/**
	 * Log.
	 */
	private static final Log LOG = LogFactory
			.getLog(ObtenerListado.class);	

	
	@Autowired
	private IConfirming servicioConfirming;	
	
	@Autowired
	private ListadoAnticipoOutDTO respuesta;
	
	@Autowired 
	private ListadoAnticipoInDTO entrada;	

	@RequestMapping(value="obtenerListado", method=RequestMethod.POST)
	@ResponseBody 
	public ListadoAnticipoOutDTO listadoAnticipoDatosJson(@RequestBody ListadoAnticipoInDTO in){
		
		
		
		
		
	/*esto no fuciona solo funciona recuperando un objeto   con el @RequestBody
	 * 
	 * 	@RequestParam(value="nif") String nif,
		@RequestParam(value="nombre") String nombre, 
		@RequestParam(value="descripcion") String descripcion,
		@RequestParam(value="tipoNif") String tipoNif*/
		
		
		
		entrada.setNif(in.getNif());
		entrada.setNombre(in.getNombre());
		entrada.setDescripcion(in.getDescripcion());
		
	
		try {
			respuesta = servicioConfirming.obtenerListadoAnticipos(entrada);
		} catch (Exception e) {
			
			LOG.info("listadoAnticipoDatosJson", e);
		}
		
		
		return respuesta;
		
	}
	
	//subir fichero
	
	
	@RequestMapping(value= "/greet", method=RequestMethod.GET)
	public  @ModelAttribute("fileFormBean") FileFormBean getInitialMessage() {
        return new FileFormBean();
		
	}
	
	
	@RequestMapping(value= "/greet", method = RequestMethod.POST)
    public @ModelAttribute("message") String guardaFichero(@ModelAttribute FileFormBean fileFormBean) {
    	
    	try {
			grabarFicheroALocal(fileFormBean);
		} catch (Exception e) {
			e.printStackTrace();
			return "No se ha podido grabar el fichero";
		}
    	
    	return "Fichero grabado correctamente";
    }

	private void grabarFicheroALocal(FileFormBean fileFormBean) throws Exception {
		CommonsMultipartFile uploaded = fileFormBean.getFichero();
    	File localFile = new File("C:\\Entorno\\ficheros\\"+uploaded.getOriginalFilename());
    	FileOutputStream os = null;
    	
    	try {
    		
    		os = new FileOutputStream(localFile);
    		os.write(uploaded.getBytes());
    		
    	} finally {
    		if (os != null) {
    			try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    	}
	}
	
	
	
}
