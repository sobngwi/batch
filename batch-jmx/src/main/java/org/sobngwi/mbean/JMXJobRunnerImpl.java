package org.sobngwi.mbean;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;




@Component
@ManagedResource
public class JMXJobRunnerImpl implements  JMXJobRunner{

	@Autowired
	private JobOperator operator;

	@ManagedOperation
	public void runJob(String name) throws NoSuchJobException,
			JobInstanceAlreadyExistsException, JobParametersInvalidException {
		try {
			System.out.println("[ASO] .........Job STARTING name ===" + name );
			operator.start(name, null);
			System.out.println("[ASO] .........Job STARTED ");
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	public JobOperator getOperator() {
		return operator;
	}

	public void setOperator(JobOperator operator) {
		this.operator = operator;
	}
}
