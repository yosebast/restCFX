package org.okis.addin.model.md;

import org.okis.addin.model.md.typology.TyphoonInfo;
import org.okis.enums.Category;

public interface TyphoonCompatible {

	  Category getCategory();

	    TyphoonInfo getTyInfo();

	    void setTyInfo(TyphoonInfo tyInfo);

	    TyphoonAuditory getTyAudit();
	    
	    void setTyAudit(TyphoonAuditory tyAudit);
	    
	    String generateInstrumentName();
	    
	    boolean hasAllMandatoryFields();
}
