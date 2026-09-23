package dev.pratham.banking_ledger.outbox.application.service;

import dev.pratham.banking_ledger.outbox.persistence.OutboxEventEntity;

public interface OutboxEventPublisher {
    void publish(OutboxEventEntity event);
}
