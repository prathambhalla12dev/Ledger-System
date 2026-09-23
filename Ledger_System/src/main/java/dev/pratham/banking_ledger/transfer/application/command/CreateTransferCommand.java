package dev.pratham.banking_ledger.transfer.application.command;

import dev.pratham.banking_ledger.audit.domain.model.AuditActorRole;
import dev.pratham.banking_ledger.shared.money.CurrencyCode;
import dev.pratham.banking_ledger.transfer.domain.model.RequestedByActorType;

import java.util.UUID;

public record CreateTransferCommand(
        UUID sourceAccountId,
        UUID destinationAccountId,
        CurrencyCode currencyCode,
        long amountMinor,
        String externalReference,
        String description,
        String idempotencyKey,
        RequestedByActorType actorType,
        AuditActorRole actorRole,
        String actorId,
        String correlationId
) {
    public CreateTransferCommand(
            UUID sourceAccountId,
            UUID destinationAccountId,
            CurrencyCode currencyCode,
            long amountMinor,
            String externalReference,
            String description,
            String idempotencyKey,
            RequestedByActorType actorType,
            String correlationId
    ) {
        this(sourceAccountId, destinationAccountId, currencyCode, amountMinor, externalReference, description,
                idempotencyKey, actorType, null, null, correlationId);
    }
}
