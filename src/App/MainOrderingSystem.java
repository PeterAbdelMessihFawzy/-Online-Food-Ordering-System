package App;

public class MainOrderingSystem {
  public static void main(String[] args) {
    // Create an instance of the FoodItemFactory
    FoodItemFactory factory = new FoodItemFactory();

    // Create an instance of the OrderObserver
    OrderObserver observer = new EmailObserver("customer@example.com");

    // Process an order
    String customerName = "John Doe";
    String customerAddress = "123 Main St., Anytown USA";
    String dateTime = "2023-05-03 12:00 PM";
    String foodItemType = "pizza";
    FoodItem foodItem = factory.createFoodItem(foodItemType);
    Order order = new Order(customerName, customerAddress, dateTime);
    order.setStatus("in progress");
    observer.update(order);

    // Print the order details
    // printOrderDetails(order);
  }

  public static void printOrderDetails(Order order) {
    System.out.println("Order details:");
    System.out.println("Customer name: " + order.getCustomerName());
    System.out.println("Customer address: " + order.getCustomerAddress());
    System.out.println("Date and time: " + order.getDateTime());
    System.out.println("Status: " + order.getStatus());

    System.out.println("Order details printed successfully.");
}
 

  }