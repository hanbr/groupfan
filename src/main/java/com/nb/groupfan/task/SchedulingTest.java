package com.nb.groupfan.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

//    @Scheduled(cron = "0/10 * * * * ?") // 每5秒执行一次
//    public void scheduler(){
//        logger.info(">>>>>>>> 定时调度测试.....");
//    }
}
