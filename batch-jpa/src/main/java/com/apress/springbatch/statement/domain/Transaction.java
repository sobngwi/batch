/**
 * 
 */
package com.apress.springbatch.statement.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
@Entity
@Table(name = "transaction")
public class Transaction {
	
	    private long id;
	    private int transactionType ;
	    private long quantity;
	    private Date tradeTimestamp;
	    private Date executedTime;
	    private String fee ;
	    private BigDecimal dollarAmount;
	    
	    private long tickerId;
	    private long accountId ;
	    private String accountNumber;
	    private Ticker ticker ;
	    private Account account;
	    
	    @Transient
	    private TransactionType type ;
		public TransactionType getType() {return type;}
		public void setType(TransactionType type) {this.type = type;}
		
		public long getTickerId() {return tickerId;}
		public void setTickerId(long tickerId) {this.tickerId = tickerId;}
		
		public long getAccountId() {return accountId;}
		public void setAccountId(long accountId) {this.accountId = accountId;}

		public String getAccountNumber() {return accountNumber;}
		public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
		
		
	    

	    @Id
	    @GeneratedValue(strategy =  IDENTITY)
	    @Column(name = "transaction_id")
		public long getId() {return id;}
		public void setId(long id) {this.id = id;}
		
		@Column(name = "transactiontype")
		public int getTransactionType() {return transactionType;}
		public void setTransactionType(int transactionType) {this.transactionType = transactionType;}
		
		@Temporal(javax.persistence.TemporalType.TIMESTAMP)
		@Column(name = "executedtime")
		public Date getExecutedTime() {return executedTime;}
		public void setExecutedTime(Date executedTime) {this.executedTime = executedTime;}
	
		@Column(name = "dollaramount")
		public BigDecimal getDollarAmount() {return dollarAmount;}
		public void setDollarAmount(BigDecimal dollarAmount) {this.dollarAmount = dollarAmount;}
		
		@Column(name = "quantity")
		public long getQuantity() {return quantity;}
		public void setQuantity(long quantity) {this.quantity = quantity;}
		
		public String getFee() {return fee;}
		public void setFee(String fee) {this.fee = fee;}
		
		@Temporal(javax.persistence.TemporalType.TIMESTAMP)
		@Column(name = "tradetimestamp")
		public Date getTradeTimestamp() {return tradeTimestamp;}
		public void setTradeTimestamp(Date tradeTimestamp) {this.tradeTimestamp = tradeTimestamp;}
		

		@ManyToOne
	    @JoinColumn(name = "account_id")
		public Account getAccount() {return account;}
		public void setAccount(Account account) {this.account = account;}
		
		@ManyToOne
	    @JoinColumn(name = "ticker_id")
		public Ticker getTicker() {return ticker;}
		public void setTicker(Ticker ticker) {this.ticker = ticker;}
		
		 @Override
		    public String toString() {
		        return "Sold " + quantity + " of " + ticker;
		    }

}
