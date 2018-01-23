package com.springmvc.service;

import com.springmvc.bean.Country;
import com.springmvc.utility.Countries;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    public CountryService(){
        System.out.println("Country Service");
    }

    public List<Country> getCountry(){
        List listOfCountries = new ArrayList();
        listOfCountries = Countries.createCountryList();
        return listOfCountries;
    }

    public Country getById(int id){
        List<Country> listOfCountries = new ArrayList();
        listOfCountries = Countries.createCountryList();

        for (Country country : listOfCountries) {
            if (country.getId() == id)
                return country;
        }

        return null;
    }

}
