package dev.pratham.banking_ledger.ledger.domain.factory;

import dev.pratham.banking_ledger.ledger.domain.model.JournalEntry;
import dev.pratham.banking_ledger.ledger.domain.model.LedgerTransaction;

public record PostedLedgerGraph(
        LedgerTransaction ledgerTransaction,
        JournalEntry journalEntry
) {
}
