/**
 * 
 */
package com.apress.springbatch.statement.dao;

import com.apress.springbatch.statement.domain.Ticker;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public interface TickerDao {
	Ticker findTickerBySymbol(String symbol) ;
	public void saveTicker(Ticker ticker) ;

}
