package org.okis.dtos;

import java.util.List;

import org.okis.beans.Bonos;

public interface ListadoBonosOutDTO {
	
	public List<Bonos> listaBonos(ListadoBonosInDTO in);

}
