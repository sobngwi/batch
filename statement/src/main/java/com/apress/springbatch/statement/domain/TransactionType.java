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
		this.value = value;
	}
	/**
	 * @param int1
	 * @return
	 */
	public static TransactionType fromIntValue(int int1) {
		System.err.println("OHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		return STOCK;
	}

}
