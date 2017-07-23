package org.vvs.projects.trading.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tradeId;
	@ManyToOne
	@JoinColumn(name="order_id")
	private TradeOrder order;
	private Date executionTime;
	private double totalValue;
	
	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public TradeOrder getOrder() {
		return order;
	}
	public void setOrder(TradeOrder order) {
		this.order = order;
	}
	public Date getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
}
