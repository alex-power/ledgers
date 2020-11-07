package me.alexpower.ledger;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public interface Transaction {

  Account getPayor();

  Account getPayee();
}
