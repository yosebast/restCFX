package org.okis.dtos;

import java.util.List;

public class AddinDTO {

	
	private boolean hasError = false;
	private String message;
	private String user;
	private String category;
	private String[] headers;
	private String[] headersTypes;
	private String action;
	private List<DataItemDTO> data;
	private String snapshot;
	private String typology;
	
	public AddinDTO() {
		
	}

	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String[] getHeaders() {
		return headers;
	}

	public void setHeaders(String[] headers) {
		this.headers = headers;
	}

	public String[] getHeadersTypes() {
		return headersTypes;
	}

	public void setHeadersTypes(String[] headersTypes) {
		this.headersTypes = headersTypes;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<DataItemDTO> getData() {
		return data;
	}

	public void setData(List<DataItemDTO> data) {
		this.data = data;
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
