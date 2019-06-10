package com.xianjinxia.multiDatasource.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest {
    @Scheduled(cron ="*/10 * * * * ?")//每分钟执行一次
    public void test(){
        System.out.println("我被调用了，，，，，，，，");
    }
}
