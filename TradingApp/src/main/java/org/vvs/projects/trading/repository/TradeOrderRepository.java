package org.vvs.projects.trading.repository;

import org.springframework.data.repository.CrudRepository;
import org.vvs.projects.trading.domain.TradeOrder;

public interface TradeOrderRepository extends CrudRepository<TradeOrder, Integer> {

}
