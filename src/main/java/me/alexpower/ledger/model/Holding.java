package me.alexpower.ledger.model;

import java.math.BigDecimal;
import java.util.Collection;

public interface Holding extends UniquelyIdentified {

  HoldingKey getHoldingKey();

  BigDecimal getQuantity();

  Collection<Transaction> getTransactions();

}
