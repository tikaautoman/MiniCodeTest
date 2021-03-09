package com.biao.Util;

import java.util.regex.Pattern;

public class NumberUtil {
    /**
     * 判断一个字符串是否是数字。
     *
     * @param string
     * @return
     */
    public static boolean isNumber(String string) {
        if (string == null)
            return false;
        Pattern pattern = Pattern.compile("^[0-9]+$");
        return pattern.matcher(string).matches();
    }

    public static void main(String[] args) {
        String[] ss = "asd".split("");

        System.out.println(isNumber("123456"));
    }
}
