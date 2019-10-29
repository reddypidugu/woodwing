package com.test.woodwing.service;

import com.test.woodwing.utils.GetInetgerFromString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("woodwingService")
public class WoodwingServiceImpl implements WoodwingService{

    public static final Logger logger = LoggerFactory.getLogger(WoodwingServiceImpl.class);

    public String addMeasurements(String param1, String param2){

        double p1Meters = param1.contains("yards") ? GetInetgerFromString.getNumber(param1) / 1.0936 : GetInetgerFromString.getNumber(param1);
        double p2Meters = param2.contains("yards") ? GetInetgerFromString.getNumber(param2) / 1.0936 : GetInetgerFromString.getNumber(param2);

        double totalMeasuremnt = p1Meters + p2Meters;
        logger.info("Response from Service :: {}", totalMeasuremnt );
        return Double.valueOf(totalMeasuremnt).toString();
    }
}
