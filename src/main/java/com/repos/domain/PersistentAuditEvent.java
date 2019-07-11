package com.repos.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//import com.repos.domain.sql.SQLPersistentAuditEvent;

@Entity
@Table(name = "jhi_persistent_audit_event")
@Document(collection = "jhi_persistent_audit_event")
public class PersistentAuditEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@org.springframework.data.annotation.Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "uuid", columnDefinition = "CHAR(90)")
	private String uuid;

	@NotNull
	@Column(nullable = false)
	private String principal;

	@Field("event_date")
	@Column(name = "event_date")
	private Instant auditEventDate;

	@Column(name = "event_type")
	@Field("event_type")
	private String auditEventType;

	@ElementCollection
	@MapKeyColumn(name = "name")
	@Column(name = "value")
	@CollectionTable(name = "jhi_persistent_audit_evt_data", joinColumns = @JoinColumn(name = "event_uuid"))
	private Map<String, String> data = new HashMap<>();

//    public Long getId() {
//        return id;
//    }

//	public String getId() {
//		return id.toString();
//	}
//
//	public void setId(String id) {
//		this.id = Long.parseLong(id);
//	}

	
	
	public String getPrincipal() {
		return principal;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Instant getAuditEventDate() {
		return auditEventDate;
	}

	public void setAuditEventDate(Instant auditEventDate) {
		this.auditEventDate = auditEventDate;
	}

	public String getAuditEventType() {
		return auditEventType;
	}

	public void setAuditEventType(String auditEventType) {
		this.auditEventType = auditEventType;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PersistentAuditEvent)) {
			return false;
		}
		return uuid != null && uuid.equals(((PersistentAuditEvent) o).uuid);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "PersistentAuditEvent{" + "principal='" + principal + '\'' + ", auditEventDate=" + auditEventDate
				+ ", auditEventType='" + auditEventType + '\'' + '}';
	}
}
