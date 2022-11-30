package org.example;

import cn.hutool.system.oshi.OshiUtil;
import oshi.hardware.UsbDevice;

import java.util.List;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:16:27
 */
public class OshiUtilTest {
    public static void main(String[] args) {

        long total = OshiUtil.getMemory().getTotal();
        System.out.println(total);

        List<UsbDevice> usbDevices = OshiUtil.getHardware().getUsbDevices(true);
        System.out.println(usbDevices);

    }
}
