package me.alexpower.ledger.model;

import java.util.Collection;

public interface Account extends UniquelyIdentified {

  Collection<Holding> getHoldings();

}
