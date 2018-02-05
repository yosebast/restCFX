package org.okis.addin.dto.impl;



import java.util.ArrayList;
import java.util.List;

import org.okis.addin.model.md.curve.FxSpot;
import org.okis.dtos.AddinDTO;
import org.okis.enums.Header;



public class FxSpotDtoMapperImpl extends AddinDtoMapperImpl<FxSpot, AddinDTO> {

	
	private final List<Header> headers;
	{
		headers = new ArrayList<>();
		headers.addAll(super.getHeaders());
		headers.add(Header.PAIR);
		headers.add(Header.QUOTATION);
		headers.add(Header.ASK);
		headers.add(Header.BID);
		headers.add(Header.FORM_FACTOR);
		headers.add(Header.HIGH);
		headers.add(Header.LOW);
		headers.add(Header.MID);
	}

	protected final List<String> headersType;
	{
		headersType = new ArrayList<>();
		headersType.addAll(super.getHeadersTypes());
		headersType.add(getTypeString(Header.PAIR.getType()));
		headersType.add(getTypeString(Header.QUOTATION.getType()));
		headersType.add(getTypeString(Header.ASK.getType()));
		headersType.add(getTypeString(Header.BID.getType()));
		headersType.add(getTypeString(Header.FORM_FACTOR.getType()));
		headersType.add(getTypeString(Header.HIGH.getType()));
		headersType.add(getTypeString(Header.LOW.getType()));
		headersType.add(getTypeString(Header.MID.getType()));
	}

	@Override
	protected List<Header> getHeaders() {
		return headers;
	}

	@Override
	public List<String> getHeadersTypes() {
		return headersType;
	}

	@Override
	protected String getValue(Header h, FxSpot t) {
		String value = super.getValue(h, t);
		if (value != null) {
			return value;
		}
		switch (h) {
		case ASK:
			return t.getAsk() == null ? null : t.getAsk().toString();
		case BID:
			return t.getBid() == null ? null : t.getBid().toString();
		case FORM_FACTOR:
			return t.getFormFactor() == null ? null : t.getFormFactor().toString();
		case HIGH:
			return t.getHigh() == null ? null : t.getHigh().toString();
		case LOW:
			return t.getLow() == null ? null : t.getLow().toString();
		case MID:
			return t.getMid() == null ? null : t.getMid().toString();
		case PAIR:
			return t.getPair();
		case QUOTATION:
			return t.getQuotation();
		}
		return value;
	}

	@Override
	protected void setValue(Header h, FxSpot t, String value)  {
		super.setValue(h, t, value);
		switch (h) {
		case ASK:
			if (value != null) {
				t.setAsk(Double.parseDouble(value));
			}
			break;
		case BID:
			if (value != null) {
				t.setBid(Double.parseDouble(value));
			}
			break;
		case FORM_FACTOR:
			if (value != null) {
				t.setFormFactor(Double.parseDouble(value));
			}
			break;
		case HIGH:
			if (value != null) {
				t.setHigh(Double.parseDouble(value));
			}
			break;
		case LOW:
			if (value != null) {
				t.setLow(Double.parseDouble(value));
			}
			break;
		case MID:
			if (value != null) {
				t.setMid(Double.parseDouble(value));
			}
			break;
		case PAIR:
			t.setPair(value);
			break;
		case QUOTATION:
			t.setQuotation(value);
			break;
		}
	}

	
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[][] getMatrixValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setMatrixValues(FxSpot t, String[][] dataMatrix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected FxSpot createInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
