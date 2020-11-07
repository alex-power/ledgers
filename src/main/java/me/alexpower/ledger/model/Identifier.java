package me.alexpower.ledger.model;

public interface Identifier {

  String getValue();
  int getVersion();
  IdentifierDomain getIdentifierDomain();

}
