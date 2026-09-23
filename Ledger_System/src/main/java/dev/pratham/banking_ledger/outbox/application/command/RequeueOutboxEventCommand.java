package dev.pratham.banking_ledger.outbox.application.command;

import dev.pratham.banking_ledger.audit.domain.model.AuditActorRole;
import dev.pratham.banking_ledger.audit.domain.model.AuditActorType;

import java.util.UUID;

public record RequeueOutboxEventCommand(
        UUID eventId,
        boolean force,
        boolean resetRetryCount,
        AuditActorType actorType,
        AuditActorRole actorRole,
        String actorId,
        String correlationId
) {
}
