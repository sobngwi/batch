/**
 * 
 */
package com.apress.springbatch.statement.domain;

import java.math.BigDecimal;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Ticker {

			private long id ;
			private BigDecimal price;
			private String ticker;
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
			 * @return the price
			 */
			public BigDecimal getPrice() {
				return price;
			}
			/**
			 * @param price the price to set
			 */
			public void setPrice(BigDecimal price) {
				this.price = price;
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
			
			
}
