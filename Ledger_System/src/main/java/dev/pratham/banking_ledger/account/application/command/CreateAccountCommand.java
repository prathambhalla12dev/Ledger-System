package dev.pratham.banking_ledger.account.application.command;

import dev.pratham.banking_ledger.account.domain.model.AccountType;
import dev.pratham.banking_ledger.audit.domain.model.AuditActorRole;
import dev.pratham.banking_ledger.shared.money.CurrencyCode;

import java.util.UUID;

public record CreateAccountCommand(
        UUID customerId,
        String accountNumber,
        AccountType accountType,
        CurrencyCode currencyCode,
        String actorType,
        AuditActorRole actorRole,
        String actorId,
        String correlationId
) {
    public CreateAccountCommand(
            UUID customerId,
            String accountNumber,
            AccountType accountType,
            CurrencyCode currencyCode,
            String actorType,
            String correlationId
    ) {
        this(customerId, accountNumber, accountType, currencyCode, actorType, null, null, correlationId);
    }
}
