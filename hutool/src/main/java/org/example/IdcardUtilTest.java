package org.example;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.IdcardUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:13:03
 */
public class IdcardUtilTest {

    public static void main(String[] args) {

        String ID_18 = "411424199508163777";
        //省份
        String province = IdcardUtil.getProvinceByIdCard(ID_18);
      // Assert.assertEquals(province, "江苏");
        System.out.println(province);
    }
}
