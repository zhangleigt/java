package com.suez.system.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;

@Component
@Slf4j
public class MonitoringAlarmJob implements BasicProcessor {
    @Override
    public ProcessResult process(TaskContext taskContext) throws Exception {
        log.info("监控报警监控中。。。");

        log.info("监控报警结束。。。");

        return new ProcessResult(true);
    }
}
