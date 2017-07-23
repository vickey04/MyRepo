package org.vvs.projects.trading.service;

import org.vvs.projects.trading.domain.TradeOrder;

public interface OrderExecutionService {	
	public void executeOrder(TradeOrder order);
}
