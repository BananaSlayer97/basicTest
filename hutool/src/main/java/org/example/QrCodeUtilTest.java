package org.example;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:15:52
 */
public class QrCodeUtilTest {
    public static void main(String[] args) {

        // 生成指定url对应的二维码到文件，宽和高都是300像素
        QrCodeUtil.generate("https://hutool.cn/", 300, 300, FileUtil.file("/qrcode.jpg"));


        // decode -> "http://hutool.cn/"
        String decode = QrCodeUtil.decode(FileUtil.file("d:/qrcode.jpg"));

    }
}
