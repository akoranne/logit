package com.developer.logit.controller;

import com.developer.logit.service.SleuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

    private static final Logger logger = LoggerFactory.getLogger(SleuthController.class);

    @Autowired
    private SleuthService sleuthService;

    @GetMapping("/")
    public String helloSleuth() {
        logger.info("Hello Sleuth");
        return "success";
    }


    @GetMapping("/same-span")
    public String helloSleuthSameSpan() throws InterruptedException {
        logger.info("Same Span");
        sleuthService.doSomeWorkSameSpan();
        return "success";
    }

//    @GetMapping("/new-span")
//    public String helloSleuthNewSpan() {
//        logger.info("New Span");
//        // sleuthService.doSomeWorkNewSpan();
//        return "success";
//    }

}