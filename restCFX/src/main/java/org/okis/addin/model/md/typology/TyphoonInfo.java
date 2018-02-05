/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.okis.addin.model.md.typology;
import java.util.Objects;

import org.okis.enums.Typology;

/**
 *
 * @author E020682
 */
public class TyphoonInfo {

    private String instrumentName;
    private Long date;
    private Typology typology;
    private String snapshot;
    private String bbgTicker;

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public Typology getTypology() {
        return typology;
    }

    public void setTypology(Typology typology) {
        this.typology = typology;
    }
    
    public String getBbgTicker() {
        return bbgTicker;
    }

    public void setBbgTicker(String bbgTicker) {
        this.bbgTicker = bbgTicker;
    }

    public TyphoonInfo merge(TyphoonInfo obj) {
		if(obj == null){
			return this;
		}
        TyphoonInfo result = new TyphoonInfo();
        result.instrumentName = this.instrumentName == null ? obj.instrumentName : this.instrumentName;
        result.typology = this.typology == null ? obj.typology : this.typology;
        result.snapshot = this.snapshot == null ? obj.snapshot : this.snapshot;
        result.date = this.date == null ? obj.date : this.date;
		result.bbgTicker = this.bbgTicker == null ? obj.bbgTicker : this.bbgTicker;
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.instrumentName);
        hash = 37 * hash + Objects.hashCode(this.date);
        hash = 37 * hash + Objects.hashCode(this.typology);
        hash = 37 * hash + Objects.hashCode(this.snapshot);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TyphoonInfo other = (TyphoonInfo) obj;
        if (!Objects.equals(this.instrumentName, other.instrumentName)) {
            return false;
        }
        if (!Objects.equals(this.snapshot, other.snapshot)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (this.typology != other.typology) {
            return false;
        }
        return true;
    }

   
}
