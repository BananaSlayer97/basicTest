package org.example;

import cn.hutool.core.swing.clipboard.ClipboardUtil;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:12:36
 */
public class ClipboardUtilTest {

    public static void main(String[] args) {

      //  Clipboard clipboard = ClipboardUtil.getClipboard();

        DataFlavor flavor = new DataFlavor();
        Object o = ClipboardUtil.get(flavor);
        System.out.println(o);
    }
}
