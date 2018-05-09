package com.developer.logit;

import org.apache.commons.text.RandomStringGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.apache.commons.text.CharacterPredicates.DIGITS;
import static org.apache.commons.text.CharacterPredicates.LETTERS;

@SpringBootApplication
public class LogitApplication {

    private Logger logger = LoggerFactory.getLogger(LogitApplication.class);

    public LogitApplication() {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(LETTERS, DIGITS)
                .build();

        logger.trace("doStuff needed more information - {}", generator.generate(10));
        logger.debug("doStuff needed to debug - {}", generator.generate(10));
        logger.info("doStuff took input - {}", generator.generate(10));
        logger.warn("doStuff needed to warn - {}", generator.generate(10));
        logger.error("doStuff encountered an error with value - {}", generator.generate(10));
    }

    public static void main(String[] args) {
        SpringApplication.run(LogitApplication.class, args);
    }
}
