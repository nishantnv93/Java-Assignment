package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import com.springmvc.bean.Country;

import com.springmvc.utility.Countries;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController
{
    @RequestMapping(value="/countries", method = RequestMethod.GET, produces="application/json")
    public List getCountries()
    {
        List listOfCountries = new ArrayList();
        listOfCountries = Countries.createCountryList();
        return listOfCountries;
    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.GET, produces="application/json")
    public Country getCountryById(@PathVariable int id)
    {
        List<Country> listOfCountries = new ArrayList();
        listOfCountries=Countries.createCountryList();

        for (Country country: listOfCountries) {
            if(country.getId()==id)
                return country;
        }

        return null;
    }
}
