package App;

public class FoodItemFactory 
{
    public static FoodItem createFoodItem(String itemType) {
      if (itemType.equals("pizza")) {
        return new Pizza();
      } else if (itemType.equals("burger")) {
        return new Burger();
      } else if (itemType.equals("salad")) {
        return new Salad();
      } else {
        throw new IllegalArgumentException("Invalid food item type: " + itemType);
      }
    }
  }