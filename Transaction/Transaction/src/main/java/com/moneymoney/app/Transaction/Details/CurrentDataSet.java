package com.moneymoney.app.Transaction.Details;

import java.util.List;

import org.springframework.hateoas.Link;

public class CurrentDataSet {
	private List<Transaction> transactions;
	private Link nextLink;
	private Link previousLink;
	public CurrentDataSet() {
		super();
	}
	public CurrentDataSet(List<Transaction> transactions, Link nextLink, Link previousLink) {
		super();
		this.transactions = transactions;
		this.nextLink = nextLink;
		this.previousLink = previousLink;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public Link getNextLink() {
		return nextLink;
	}
	public void setNextLink(Link nextLink) {
		this.nextLink = nextLink;
	}
	public Link getPreviousLink() {
		return previousLink;
	}
	public void setPreviousLink(Link previousLink) {
		this.previousLink = previousLink;
	}
	@Override
	public String toString() {
		return "CurrentDataSet [transactions=" + transactions + ", nextLink=" + nextLink + ", previousLink="
				+ previousLink + "]";
	}
	
	
}
