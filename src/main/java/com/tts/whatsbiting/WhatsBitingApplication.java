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


	
}
