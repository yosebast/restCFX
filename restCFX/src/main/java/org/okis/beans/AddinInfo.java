package org.okis.beans;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddinInfo {
	
	private String category;
	private String action;
	private String user;
	private Boolean isValidate;
	private Map<String, Object> actionObjects;
	private Collection<?> vo;
	private Collection<?> responseData;
	private String snapshot;
	private String typology;
	
	public AddinInfo() {
		super();
		this.actionObjects = new HashMap<>();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Boolean getIsValidate() {
		return isValidate;
	}

	public void setIsValidate(Boolean isValidate) {
		this.isValidate = isValidate;
	}

	public Map<String, Object> getActionObjects() {
		return actionObjects;
	}

	public void setActionObjects(Map<String, Object> actionObjects) {
		this.actionObjects = actionObjects;
	}

	public Collection<?> getVo() {
		return vo;
	}

	public void setVo(Collection<?> vo) {
		this.vo = vo;
	}

	public Collection<?> getResponseData() {
		return responseData;
	}

	public void setResponseData(Collection<?> responseData) {
		this.responseData = responseData;
	}

	public String getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getTypology() {
		return typology;
	}

	public void setTypology(String typology) {
		this.typology = typology;
	}
	
	

}
