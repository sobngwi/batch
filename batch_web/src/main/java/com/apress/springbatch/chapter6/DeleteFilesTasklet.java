package com.apress.springbatch.chapter6;

import java.io.File;
import java.util.Date;
import java.util.Map;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class DeleteFilesTasklet implements Tasklet {

    public RepeatStatus execute(StepContribution step, ChunkContext chunk)
            throws Exception {
        Map<String, Object> params = chunk.getStepContext().getJobParameters();
        String path = (String) params.get("path");
        Long age = Long.valueOf((String) params.get("age"));

        System.out.println(" age of files to delete ====" + age);
        File tempDirectory = new File(path);
        System.out.println(" tempDirectory ====" + tempDirectory);
        File[] files = tempDirectory.listFiles();

        Date now = new Date();
        long oldesttime = now.getTime() - age;

        for (File file : files) {
            System.out.println("Last modified file =" + file + " --> " + file.length());
        	if (file.lastModified() < oldesttime) {
                file.delete();
            }
        }

        return RepeatStatus.FINISHED;
    }
}
