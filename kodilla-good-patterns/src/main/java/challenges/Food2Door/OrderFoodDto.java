package challenges.Food2Door;

public class OrderFoodDto {
    private String name;
    private int quantity;

    public OrderFoodDto(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

