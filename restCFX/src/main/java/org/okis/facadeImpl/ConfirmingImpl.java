package org.okis.facadeImpl;

import java.util.ArrayList;
import java.util.List;

import org.okis.beans.Cuentas;
import org.okis.beans.Oficina;
import org.okis.dtos.ListadoAnticipoInDTO;
import org.okis.dtos.ListadoAnticipoOutDTO;
import org.okis.dtos.ListadoCuentasInDTO;
import org.okis.dtos.ListadoCuentasOutDTO;
import org.okis.dtos.ListadoOficinasOutDTO;
import org.okis.facade.IConfirming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ConfirmingImpl implements IConfirming {
	
	
	Cuentas cuenta;
	
	@Autowired
	ListadoOficinasOutDTO listadoOut;
	
	
	@Override
	public ListadoAnticipoOutDTO obtenerListadoAnticipos(ListadoAnticipoInDTO in){

		ListadoAnticipoOutDTO out = new ListadoAnticipoOutDTO();
		
		out.setNif(in.getNif());
		out.setDescripcion(in.getDescripcion());
		out.setNombre(in.getNombre());
			
		return out;
	}

	@Override
	public ListadoCuentasOutDTO obtieneListadoCuentas(ListadoCuentasInDTO in) throws Exception {
		// TODO Auto-generated method stub
		
		 cuenta = in.getCuenta();
		
		Integer numeroCuenta = cuenta.getNumero();
		
		//determino cuantas cuentas estan asociadas a esta cuenta principal
		
		List<Cuentas> listacuenta = new ArrayList<Cuentas>();
		
		
				listacuenta.add(new Cuentas(numeroCuenta, "sebast"));
				listacuenta.add(new Cuentas(numeroCuenta, "vlady"));
				listacuenta.add(new Cuentas(numeroCuenta, "ceca"));
				
				
				ListadoCuentasOutDTO  cuentasOut = new ListadoCuentasOutDTO();
				
				
				cuentasOut.setCuentascorrientes(listacuenta);
	
		return cuentasOut;
	}
	
	

	@Override
	public ListadoOficinasOutDTO obtieneListdoOficinas(Oficina oficina) throws Exception {
		
		
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
			
			if(codPostal == off.getCodPostal() ||  (((Oficina)ofi).getCodPostal()).toString().contains(codPostal.toString())){
				
				listaOficinas.add(off);
			
			}
			
		}
		
		//como esta clase esta siendo manejada por spring desde su contexto   entonces la tengo que inyectar y no hacer un new como en el resto de listados
		//ademas al listadoOut  inyectado le inyecto la lista por setter  lo podria tambien hacer sin anotaciones  solamente definiendo el bean en el contenedor
		
		listadoOut.setOficinas(listaOficinas);		
		
		}
		
		return listadoOut;
	}
	
	
	
	
	
}