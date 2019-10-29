package com.test.woodwing.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetInetgerFromString {

    public static double getNumber(String param){
        double val = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(param);
        while(m.find()) {
            val = Integer.valueOf(m.group());
        }
        return val;
    }
}
