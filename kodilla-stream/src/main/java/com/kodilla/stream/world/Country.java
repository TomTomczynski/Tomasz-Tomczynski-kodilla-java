package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
  private final String countryName;
  private final BigDecimal peopleQuantity ;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public final BigDecimal getPeopleQuantity()
 {
     return peopleQuantity;
 }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (!getCountryName().equals(country.getCountryName())) return false;
        return getPeopleQuantity().equals(country.getPeopleQuantity());
    }

    @Override
    public int hashCode() {
        int result = getCountryName().hashCode();
        result = 31 * result + getPeopleQuantity().hashCode();
        return result;
    }
}
