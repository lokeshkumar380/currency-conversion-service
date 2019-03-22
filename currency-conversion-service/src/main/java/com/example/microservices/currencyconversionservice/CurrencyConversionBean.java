package com.example.microservices.currencyconversionservice;

import java.math.BigInteger;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
	private BigInteger conversionMultiple ;
	private BigInteger quantity;
	private BigInteger totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversionBean(Long id, String from, String to, BigInteger conversionMultiple, BigInteger quantity,
			BigInteger totalCalculatedAmount, int port) {
	
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	public CurrencyConversionBean(Long id, String from, String to, BigInteger conversionMultiple, BigInteger quantity,
			BigInteger totalCalculatedAmount) {
	
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		
		  this.quantity = quantity; 
	     this.totalCalculatedAmount = totalCalculatedAmount;
		//  this.port = port;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigInteger getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigInteger conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigInteger getQuantity() {
		return quantity;
	}
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
	public BigInteger getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigInteger totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
