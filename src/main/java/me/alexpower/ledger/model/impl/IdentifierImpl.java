package me.alexpower.ledger.model.impl;

import lombok.Value;
import me.alexpower.ledger.model.Identifier;
import me.alexpower.ledger.model.IdentifierDomain;

@Value
public class IdentifierImpl implements Identifier {

  private final String value;
  private final int version;
  private final IdentifierDomain identifierDomain;

}
