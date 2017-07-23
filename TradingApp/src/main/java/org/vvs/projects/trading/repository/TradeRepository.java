package org.vvs.projects.trading.repository;

import org.springframework.data.repository.CrudRepository;
import org.vvs.projects.trading.domain.Trade;

public interface TradeRepository extends CrudRepository<Trade, Integer> {

}
