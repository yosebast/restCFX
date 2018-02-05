package org.okis.addin.model.md.curve;

import org.okis.addin.model.md.TyphoonAuditory;
import org.okis.addin.model.md.TyphoonCompatible;
import org.okis.addin.model.md.typology.TyphoonInfo;
import org.okis.enums.Category;
import org.okis.enums.Typology;

/**
 *
 * @author Accenture
 */
public class FxSpot implements TyphoonCompatible, Comparable<FxSpot> {

	private TyphoonInfo tyInfo;
	private TyphoonAuditory tyAudit;
	
	private final Category category;

	/*
	 * INIT ATTRIBUTES TO SEND MUREX
	 */
	// INSTRUMENT
	private String pair;

	// DATA
	private Double ask;
	private Double bid;
	private Double formFactor;
	private Double high;
	private Double low;
	private Double mid;
	private String quotation;

	/*
	 * END OF ATTRIBUTES TO SEND MUREX
	 */
	public FxSpot() {
		this.category = Category.FX_SPOT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bbva.kyuw.common.model.md.TyphoonCompatible#getCategory()
	 */
	@Override
	public Category getCategory() {
		return category;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bbva.kyuw.common.model.md.TyphoonCompatible#getTyAudit()
	 */
	@Override
	public TyphoonAuditory getTyAudit() {
		return tyAudit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.common.model.md.TyphoonCompatible#setTyAudit(com.bbva.kyuw.
	 * common.model.md.TyphoonAuditory)
	 */
	@Override
	public void setTyAudit(TyphoonAuditory tyAudit) {
		this.tyAudit = tyAudit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bbva.kyuw.common.model.md.TyphoonCompatible#getTyInfo()
	 */
	@Override
	public TyphoonInfo getTyInfo() {
		return tyInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.common.model.md.TyphoonCompatible#setTyInfo(com.bbva.kyuw.
	 * common.model.md.TyphoonInfo)
	 */
	@Override
	public void setTyInfo(TyphoonInfo tyInfo) {
		this.tyInfo = tyInfo;
		this.tyInfo.setTypology(Typology.IR);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bbva.kyuw.common.model.md.AssetControlCompatible#getAcInfo()
	 */
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.common.model.md.AssetControlCompatible#setAcInfo(com.bbva.
	 * kyuw. common.model.md.AssetControlInfo)
	 */
	

	public String getPair() {
		return pair;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public Double getAsk() {
		return ask;
	}

	public void setAsk(Double ask) {
		this.ask = ask;
	}

	public Double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public Double getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(Double formFactor) {
		this.formFactor = formFactor;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getMid() {
		return mid;
	}

	public void setMid(Double mid) {
		this.mid = mid;
	}

	public String getQuotation() {
		return quotation;
	}

	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(FxSpot o) {
		int result = 0;

		if (this.pair != null && o.pair == null) {
			return 1;
		}
		if (this.pair == null && o.pair != null) {
			return -1;
		}
		if (this.pair != null && o.pair != null) {
			result = this.pair.compareTo(o.pair);
			if (result != 0) {
				return result;
			}
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	
		result = prime * result + ((ask == null) ? 0 : ask.hashCode());
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((formFactor == null) ? 0 : formFactor.hashCode());
		result = prime * result + ((high == null) ? 0 : high.hashCode());
		result = prime * result + ((low == null) ? 0 : low.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + ((pair == null) ? 0 : pair.hashCode());
		result = prime * result + ((quotation == null) ? 0 : quotation.hashCode());
		result = prime * result + ((tyAudit == null) ? 0 : tyAudit.hashCode());
		result = prime * result + ((tyInfo == null) ? 0 : tyInfo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FxSpot other = (FxSpot) obj;
		
		if (ask == null) {
			if (other.ask != null)
				return false;
		} else if (!ask.equals(other.ask))
			return false;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (category != other.category)
			return false;
		if (formFactor == null) {
			if (other.formFactor != null)
				return false;
		} else if (!formFactor.equals(other.formFactor))
			return false;
		if (high == null) {
			if (other.high != null)
				return false;
		} else if (!high.equals(other.high))
			return false;
		if (low == null) {
			if (other.low != null)
				return false;
		} else if (!low.equals(other.low))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		if (pair == null) {
			if (other.pair != null)
				return false;
		} else if (!pair.equals(other.pair))
			return false;
		if (quotation == null) {
			if (other.quotation != null)
				return false;
		} else if (!quotation.equals(other.quotation))
			return false;
		if (tyAudit == null) {
			if (other.tyAudit != null)
				return false;
		} else if (!tyAudit.equals(other.tyAudit))
			return false;
		if (tyInfo == null) {
			if (other.tyInfo != null)
				return false;
		} else if (!tyInfo.equals(other.tyInfo))
			return false;
		return true;
	}

	public FxSpot merge(FxSpot obj) {
		if (obj == null) {
			return this;
		}
		FxSpot result = new FxSpot();

		result.tyInfo = this.tyInfo == null ? obj.tyInfo : this.tyInfo.merge(obj.tyInfo);
		result.tyAudit = this.tyAudit == null ? obj.tyAudit : this.tyAudit.merge(obj.tyAudit);
	

		result.pair = this.pair == null ? obj.pair : this.pair;
		result.quotation = this.quotation == null ? obj.quotation : this.quotation;
		result.ask = this.ask == null ? obj.ask : this.ask;
		result.bid = this.bid == null ? obj.bid : this.bid;
		result.formFactor = this.formFactor == null ? obj.formFactor : this.formFactor;
		result.high = this.high == null ? obj.high : this.high;
		result.low = this.low == null ? obj.low : this.low;
		result.mid = this.mid == null ? obj.mid : this.mid;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.common.model.md.TyphoonCompatible#generateInstrumentName()
	 */
	@Override
	public String generateInstrumentName() {
		String instrumentName;
		if (this.tyInfo.getInstrumentName() == null && hasAllMandatoryFields()) {
			instrumentName = this.pair;
			tyInfo.setInstrumentName(instrumentName.toUpperCase());
		}
		return tyInfo.getInstrumentName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bbva.kyuw.common.model.md.TyphoonCompatible#hasAllMandatoryFields()
	 */
	@Override
	public boolean hasAllMandatoryFields() {
		return this.pair != null;
	}
}
