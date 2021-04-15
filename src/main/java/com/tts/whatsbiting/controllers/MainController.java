package com.tts.whatsbiting.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.tts.whatsbiting.domain.Angler;
import com.tts.whatsbiting.domain.Request;
import com.tts.whatsbiting.domain.Response;
import com.tts.whatsbiting.repository.AnglerRepository;
import com.tts.whatsbiting.service.AnglerService;
import com.tts.whatsbiting.service.WeatherService;


@Controller
public class MainController
{
//    @Autowired
//    private AnglerRepository anglerRepository;
    
    @Autowired
    private AnglerService anglerService;
    
    @Autowired
    private WeatherService weatherService;
    
    
    @GetMapping("/home")
    public String getHome (Angler angler, Model model) {
       
        model.addAttribute("request", new Request());
        
       return "home";
    }
    
 

    
    @PostMapping("/home")
    public String postHome(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        model.addAttribute("angler", new Angler());
        return "home";
    }
    
    
    
//  @PostMapping(value = "/result")
//  public String addNewAngler(Angler angler, Model model, Request request) {
////      anglerRepository.save(new Angler(angler.getName(), 
////          angler.getEmail(), angler.getFishCatch(), angler.getBaitType(), angler.getLocation(), null));
////      model.addAttribute("name", angler.getName());
////      model.addAttribute("email", angler.getEmail());
////      model.addAttribute("fishCatch", angler.getFishCatch());
////      model.addAttribute("baitType", angler.getBaitType());
////      model.addAttribute("location", angler.getLocation());
//      anglerService.save(angler);
//      model.addAttribute("angler", new Angler());
//      return "result";
//  }
   
    
//    @GetMapping("/")
//    public String getIndex(Model model) {
//        Response response = weatherService.getForecast("28401");
//        model.addAttribute("data", response);
//        return "index";
//    } 
    
}