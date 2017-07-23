package org.vvs.projects.trading.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
	
	@Id
	private String accountId;
	private double balance;
	private double equity;
	private double positions;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private Set<TradeOrder> orders;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getEquity() {
		return equity;
	}
	public void setEquity(double equity) {
		this.equity = equity;
	}
	public double getPositions() {
		return positions;
	}
	public void setPositions(double positions) {
		this.positions = positions;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<TradeOrder> getOrders() {
		return orders;
	}
	public void setOrders(Set<TradeOrder> orders) {
		this.orders = orders;
	}
	
	
}
