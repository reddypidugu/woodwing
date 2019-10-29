package com.test.woodwing.controller;

import com.test.woodwing.service.WoodwingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WoodwingController {

    public static final Logger logger = LoggerFactory.getLogger(WoodwingController.class);

    @Autowired
    WoodwingService woodwingService;

    @GetMapping("/")
    public ResponseEntity<String> addMeasurements(@RequestParam String param1, @RequestParam String param2){
        logger.info("Request params :: {}, {}", param1, param2);
        if(param1 == null || param1.equals("") || param2 == null || param2.equals("")){
            return new ResponseEntity<>(" Invalid Request", HttpStatus.BAD_REQUEST);
        }
        String totalMeasuremnt = woodwingService.addMeasurements(param1, param2);
        logger.info("Response from API :: {}", totalMeasuremnt);
        return new ResponseEntity<>(totalMeasuremnt+ " Meters", HttpStatus.OK);

    }
}
