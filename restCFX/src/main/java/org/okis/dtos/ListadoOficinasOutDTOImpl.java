package org.okis.dtos;


import java.util.ArrayList;
import java.util.List;





import org.okis.beans.Oficina;
import org.springframework.stereotype.Component;




public class ListadoOficinasOutDTOImpl implements ListadoOficinasOutDTO {
	
	
	private List<Oficina> listaOficina;
	
	
	

	public List<Oficina> getListaOficina() {
		return listaOficina;
	}




	public void setListaOficina(List<Oficina> listaOficina) {
		this.listaOficina = listaOficina;
	}




	@Override
	public List<Oficina> listaOficinas(Oficina oficina) {
		// TODO Auto-generated method stub
		List<Oficina> listaOficinas = new ArrayList<Oficina>();		
	
		
		List<Oficina> listadoOficinas = new ArrayList<Oficina>();
		
		Oficina oficinas1 = new Oficina(56, "calle talisio 2", 28014);		

		listadoOficinas.add(oficinas1);
		
		Oficina oficinas2 =new Oficina(45, "calle prudencio alvaro 3", 28027);		

		listadoOficinas.add(oficinas2);
		
		Oficina oficinas3 = new Oficina(2, "calle doctor vallejo 5", 33056);

		listadoOficinas.add(oficinas3);
		
	
		if(oficina.getCodPostal() != null){
		
		Integer codPostal = oficina.getCodPostal();
		
		for(Object ofi : listadoOficinas){
			
			Oficina off = ((Oficina)ofi); 
			//con esto comprobamos si la cadena codPostal.toString()   se encuentra en ((Oficina)ofi).getCodPostal()).toString()
			if(codPostal == off.getCodPostal() ||  (((Oficina)ofi).getCodPostal()).toString().contains(codPostal.toString())){
				
				listaOficinas.add(off);
			
			}
			
		}
		
		//como esta clase esta siendo manejada por spring desde su contexto   entonces la tengo que inyectar y no hacer un new como en el resto de listados
		//ademas al listadoOut  inyectado le inyecto la lista por setter  lo podria tambien hacer sin anotaciones  solamente definiendo el bean en el contenedor
	
		}
		
		
		
		 listaOficina = listaOficinas;
		
		return listaOficina;
		 
		

		}
	
	/*public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		List<Oficina> ofi = new ArrayList<Oficina>();
			
			
					ofi.add(new Oficina(123456789, "sebast", 488));
					ofi.add(new Oficina(15684899, "vlady", 56656));
					ofi.add(new Oficina(745785478, "ceca", 55464));
					
			
			
			ListadoOficinasOutDTOImpl d = new ListadoOficinasOutDTOImpl();
			
			d.setOficinas(ofi);
			
			System.out.println(new ObjectMapper().writeValueAsString(d));
		}
	*/
	
	
}
