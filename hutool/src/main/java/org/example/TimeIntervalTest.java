package org.example;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.extern.slf4j.Slf4j;


/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 28:16:50
 */
public class TimeIntervalTest {

    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();


        //花费毫秒数
        timer.interval();
        //花费分钟数
        timer.intervalMinute();
        //返回花费时间，并重置开始时间
        timer.intervalRestart();
    }
}
