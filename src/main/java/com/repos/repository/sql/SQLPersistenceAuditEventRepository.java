package com.repos.repository.sql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.repos.domain.sql.SQLPersistentAuditEvent;

import java.time.Instant;
import java.util.List;

/**
 * Spring Data JPA repository for the {@link SQLPersistentAuditEvent} entity.
 */
public interface SQLPersistenceAuditEventRepository extends JpaRepository<SQLPersistentAuditEvent, Long> {

    List<SQLPersistentAuditEvent> findByPrincipal(String principal);

    List<SQLPersistentAuditEvent> findByAuditEventDateAfter(Instant after);

    List<SQLPersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(String principal, Instant after);

    List<SQLPersistentAuditEvent> findByPrincipalAndAuditEventDateAfterAndAuditEventType(String principal, Instant after, String type);

    Page<SQLPersistentAuditEvent> findAllByAuditEventDateBetween(Instant fromDate, Instant toDate, Pageable pageable);
}
