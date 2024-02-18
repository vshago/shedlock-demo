package com.example.demo.task;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ExampleTask {

    @Scheduled(cron = "0 * * ? * *")
    @SchedulerLock(name = "exampleTask", lockAtMostFor = "50s", lockAtLeastFor = "20s")
    public void scheduledTask() throws InterruptedException {
        System.out.println("task scheduled!");
        Thread.sleep(15000);
        System.out.println("task executed!");
    }
}
