package challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        op.procesOrder(new HealthyShop(),new OrderFoodDto("apple",5));

    }
}
