package org.vvs.projects.trading.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FinancialInstrument {
	
	@Id
	private String instrumentId;
	private String companyName;
	private String symbolId;
	private double price;
	
	public String getInstrumentIdId() {
		return instrumentId;
	}
	public void setInstrumentIdId(String instrumentId) {
		this.instrumentId = instrumentId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSymbolId() {
		return symbolId;
	}
	public void setSymbolId(String symbolId) {
		this.symbolId = symbolId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
