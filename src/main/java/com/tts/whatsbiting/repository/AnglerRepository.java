package com.tts.whatsbiting.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.whatsbiting.domain.Angler;

public interface AnglerRepository extends CrudRepository<Angler, Long>
{
   
    List<Angler> findAllByOrderByDateAndTimeDesc();
    
}
