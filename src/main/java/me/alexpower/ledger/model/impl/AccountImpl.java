package me.alexpower.ledger.model.impl;

import java.util.Collection;
import lombok.Value;
import me.alexpower.ledger.model.Account;
import me.alexpower.ledger.model.Holding;
import me.alexpower.ledger.model.Identifier;

@Value
public class AccountImpl implements Account {

  private final Identifier identifier;
  private final Collection<Holding> holdings;

}
