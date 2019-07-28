package challenges.Food2Door;

public class HealthyShop implements Delivery {
    @Override
    public boolean processOrder(OrderFoodDto order) {
        System.out.println("Order is prepering");
        return false;
    }
}
