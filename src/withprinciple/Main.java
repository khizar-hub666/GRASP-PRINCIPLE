package withprinciple;

class Order {
    private final String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void processOrder() {
        System.out.println("Processing Order: " + orderId);
    }
}

// ✅ With Creator Principle (Using Factory)
class OrderFactory {
    public static Order createOrder(String orderId) {
        return new Order(orderId);  // Factory method to create Order
    }
}

class OrderControllerWithPrinciple {
    public void createAndProcessOrder(String orderId) {
        Order order = OrderFactory.createOrder(orderId);  // ✅ Using Factory
        order.processOrder();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== With Creator Principle ===");
        OrderControllerWithPrinciple controller = new OrderControllerWithPrinciple();
        controller.createAndProcessOrder("ORD1001");
    }
}
