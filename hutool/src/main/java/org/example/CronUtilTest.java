package org.example;

import cn.hutool.core.lang.Console;
import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:14:36
 */
public class CronUtilTest {
    public static void main(String[] args) {

        CronUtil.schedule("0 0/1 * * * ?", new Task() {
            @Override
            public void execute() {
                Console.log("Task excuted.");
            }
        });

        // 支持秒级别定时任务
        //CronUtil.setMatchSecond(true);
        CronUtil.start();
    }
}
