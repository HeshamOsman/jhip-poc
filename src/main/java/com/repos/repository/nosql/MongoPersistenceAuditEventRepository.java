package com.repos.repository.nosql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.repos.domain.PersistentAuditEvent;
//import com.repos.domain.nosql.MongoPersistentAuditEvent;
import com.repos.repository.PersistenceAuditEventRepository;

import java.time.Instant;
import java.util.List;

/**
 * Spring Data MongoDB repository for the {@link MongoPersistentAuditEvent} entity.
 */
@Profile("mongo")
public interface MongoPersistenceAuditEventRepository extends MongoRepository<PersistentAuditEvent, String>,PersistenceAuditEventRepository {

    List<PersistentAuditEvent> findByPrincipal(String principal);

    List<PersistentAuditEvent> findByAuditEventDateAfter(Instant after);

    List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(String principal, Instant after);

    List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfterAndAuditEventType(String principal, Instant after, String type);

    Page<PersistentAuditEvent> findAllByAuditEventDateBetween(Instant fromDate, Instant toDate, Pageable pageable);
}
