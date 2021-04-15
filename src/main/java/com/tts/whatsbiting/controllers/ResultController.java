package com.tts.whatsbiting.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.whatsbiting.domain.Angler;
import com.tts.whatsbiting.domain.Request;
import com.tts.whatsbiting.repository.AnglerRepository;
import com.tts.whatsbiting.service.AnglerService;

@Controller
public class ResultController
{
    @Autowired
    private AnglerService anglerService;
    
    @GetMapping("/result")
    public String anglerDisplay (Angler angler, Model model) {
        List<Angler> anglers = anglerService.findAll();
        
        System.out.println(anglers.size());
        model.addAttribute("anglers", anglers);
        
        return "result";
    }
    
    @PostMapping(value = "/result")
    public String addNewAngler(@Valid Angler angler, BindingResult bindingResult, Model model, Request request) {
        if (bindingResult.hasErrors()) {
          //  model.addAttribute("request", new Request());
            return "home";
        }
       
        
        anglerService.save(angler);
        return anglerDisplay(angler, model);
        
    }
   
    
    
 
}
