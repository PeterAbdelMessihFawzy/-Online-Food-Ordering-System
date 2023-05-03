package App;

public class Order {
  private String customerName;
  private String customerAddress;
  private String dateTime;
  private String status;

  public Order(String customerName, String customerAddress, String dateTime) {
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    this.dateTime = dateTime;

    System.out.println("Order created with customer name: " + customerName);
    System.out.println("Order created with customer address: " + customerAddress);
    System.out.println("Order created with date/time: " + dateTime);
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public String getDateTime() {
    return dateTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
  