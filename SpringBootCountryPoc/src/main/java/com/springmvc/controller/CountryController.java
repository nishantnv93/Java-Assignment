package com.springmvc.controller;

import com.springmvc.bean.Country;
import com.springmvc.service.CountryService;
import com.springmvc.utility.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/countries")
public class CountryController {
    public CountryController(){
        System.out.println("Country Controller");
    }
    @Autowired
    CountryService countryService;

    @GetMapping( produces = "application/json")
    public List<Country> getCountries() {
        return  countryService.getCountry();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Country getCountryById(@PathVariable int id) {
       return countryService.getById(id);
    }
}