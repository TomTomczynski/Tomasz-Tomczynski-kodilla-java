package challenges.Food2Door;

import java.util.Random;

public class ExtraFoodShop implements Delivery {
    @Override

    public boolean processOrder(OrderFoodDto order) {
        System.out.println("Order: " + order.getName());
        Random rnd = new Random();
        return rnd.nextBoolean();
    }

}
