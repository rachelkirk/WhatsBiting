package com.tts.whatsbiting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tts.whatsbiting.domain.Angler;
import com.tts.whatsbiting.repository.AnglerRepository;

@Service
public class AnglerService
{
    @Autowired
    private AnglerRepository anglerRepository;
    
    public List<Angler>findAll() { 
        List<Angler> anglers = anglerRepository.findAllByOrderByDateAndTimeDesc();
        return anglers;       
    }
    
    public void save(Angler angler) {
        anglerRepository.save(angler);
    }
    
}
