package com.test.woodwing.controller;

import com.test.woodwing.service.WoodwingService;
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

    @Autowired
    WoodwingService woodwingService;

    @GetMapping("/")
    public ResponseEntity<String> addMeasurements(@RequestParam String param1, @RequestParam String param2){
        String totalMeasuremnt = woodwingService.addMeasurements(param1, param2);
        return new ResponseEntity<String>(totalMeasuremnt+ " Meters", HttpStatus.OK);

    }
}
