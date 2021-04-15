package com.tts.whatsbiting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tts.whatsbiting.domain.Angler;
import com.tts.whatsbiting.repository.AnglerRepository;

@SpringBootApplication
public class WhatsBitingApplication {

    private static final Logger log = LoggerFactory.getLogger(WhatsBitingApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(WhatsBitingApplication.class, args);
	}

//	@Bean
//    public CommandLineRunner demo(AnglerRepository repository) {
//        return (args) -> {
//            // save a couple of anglers
//            
//            
//
//            // read all anglers
//            log.info("Anglers found with findAll():");
//            log.info("-------------------------------");
//            for (Angler angler : repository.findAll()) {
//                log.info(angler.toString());
//            }
//            log.info("");
//
//            // read an individual angler by ID
//            repository.findById(1L)
//                .ifPresent(angler -> {
//                    log.info("Angler found with findById(1L):");
//                    log.info("--------------------------------");
//                    log.info(angler.toString());
//                    log.info("");
//                });
//
//            // read anglers by last name
//            log.info("Angler found with findByName('Patterson'):");
//            log.info("--------------------------------------------");
//            repository.findByName("Patterson").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            
//            log.info("");
//        };
//    }
	
}
