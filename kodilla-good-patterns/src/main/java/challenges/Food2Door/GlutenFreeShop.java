package challenges.Food2Door;

public class GlutenFreeShop implements Delivery {
    @Override
    public boolean processOrder(OrderFoodDto order) {
        System.out.println("Order is ready");
        return true;
    }
}
