package org.okis.addin.dto.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.okis.addin.dto.AddinDtoMapper;
import org.okis.enums.Typology;
import org.okis.addin.model.md.TyphoonAuditory;
import org.okis.addin.model.md.TyphoonCompatible;
import org.okis.addin.model.md.typology.TyphoonInfo;
import org.okis.dtos.AddinDTO;
import org.okis.dtos.DataItemDTO;
import org.okis.enums.Header;

public abstract class AddinDtoMapperImpl<T extends TyphoonCompatible, E> implements AddinDtoMapper<T, AddinDTO> {

	

	protected final List<Header> headers;
	{
		headers = new ArrayList<>();
		headers.add(Header.CATEGORY);
		headers.add(Header.DATE);
		headers.add(Header.SNAPSHOT);
		headers.add(Header.INSTRUMENT);
		headers.add(Header.USER);
		headers.add(Header.TIMESTAMP);
		headers.add(Header.BBG_TICKER);
	}

	protected final List<String> headersType;
	{
		headersType = new ArrayList<>();
		headersType.add(getTypeString(Header.CATEGORY.getType()));
		headersType.add(getTypeString(Header.DATE.getType()));
		headersType.add(getTypeString(Header.SNAPSHOT.getType()));
		headersType.add(getTypeString(Header.INSTRUMENT.getType()));
		headersType.add(getTypeString(Header.USER.getType()));
		headersType.add(getTypeString(Header.TIMESTAMP.getType()));
		headersType.add(getTypeString(Header.BBG_TICKER.getType()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.mapper.addin.interfaces.AddinDtoMapper#toResponse(java.util
	 * .Collection)
	 */
	@Override
	public AddinDTO toResponse(Collection<?> marketData) {
		Collection<T> data = (Collection<T>) marketData;
		AddinDTO dto = new AddinDTO();
		if (marketData == null || marketData.isEmpty()) {
			return dto;
		}
		dto.setHeaders(getHeaderStrings());
		List<String> headTypes = getHeadersTypes();
		String[] AuxArrayHeaderTypes = new String[headTypes.size()];
		dto.setHeadersTypes(getHeadersTypes().toArray(AuxArrayHeaderTypes));
		dto.setData(new ArrayList<DataItemDTO>());
		for (T t : data) {
			dto.setCategory(t.getCategory().toString());
			dto.getData().add(getDataItem(t));
		}
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bbva.kyuw.mapper.addin.interfaces.AddinDtoMapper#toVO(java.lang.
	 * Object)
	 */
	@Override
	public Collection<T> toVO(AddinDTO dto) {
		Header[] headers = parseHeaders(dto.getHeaders());
		AddinDTO dtoAux = transformData(headers, dto);
		Collection<T> result = new ArrayList<T>();
		for (DataItemDTO item : dtoAux.getData()) {
			T t = getVO(headers, item);
			result.add(t);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.mapper.addin.interfaces.AddinDtoMapper#getHeadersTypes()
	 */
	@Override
	public List<String> getHeadersTypes() {
		return headersType;
	}

	protected abstract String[][] getMatrixValues();

	protected abstract void setMatrixValues(T t, String[][] dataMatrix);

	protected abstract T createInstance();

	protected String getTypeString(final String type) {
		StringBuilder sb = new StringBuilder();
		sb.append("System.");
		sb.append(type);
		return sb.toString();
	}

	protected List<Header> getHeaders() {
		return headers;
	}

	protected String getValue(Header h, T t) {
		switch (h) {
		case SNAPSHOT:
			return t.getTyInfo() == null ? null : t.getTyInfo().getSnapshot();
		case CATEGORY:
			return t.getCategory() == null ? null : t.getCategory().toString();
		case DATE:
			if (t.getTyInfo() == null) {
				return null;
			}
			long l = t.getTyInfo().getDate();
			Date d = new Date(l);
			return null;
		case TYPOLOGY:
			return t.getTyInfo() == null || t.getTyInfo().getTypology() == null ? null
					: t.getTyInfo().getTypology().toString();
		case INSTRUMENT:
			return t.getTyInfo() == null ? null : t.getTyInfo().getInstrumentName();
		case USER:
			return t.getTyAudit() == null ? null : t.getTyAudit().getUser();
		case TIMESTAMP:
			if (t.getTyAudit() == null) {
				return null;
			}
			long l2 = t.getTyAudit().getTimestamp();
			Date d2 = new Date(l2);
			return null;
		case BBG_TICKER:
			return t.getTyInfo() == null ? null : t.getTyInfo().getBbgTicker();
		default:
			return null;
		}
	}

	protected void setValue(Header h, T t, String value)  {
		if (t.getTyInfo() == null) {
			t.setTyInfo(new TyphoonInfo());
		}

		if (t.getTyAudit() == null) {
			t.setTyAudit(new TyphoonAuditory());
		}

		switch (h) {
		case SNAPSHOT:
			t.getTyInfo().setSnapshot(value);
			break;
		case DATE:					
			long d;	
			//d = DateTimeUtils.getInstance().dateStringFromTyphoonToLong(value);						
			
			break;
		case TYPOLOGY:
			t.getTyInfo().setTypology(Typology.valueOf(value.toUpperCase()));
			break;
		case INSTRUMENT:
			t.getTyInfo().setInstrumentName(value);
			break;
		case USER:
			t.getTyAudit().setUser(value);
			break;
		case TIMESTAMP:
			Date d2;			
			//d2 = DateManagement.getInstance().dateFromOfficialStringTimeStamp(value);
			System.out.println("prueba");
						
			break;		
		case BBG_TICKER:
			t.getTyInfo().setBbgTicker(value);
			break;
		default:
			break;
		}
	}

	private String[] getHeaderStrings() {
		List<Header> hs = getHeaders();
		String[] result = new String[hs.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = hs.get(i).toString();
		}
		return result;
	}

	private T getVO(Header[] headers, DataItemDTO item) {
		T t = createInstance();
		for (int i = 0; i < headers.length; i++) {
			String value = item.getMetadata()[i];
			if (value != null) {
				setValue(headers[i], t, value);
				setMatrixValues(t, item.getDataMatrix());
			}
		}
                if(t.getTyInfo().getInstrumentName() == null || t.getTyInfo().getInstrumentName().isEmpty()){
                    t.getTyInfo().setInstrumentName(t.generateInstrumentName());
                }
		return t;
	}

	private DataItemDTO getDataItem(T t) {
		DataItemDTO result = new DataItemDTO();
		result.setMetadata(getMetaData(t));
		result.setDataMatrix(getMatrixValues());
		return result;
	}

	private Header[] parseHeaders(String[] headerStrings) {
		Header[] result = new Header[headerStrings.length];
		for (int i = 0; i < result.length; i++) {
			String s = headerStrings[i];
			result[i] = Header.valueOf(s.toUpperCase());
		}
		return result;
	}

	private String[] getMetaData(T t) {
		List<Header> hs = getHeaders();
		String[] metadata = new String[hs.size()];
		for (int i = 0; i < hs.size(); i++) {
			metadata[i] = (getValue(hs.get(i), t));
		}
		return metadata;
	}

	private AddinDTO transformData(Header[] headers, AddinDTO dto) {
		AddinDTO auxDto = dto;
		List<DataItemDTO> data = auxDto.getData();
		for (DataItemDTO item : data) {
			transformDataItem(headers, item);
		}
		return auxDto;
	}

	private void transformDataItem(Header[] headers, DataItemDTO item) {
		DataItemDTO itemAux = item;
		for (int i = 0; i < headers.length; i++) {
			String value = item.getMetadata()[i];
			if (value != null) {
				String auxValue = dataConversion(headers[i], value);
				itemAux.getMetadata()[i] = auxValue;
			}
		}
	}

	private String dataConversion(Header header, String value) {
		String auxValue = null;
		try {
			switch (header.getType()) {
			case "DateTime":
				//Date javaDate = DateTimeUtils.getInstance().convertExcelToDate(Double.valueOf(value));
				//auxValue = new SimpleDateFormat("yyyy-MM-dd").format(javaDate);
				break;
			case "TimeStamp":
				//Date javaDateStamp = DateTimeUtils.getInstance().convertExcelToDate(Double.valueOf(value));
				//auxValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(javaDateStamp);
				break;
			default:
				auxValue = value;
				break;
			}
		} catch (Exception e) {
			auxValue = value;
		}
		return auxValue;
	}
	
}
