package org.okis.dtos;


import java.util.List;





import org.okis.beans.Oficina;
import org.springframework.stereotype.Component;




@Component
public class ListadoOficinasOutDTO {

	
	private List<Oficina> oficinas;

	
	
	public List<Oficina> getOficinas() {
		return oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}
	
	
	/*public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		List<Oficina> ofi = new ArrayList<Oficina>();
			
			
					ofi.add(new Oficina(123456789, "sebast", 488));
					ofi.add(new Oficina(15684899, "vlady", 56656));
					ofi.add(new Oficina(745785478, "ceca", 55464));
					
			
			
			ListadoOficinasOutDTO d = new ListadoOficinasOutDTO();
			
			d.setOficinas(ofi);
			
			System.out.println(new ObjectMapper().writeValueAsString(d));
		}
	*/
	
	
}
