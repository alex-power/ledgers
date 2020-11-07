package me.alexpower.ledger;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public interface Holding {

  BigDecimal getQuantity();

  Collection<Transaction> getTransactions();

}
