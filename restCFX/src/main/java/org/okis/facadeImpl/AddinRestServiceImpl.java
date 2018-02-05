package org.okis.facadeImpl;

import org.okis.addin.dto.AddinDtoMapper;
import org.okis.beans.AddinInfo;
import org.okis.constants.ActionServiceConstants;
import org.okis.dtos.AddinDTO;
import org.okis.dtos.DtoMapperManager;
import org.okis.enums.AccessLevel;
import org.okis.facade.AddinRestService;

public class AddinRestServiceImpl implements AddinRestService {
	
	
	private DtoMapperManager dtoMapperManager;

	@Override
	public AddinDTO insertMarketData(AddinDTO info) {
		// TODO Auto-generated method stub
		
		String action = getAction(info, ActionServiceConstants.ACTION_SET_BD_NO_ATTR);
		AddinDTO response = executeAddingInvocation(info, action, AccessLevel.WRITE);
		
		return null;
	}

	private String getAction(AddinDTO info, String aux) {
		// TODO Auto-generated method stub
		
		String defaultAction = aux;
		if(info.getAction() != null && !info.getAction().isEmpty()) {
			defaultAction = info.getAction();			
		}
			
		return defaultAction;
	}

	private AddinDTO executeAddingInvocation(AddinDTO info, String action, AccessLevel accessLevel) {
		// TODO Auto-generated method stub
		AddinDTO response = new AddinDTO();
		
		try {
			
			if(info == null || info.getCategory() == null) {
				System.out.println("No info o Category");
			}else {
				response = executeAddinAction(info, action);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return response;
	}

	private AddinDTO executeAddinAction(AddinDTO info, String actionDefault) {
		// TODO Auto-generated method stub
		AddinDTO response = new AddinDTO();
		final AddinInfo dataInfo = toInfo(info.getCategory(), info.getUser(), info.getSnapshot(), actionDefault);
		final boolean validate = true;
		
		if(!response.isHasError()) {
			
			final AddinDtoMapper<?, AddinDTO> addinDtoMapper = (AddinDtoMapper) this.dtoMapperManager.getDtoMapper(info.getCategory());
		}
		
		return null;
	}

	private AddinInfo toInfo(String category, String user, String snapshot, String actionDefault) {
		// TODO Auto-generated method stub
		
		AddinInfo dataInfo = new AddinInfo();
		dataInfo.setCategory(category);
		dataInfo.setUser(user);
		dataInfo.setSnapshot(snapshot);
		dataInfo.setAction(actionDefault);
		return dataInfo;
	}

}
