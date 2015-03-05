/**
 * 
 */
package com.apress.springbatch.statement.reader;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.apress.springbatch.statement.domain.Account;
import com.apress.springbatch.statement.domain.Address;
import com.apress.springbatch.statement.domain.Customer;

public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {
	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionFieldSetMapper.class);
   
	public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
        Customer customer = new Customer();
        customer.setFirstName(fieldSet.readString("firstName"));
        customer.setLastName(fieldSet.readString("lastName"));
        customer.setTaxId(fieldSet.readString("taxId"));
        customer.setAddress(buildAddress(fieldSet));
        customer.setAccount(buildAccount(fieldSet, customer));  
        LOGGER.info("[CustomerFieldSetMapper] Going to return customer =====" + customer );
        return customer;
        
    }
    
    private Account buildAccount(FieldSet fieldSet, Customer cust) {
        Account account = new Account();
        account.setAccountNumber(fieldSet.readString("accountNumber"));
        account.setCust(cust);
        return account;
    }
    
    private Address buildAddress(FieldSet fieldSet) {
        Address address = new Address();
        address.setAddress1(fieldSet.readString("address"));
        address.setCity(fieldSet.readString("city"));
        address.setState(fieldSet.readString("state"));
        address.setZip(fieldSet.readString("zip"));
        return address;
    }
}
