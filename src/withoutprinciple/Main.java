package withoutprinciple;

class Order {
    private final String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void processOrder() {
        System.out.println("Processing Order: " + orderId);
    }
}

// ❌ Without Creator Principle (Direct Object Creation)
class OrderControllerWithoutPrinciple {
    public void createAndProcessOrder(String orderId) {
        Order order = new Order(orderId);  // ❌ Direct object creation
        order.processOrder();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Without Creator Principle ===");
        OrderControllerWithoutPrinciple controller = new OrderControllerWithoutPrinciple();
        controller.createAndProcessOrder("ORD2002");
    }
}

