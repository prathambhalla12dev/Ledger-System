package dev.pratham.banking_ledger.outbox.application.command;

import dev.pratham.banking_ledger.outbox.domain.model.OutboxDestination;
import dev.pratham.banking_ledger.outbox.domain.model.OutboxEventType;

import java.util.UUID;

public record WriteOutboxEventCommand(
        String aggregateType,
        UUID aggregateId,
        OutboxEventType eventType,
        OutboxDestination destination,
        String correlationId,
        Object payload
) {
}