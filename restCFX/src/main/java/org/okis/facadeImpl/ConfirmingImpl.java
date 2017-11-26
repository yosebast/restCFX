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
import org.okis.dtos.ListadoOficinasOutDTOImpl;
import org.okis.facade.IConfirming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public class ConfirmingImpl implements IConfirming {
	
	
	Cuentas cuenta;	
	
	ListadoOficinasOutDTO listadoOut;
	
	public void setListadoOut(ListadoOficinasOutDTO listadoOut){
		this.listadoOut = listadoOut;
	}
	
	
	
	
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
	
	

	
	public ListadoOficinasOutDTOImpl obtieneListdoOficinas(Oficina oficina) throws Exception {
		
		
		listadoOut.listaOficinas(oficina);
		 
		 return (ListadoOficinasOutDTOImpl) listadoOut;
	
	}
	
	
}