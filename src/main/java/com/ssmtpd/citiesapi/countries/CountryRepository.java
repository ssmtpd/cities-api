package com.ssmtpd.citiesapi.countries;

import com.ssmtpd.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
