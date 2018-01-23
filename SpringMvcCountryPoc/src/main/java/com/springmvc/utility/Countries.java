package com.springmvc.utility;
import com.springmvc.bean.Country;
import java.util.List;
import java.util.ArrayList;

public class Countries {
    public static List createCountryList()
    {
        Country indiaCountry=new Country(1, "India");
        Country chinaCountry=new Country(4, "China");
        Country nepalCountry=new Country(3, "Nepal");
        Country bhutanCountry=new Country(2, "Bhutan");

        List listOfCountries = new ArrayList();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);
        return listOfCountries;
    }
}
