/**
 * 
 */
package com.apress.springbatch.statement.dao;

import com.apress.springbatch.statement.domain.Customer;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public interface CustomerDao {

	 Customer findCustomerByTaxId(String taxId) ;
}
