package com.classes.controller;

import java.util.*;
import com.classes.model.Country;
import com.classes.rpository.CountryRepository;
import com.classes.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/countries")
public class CountryController {


   @Autowired
   private CountryService countryService;


   @GetMapping( produces = "application/json")
    public List<Country> getCountries(){
       return countryService.getAllCountries();
   }

   /*@GetMapping(value = "/{id}", produces = "application/json")
   public ResponseEntity<Country> getById(@PathVariable Long id){
        return countryService.getCountryById(id);
   }*/

   @GetMapping(value = "/{id}", produces = "application/json")
   public Country getById(@PathVariable Long id){
      return countryService.getCountryById(id);
   }

   @PostMapping
   public Country saveCountry(@RequestBody Country country){
      return countryService.insertCountry(country);

   }

   @PutMapping(value = "/{id}")
   public Country  updateCountry(@PathVariable Long id, @RequestBody Country countryDetails){
      return countryService.update(id, countryDetails);
   }

   @DeleteMapping(value = "/{id}")
   public Country deleteCountry(@PathVariable Long id){
      return countryService.deleteCountryById(id);
   }



}
