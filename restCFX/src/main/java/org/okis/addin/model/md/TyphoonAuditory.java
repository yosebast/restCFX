/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.okis.addin.model.md;

import java.util.Objects;

/**
 *
 * @author E020682
 */
public class TyphoonAuditory {

    private String user;
    private Long timestamp;

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getUser() {
        return user;
    }

    public TyphoonAuditory merge(TyphoonAuditory obj) {
		if(obj == null){
			return this;
		}
        TyphoonAuditory result = new TyphoonAuditory();
        result.user = this.user == null ? obj.user : this.user;
        result.timestamp = this.timestamp == null ? obj.timestamp : this.timestamp;
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.user);
        hash = 29 * hash + Objects.hashCode(this.timestamp);
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
        final TyphoonAuditory other = (TyphoonAuditory) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.timestamp, other.timestamp)) {
            return false;
        }
        return true;
    }

    
    
}
