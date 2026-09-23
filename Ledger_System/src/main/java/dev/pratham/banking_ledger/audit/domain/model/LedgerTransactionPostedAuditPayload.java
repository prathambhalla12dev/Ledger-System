package dev.pratham.banking_ledger.audit.domain.model;

import java.util.UUID;

public record LedgerTransactionPostedAuditPayload(
        UUID transactionId,
        String externalReference
) {
}
