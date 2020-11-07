package me.alexpower.ledger.service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import me.alexpower.ledger.model.Account;
import me.alexpower.ledger.model.Instrument;
import me.alexpower.ledger.model.Transaction;

public interface TransactionService {

  Transaction createTransaction(Account payer, Account recipient, Instrument instrument, BigDecimal quantity);

  Transaction createReversal(Transaction transaction);

  void book(Transaction transaction);

  void schedule(Transaction transaction, ZonedDateTime requestedExecutionTime);

}
