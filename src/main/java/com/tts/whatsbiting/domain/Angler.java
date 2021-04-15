package com.tts.whatsbiting.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;





@Entity
public class Angler
{
    @Id
    @GeneratedValue
    private Long id;
    @Size (min = 3, message = "You must enter at least 3 characters")
    private String name;
    @Size (min = 3, message = "You must enter at least 3 characters")
    private String email;
    @Size (min = 3, message = "You must enter at least 3 characters")
    private String fishCatch;
    @Size (min = 3, message = "You must enter at least 3 characters")
    private String baitType;
    @Column
    @CreationTimestamp
    private Date dateAndTime;
    @Size (min = 3, message = "You must enter at least 3 characters")
    private String location;
    
    public Angler() {
        //Entiity needs a non argument constructor to create a new instance
    }
    
    public Angler(String name, String email, String fish, String baitType, String location, Date dateAndTime) {
        this.name = name;
        this.email = email;
        this.fishCatch = fishCatch;
        this.baitType = baitType;
        this.location = location;
        this.dateAndTime = dateAndTime;
        
    }

    

   
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFishCatch()
    {
        return fishCatch;
    }

    public void setFishCatch(String fishCatch)
    {
        this.fishCatch = fishCatch;
    }

    public String getBaitType()
    {
        return baitType;
    }

    public void setBaitType(String baitType)
    {
        this.baitType = baitType;
    }

    public Date getDateAndTime()
    {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime)
    {
        this.dateAndTime = dateAndTime;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Angler [id=" + id + ", name=" + name + ", email=" + email + ", fishCatch=" + fishCatch + ", baitType=" + baitType + ", dateAndTime=" + dateAndTime + ", location="
                + location + "]";
    }

   
    
    
    
}
