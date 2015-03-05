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

import com.apress.springbatch.statement.domain.Transaction;

	

public class TransactionFieldSetMapper implements FieldSetMapper<Transaction> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionFieldSetMapper.class);
	
	public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {
		Transaction trans = new Transaction();
		trans.setAccountNumber(fieldSet.readString("accountNumber"));
		trans.setQuantity(fieldSet.readLong("quantity"));
		trans.setTicker(fieldSet.readString("stockTicker"));
		trans.setTradeTimestamp(fieldSet.readDate("timestamp",
				"yyyy-MM-dd HH:mm:ss"));
		trans.setDollarAmount(fieldSet.readBigDecimal("price"));
		LOGGER.info ("Going to return the transaction =====[" + trans + "]" );
		return trans;
	}
}