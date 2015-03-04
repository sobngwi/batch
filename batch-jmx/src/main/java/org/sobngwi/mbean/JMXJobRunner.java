package org.sobngwi.mbean;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

public interface JMXJobRunner {

	public void runJob(String jobName) throws NoSuchJobException,
	JobInstanceAlreadyExistsException, JobParametersInvalidException;
}
