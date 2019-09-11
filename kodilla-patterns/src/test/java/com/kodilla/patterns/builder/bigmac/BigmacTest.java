package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTest {
    @Test
    public void testBigMac() {
        //Given
        Bigmac theMac = new Bigmac.BigmacBuilder()
                .bun(BunType.WITH_SESAM)
                .burgers(1)
                .sauce("Spicy")
                .ingredients("Onion")
                .ingredients("Tomato")
                .build();
        System.out.println(theMac.toString());
        //When
        int howManyIngredients = theMac.getIngredients().size();
        Assert.assertEquals(2, howManyIngredients);
    }

}