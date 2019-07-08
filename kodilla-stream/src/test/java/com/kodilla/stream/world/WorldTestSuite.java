package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("40"));
        Country germany = new Country("Germany", new BigDecimal("83"));
        Country egipt = new Country("Egypt", new BigDecimal("94"));
        Country australia = new Country("Australia", new BigDecimal("25"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Africa");
        Continent continent3 = new Continent("Australia");

        continent1.getCountrysList().add(poland);
        continent1.getCountrysList().add(germany);
        continent2.getCountrysList().add(egipt);
        continent3.getCountrysList().add(australia);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal resoult = world.getPeopleQuantity();

        //Then
        BigDecimal exceptResoult = new BigDecimal("242");
        Assert.assertEquals(resoult, exceptResoult);
    }

}
