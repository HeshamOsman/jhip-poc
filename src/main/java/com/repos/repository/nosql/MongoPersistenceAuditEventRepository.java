package com.repos.repository.nosql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.repos.domain.nosql.MongoPersistentAuditEvent;

import java.time.Instant;
import java.util.List;

/**
 * Spring Data MongoDB repository for the {@link MongoPersistentAuditEvent} entity.
 */
@Profile("mongo")
public interface MongoPersistenceAuditEventRepository extends MongoRepository<MongoPersistentAuditEvent, String> {

    List<MongoPersistentAuditEvent> findByPrincipal(String principal);

    List<MongoPersistentAuditEvent> findByAuditEventDateAfter(Instant after);

    List<MongoPersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(String principal, Instant after);

    List<MongoPersistentAuditEvent> findByPrincipalAndAuditEventDateAfterAndAuditEventType(String principal, Instant after, String type);

    Page<MongoPersistentAuditEvent> findAllByAuditEventDateBetween(Instant fromDate, Instant toDate, Pageable pageable);
}
