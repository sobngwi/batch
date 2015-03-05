/**
 * 
 */
package com.apress.springbatch.statement.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Transaction {
	
	    private long id;
	    private long accountId;
	    private String accountNumber;
	    private String ticker;
	    private long tickerId;
	    private long quantity;
	    private Date tradeTimestamp;
	    private BigDecimal dollarAmount;
	    TransactionType type ;
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
		 * @return the accountId
		 */
		public long getAccountId() {
			return accountId;
		}
		/**
		 * @param accountId the accountId to set
		 */
		public void setAccountId(long accountId) {
			this.accountId = accountId;
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
		 * @return the ticker
		 */
		public String getTicker() {
			return ticker;
		}
		/**
		 * @param ticker the ticker to set
		 */
		public void setTicker(String ticker) {
			this.ticker = ticker;
		}
		/**
		 * @return the tickerId
		 */
		public long getTickerId() {
			return tickerId;
		}
		/**
		 * @param tickerId the tickerId to set
		 */
		public void setTickerId(long tickerId) {
			this.tickerId = tickerId;
		}
		/**
		 * @return the quantity
		 */
		public long getQuantity() {
			return quantity;
		}
		/**
		 * @param quantity the quantity to set
		 */
		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}
		/**
		 * @return the tradeTimestamp
		 */
		public Date getTradeTimestamp() {
			return tradeTimestamp;
		}
		/**
		 * @param tradeTimestamp the tradeTimestamp to set
		 */
		public void setTradeTimestamp(Date tradeTimestamp) {
			this.tradeTimestamp = tradeTimestamp;
		}
		/**
		 * @return the dollarAmount
		 */
		public BigDecimal getDollarAmount() {
			return dollarAmount;
		}
		/**
		 * @param dollarAmount the dollarAmount to set
		 */
		public void setDollarAmount(BigDecimal dollarAmount) {
			this.dollarAmount = dollarAmount;
		}
		
	    
	
		@Override
		    public String toString() {
		        return "Sold " + quantity + " of " + ticker;
		    }
		/**
		 * @param fromIntValue
		 */
		public void setType(TransactionType type) {
			
			this.type = type ;
		}

}
