/**
 * 
 */
package com.apress.springbatch.statement.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Account {
	
	private long id = -1;
    private String accountNumber;
    private Customer cust;
    private BigDecimal cashBalance;
    PricingTier tier ;
    private List<Transaction> transactions;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the cust
	 */
	public Customer getCust() {
		return cust;
	}
	/**
	 * @param cust the cust to set
	 */
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	/**
	 * @return the cashBalance
	 */
	public BigDecimal getCashBalance() {
		return cashBalance;
	}
	/**
	 * @param cashBalance the cashBalance to set
	 */
	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}
	
	/**
	 * @return the transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	/**
	 * @return the tiers
	 */
	public PricingTier getTier() {
		return tier;
	}
	/**
	 * @param tiers the tiers to set
	 */
	public void setTier(PricingTier tier) {
		this.tier = tier;
	}
    
    

}
