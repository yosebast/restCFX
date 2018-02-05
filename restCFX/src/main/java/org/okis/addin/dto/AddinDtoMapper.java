package org.okis.addin.dto;

import java.util.Collection;
import java.util.List;

public interface AddinDtoMapper<T, E> {

	E toResponse(final Collection<?> marketData);	
	
    Collection<T> toVO(final E dto);
    
    public String getCategory();    
    
    public List<String> getHeadersTypes();
    
    
    
}
