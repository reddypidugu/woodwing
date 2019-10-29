package com.test.woodwing.service;

import com.test.woodwing.utils.GetInetgerFromString;
import org.springframework.stereotype.Service;

@Service("woodwingService")
public class WoodwingServiceImpl implements WoodwingService{

    public String addMeasurements(String param1, String param2){
        double p1Meters = 0.0;
        double p2Meters = 0.0;
        if(param1.contains("yards")) {
            p1Meters = GetInetgerFromString.getNumber(param1) / 1.0936;
        }
        else if(param1.contains("meters")){
            p1Meters = GetInetgerFromString.getNumber(param1);
        }

        if(param2.contains("yards")) {
            p2Meters = GetInetgerFromString.getNumber(param2) / 1.0936;
        }
        else if(param2.contains("meters")){
            p2Meters = GetInetgerFromString.getNumber(param2);
        }

        double totalMeasuremnt = (p1Meters + p2Meters);

        return Double.valueOf(totalMeasuremnt).toString();
    }
}
