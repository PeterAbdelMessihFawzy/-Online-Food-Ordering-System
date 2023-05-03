package App;
public class EmailObserver implements OrderObserver {
    private String email;
  
    public EmailObserver(String email) {
      this.email = email;
    }
  
    public void update(Order order) {
      // Implementation for sending an email notification
    }
  }
