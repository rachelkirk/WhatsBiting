//package com.tts.whatsbiting.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.tts.whatsbiting.domain.Response;
//import com.tts.whatsbiting.service.WeatherService;
//
//@Controller
//public class WeatherController {
//    @Autowired
//    private WeatherService weatherService;
//    
//    @GetMapping
//    public String getIndex(Model model) {
//        Response response = weatherService.getForecast("43210");
//        model.addAttribute("data", response);
//        return "index";
//    }
//
//}