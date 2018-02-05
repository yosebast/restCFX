package org.okis.dtos;

import org.okis.addin.dto.AddinDtoMapper;

public interface DtoMapperManager {

	
	
	public AddinDtoMapper<?, ?> getDtoMapper(final String cat);
}
