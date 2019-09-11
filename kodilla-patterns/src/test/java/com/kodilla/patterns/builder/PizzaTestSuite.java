package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given

        Pizza p2 = new Pizza.PizzaBuilder().ingredient("Onion").sauce("spicy").build();


        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        Assert.assertEquals(3, howManyIngredients);
    }
}