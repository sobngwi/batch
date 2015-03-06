/**
 * 
 */
package com.apress.springbatch.statement.dao;

import com.apress.springbatch.statement.domain.Account;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public interface  AccountDao {
	Account findAccountByNumber(String accountNumber) ;
}
