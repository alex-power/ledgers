package me.alexpower.ledger.model;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum InstrumentType {
  CASH((price, qty) -> qty),
  SECURITY(BigDecimal::multiply),
  OTHER(BigDecimal::multiply);

  private final BiFunction<BigDecimal, BigDecimal, BigDecimal> valuationFunction;
}
