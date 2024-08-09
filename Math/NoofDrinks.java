package Math;

public class NoofDrinks {

  public static int maxBottlesDrunk(int numBottles, int numExchange) {
    int total_drink = numBottles;
    int emptyB = numBottles;
    while (emptyB >= numExchange) {
      emptyB = emptyB - numExchange;
      numExchange++;
      emptyB++;
      total_drink++;
    }
    return total_drink;
  }
  public static void main(String[] args) {
    System.out.println(maxBottlesDrunk(10, 3));
  }
  
}
