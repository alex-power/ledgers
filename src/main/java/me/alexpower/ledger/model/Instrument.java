package me.alexpower.ledger.model;

import java.math.BigDecimal;
import java.util.Optional;

public interface Instrument extends UniquelyIdentified {

  String getName();

  Optional<BigDecimal> getPrice();

  InstrumentType getInstrumentType();

}
