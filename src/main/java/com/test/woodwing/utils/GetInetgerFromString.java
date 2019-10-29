package com.test.woodwing.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetInetgerFromString {

    public static final Logger logger = LoggerFactory.getLogger(GetInetgerFromString.class);

    public static double getNumber(String param){
        double val = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(param);
        while(m.find()) {
            val = Integer.valueOf(m.group());
        }
        logger.info("Response from Util class :: {}", val);
        return val;
    }
}
