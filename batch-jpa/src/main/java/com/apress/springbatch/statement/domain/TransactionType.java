/**
 * 
 */
package com.apress.springbatch.statement.domain;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public enum TransactionType {
	
	STOCK(0), CURRENT(1) ;

	private int value;

	TransactionType(int value) {
		this.setValue(value);
	}
	/**
	 * @param int1
	 * @return
	 */
	public static TransactionType fromIntValue(int int1) {
		// always return the stock.
		return STOCK;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
