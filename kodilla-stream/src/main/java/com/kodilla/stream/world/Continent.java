package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

   final List<Country> countrysList = new ArrayList();
   final String name;

    public Continent(final String name) {
        this.name = name;
    }

    public List<Country> getCountrysList() {
        return countrysList;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (!getCountrysList().equals(continent.getCountrysList())) return false;
        return getName().equals(continent.getName());
    }

    @Override
    public int hashCode() {
        int result = getCountrysList().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
