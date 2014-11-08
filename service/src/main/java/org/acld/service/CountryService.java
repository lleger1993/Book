package org.acld.service;

import org.acld.model.Country;
import org.acld.persist.dao.CountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joseluis on 10/18/14.
 */
@Service("countryService")
public class CountryService {


@Autowired
private CountryDAO countryDAO;

    public List<Country> findAll(){
        return countryDAO.findAll();
    }

}
