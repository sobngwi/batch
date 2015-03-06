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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
@Entity
@Table(name = "ticker")
public class Ticker {

			private long id ;
			private BigDecimal price;
			private String tc;

			private List<Transaction> transactions = new ArrayList<Transaction>();

			@Id
		    @GeneratedValue(strategy =  IDENTITY)
		    @Column(name = "ticker_id")
			public long getId() {return id;}
			
			public void setId(long id) {this.id = id;}
			
			@Column(name = "currentprice")
			public BigDecimal getPrice() {return price;}
			public void setPrice(BigDecimal price) {this.price = price;}
			
			@Column(name = "tc")
			public String getTc() {return tc;}	
			public void setTc(String tc) {this.tc = tc;}
		
			@OneToMany(mappedBy = "ticker", cascade=CascadeType.ALL, orphanRemoval=true)
			public List<Transaction> getTransactions() {return transactions;}
			public void setTransactions(List<Transaction> transactions) {this.transactions = transactions;}
			 
			public void addTransaction(Transaction transaction) {
				    transaction.setTicker(this);
			        getTransactions().add(transaction);
			    }
		    public void removeTransaction(Transaction transaction) {
			    	getTransactions().remove(transaction);}
			
}
