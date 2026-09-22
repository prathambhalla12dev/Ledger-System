package dev.pratham.banking_ledger.account.api.dto;



import dev.pratham.banking_ledger.ledger.domain.model.PostingDirection;

import java.time.OffsetDateTime;

import java.util.UUID;

public record AccountTransactionSummaryResponse(
        UUID postingId,
        UUID ledgerTransactionId,
        PostingDirection direction,
        long amountMinor,
        String currencyCode,
        String description,
        OffsetDateTime postedAt
) {

}
