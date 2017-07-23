package org.vvs.projects.trading.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vvs.projects.trading.domain.TradeOrder;
import org.vvs.projects.trading.service.OrderExecutionService;

@RestController
public class TradeOrderController {
	
	@Autowired
	private OrderExecutionService orderExecutionService;
	
	@RequestMapping(value="/rest/neworder",method=RequestMethod.POST)
	public void executeOrder(@RequestBody TradeOrder order) {
		orderExecutionService.executeOrder(order);
	}
}
