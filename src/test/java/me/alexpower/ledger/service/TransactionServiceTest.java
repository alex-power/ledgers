package me.alexpower.ledger.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import me.alexpower.ledger.model.Account;
import me.alexpower.ledger.model.IdentifierDomain;
import me.alexpower.ledger.model.Instrument;
import me.alexpower.ledger.model.Transaction;
import me.alexpower.ledger.model.impl.AccountImpl;
import me.alexpower.ledger.model.impl.Cash;
import me.alexpower.ledger.model.impl.IdentifierImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {

  @Autowired
  private TransactionService transactionService;

  @Test
  public void testCreateTransaction() {
    Account payer = new AccountImpl(new IdentifierImpl("Payer", 1, IdentifierDomain.ACCOUNT),new ArrayList<>());
    Account recipient = new AccountImpl(new IdentifierImpl("Payer", 1, IdentifierDomain.ACCOUNT),new ArrayList<>());
    Instrument instrument = new Cash(new IdentifierImpl("USD", 1, IdentifierDomain.CCY), "USD");
    Transaction transaction = transactionService
        .createTransaction(payer, recipient, instrument, BigDecimal.TEN);
    assertEquals(BigDecimal.TEN, transaction.getQuantity()));

  }

}
