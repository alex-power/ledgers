package me.alexpower.ledger.model.impl;

import java.math.BigDecimal;
import lombok.Value;
import me.alexpower.ledger.model.Identifier;
import me.alexpower.ledger.model.Instrument;
import me.alexpower.ledger.model.InstrumentType;

@Value
public class Cash implements Instrument {

  private final Identifier identifier;
  private final String name;
  private final BigDecimal price = BigDecimal.ONE;
  private final InstrumentType instrumentType = InstrumentType.CASH;

}
