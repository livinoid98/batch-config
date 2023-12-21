package inno.batch.batchconfig.springbatch;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BatchScheduler {

    private JobLauncher jobLauncher;
    private SimpleJobConfiguration simpleJobConfiguration;

    @Scheduled(cron = "10 * * * * *")
    public void runJob() {
        log.info("scheduled 실행");
    }
}
