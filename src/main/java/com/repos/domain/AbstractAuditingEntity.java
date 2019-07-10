package com.repos.domain;

import java.time.Instant;

public interface AbstractAuditingEntity {
	 public String getCreatedBy();

	    public void setCreatedBy(String createdBy);

	    public Instant getCreatedDate();

	    public void setCreatedDate(Instant createdDate) ;

	    public String getLastModifiedBy();

	    public void setLastModifiedBy(String lastModifiedBy);
	    public Instant getLastModifiedDate() ;

	    public void setLastModifiedDate(Instant lastModifiedDate) ;
}
