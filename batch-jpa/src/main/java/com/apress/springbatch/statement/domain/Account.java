/**
 * 
 */
package com.apress.springbatch.statement.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
@Entity
@Table(name = "account")
public class Account {
	
	private long id = -1;
    private String accountNumber;
    private BigDecimal cashBalance;
    private PricingTier tier;
    private long custId;
    
    private List<Transaction> transactions = new ArrayList<Transaction>();
    private Customer cust ;

    @Id
    @GeneratedValue(strategy =  IDENTITY)
    @Column(name = "account_id")
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}

	@Column(name = "accountnumber")
	public String getAccountNumber() {
		return accountNumber;}
	public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
		
	@Column(name = "cashBalance")
	public BigDecimal getCashBalance() {return cashBalance;}
	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}

	@Column(name = "customer_id")
	public long getCustId() {return custId;}
	public void setCustId(long custId) {this.custId = custId;}

	@Column(name = "tier")
	public PricingTier getTier() {return tier;}
	public void setTier(PricingTier tier) {this.tier = tier;}

	@OneToMany(mappedBy = "account", cascade=CascadeType.ALL, orphanRemoval=true)
	public List<Transaction> getTransactions() {return transactions;}
	public void setTransactions(List<Transaction> transactions) {this.transactions = transactions;}
	 
	public void addTransaction(Transaction transaction) {
		    transaction.setAccount(this);
	        getTransactions().add(transaction);
	    }
    public void removeTransaction(Transaction transaction) {
	    	getTransactions().remove(transaction);}
   // @OneToOne
    @OneToOne(fetch=FetchType.LAZY)
    @JoinTable(
        name="account",
        joinColumns=
          @JoinColumn(name="account_id", referencedColumnName="account_id"),
        inverseJoinColumns=
          @JoinColumn(name="customer_id", referencedColumnName="customer_id"))
	public Customer getCust() {return cust;}
	public void setCust(Customer cust) {this.cust = cust;}

}
