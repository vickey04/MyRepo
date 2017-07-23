package org.vvs.projects.trading.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class TradeOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@NotEmpty
	private String symbolId;
	@NotNull
	private int quantity;
	@NotNull
	private double price;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private Set<Trade> trades;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Account getAccount() {
		return this.account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getSymbolId() {
		return symbolId;
	}
	public void setSymbolId(String symbolId) {
		this.symbolId = symbolId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Set<Trade> getTrades() {
		return trades;
	}
	public void setTrades(Set<Trade> trades) {
		this.trades = trades;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
