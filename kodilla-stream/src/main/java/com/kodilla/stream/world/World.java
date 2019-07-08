package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
   private final List<Continent> listOfContinents = new ArrayList<>();

   public void addContinent(Continent theContinent){listOfContinents.add(theContinent);}

    public final BigDecimal getPeopleQuantity() {

        BigDecimal peopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getCountrysList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sumOfPiple,currentNumber) -> sumOfPiple = sumOfPiple.add(currentNumber));

        return peopleQuantity;
    }

}
