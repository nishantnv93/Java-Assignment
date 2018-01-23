package com.classes.service;

import java.util.*;
import com.classes.model.Country;
import com.classes.rpository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    /*public ResponseEntity<Country> getCountryById(long id){
        Country country = countryRepository.findOne(id);
        if(countryModel == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok().body(countryModel);
        }
    }*/

    public Country insertCountry( Country country){
        return countryRepository.save(country);
    }

    public Country getCountryById(Long id) {
        Country country = countryRepository.findOne(id);
        return country;
    }

    public Country update( Long id, Country countryDetails) {
        Country country = countryRepository.findOne(id);
        country.setName(countryDetails.getName());
        Country updatedCountry = countryRepository.save(country);
        return updatedCountry;
    }

    public Country deleteCountryById(Long id) {
        Country country = countryRepository.findOne(id);
        countryRepository.delete(country);
        return country;
    }
}
