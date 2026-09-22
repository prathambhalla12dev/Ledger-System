package dev.pratham.banking_ledger.account.application.query;

import java.util.UUID;

public record GetAccountBalanceQuery(
        UUID accountId
) {
}
