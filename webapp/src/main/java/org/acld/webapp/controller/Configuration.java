
package org.acld.webapp.controller;

import org.acld.model.Country;
import org.acld.service.CountryService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(eager=true)
@ApplicationScoped
public class Configuration {
private  List<Country>  countries = new ArrayList<Country>();


    @ManagedProperty(value = "#{countryService}")
    private CountryService countryService;

    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostConstruct
    public void init() {

      countries = countryService.findAll();
    }

    public List<Country> getCountries() {
        return countries;
    }
}