package me.alexpower.ledger.model;

import java.time.LocalDate;

public interface HoldingKey {

  Account getAccount();
  Instrument getInstrument();
  LocalDate getEffectiveDate();


}
