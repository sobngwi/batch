package org.sobngwi.springbatch.sampleJob;

import org.apache.commons.lang.StringUtils;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

public class ParameterValidator implements JobParametersValidator{
	
	public void validate(JobParameters params) throws JobParametersInvalidException {
		String name = params.getString("name");
		
		if(!StringUtils.isAlpha(name)) {
			//System.out.println("Nothing to throw !!!!!!!");
			throw new JobParametersInvalidException("Name is not alphabetic");
		}
	}
}