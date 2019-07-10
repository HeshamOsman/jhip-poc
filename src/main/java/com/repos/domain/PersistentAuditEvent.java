package com.repos.domain;

import java.time.Instant;
import java.util.Map;

public interface PersistentAuditEvent {
	public String getId() ;

    public void setId(String id) ;

    public String getPrincipal();

    public void setPrincipal(String principal) ;

    public Instant getAuditEventDate() ;

    public void setAuditEventDate(Instant auditEventDate) ;

    public String getAuditEventType() ;

    public void setAuditEventType(String auditEventType) ;

    public Map<String, String> getData() ;

    public void setData(Map<String, String> data);
}
