package me.alexpower.ledger.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface Transaction extends UniquelyIdentified {

  Account getPayer();

  Account getRecipient();

  Instrument getInstrument();

  BigDecimal getQuantity();

  ZonedDateTime getExecutionTime();

  ZonedDateTime getBookingTime();

  ZonedDateTime getEffectiveDate();

  boolean isBooked();

  boolean isExecuted();


}
