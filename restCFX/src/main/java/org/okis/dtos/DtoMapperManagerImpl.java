package org.okis.dtos;

import java.util.Map;

import org.okis.addin.dto.AddinDtoMapper;

public class DtoMapperManagerImpl implements DtoMapperManager {

	
	private Map<String, AddinDtoMapper<?, ?>> addinDtoMapperMap;
	
	
	@Override
	public AddinDtoMapper<?, ?> getDtoMapper(String cat) {
		// TODO Auto-generated method stub
		
		AddinDtoMapper<?, ?> addin = this.addinDtoMapperMap.get(cat);
		return null;
	}

}
