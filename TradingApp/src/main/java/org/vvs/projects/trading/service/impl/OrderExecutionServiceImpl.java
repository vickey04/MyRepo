package org.vvs.projects.trading.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vvs.projects.trading.domain.TradeOrder;
import org.vvs.projects.trading.repository.TradeOrderRepository;
import org.vvs.projects.trading.service.OrderExecutionService;

@Service
public class OrderExecutionServiceImpl implements OrderExecutionService {

	@Autowired
	private TradeOrderRepository orderRepository;
	//@Autowired
	//private TradeRepository tradeRepository;

	@Override
	public void executeOrder(TradeOrder order) {
		orderRepository.save(order);
	}

}
