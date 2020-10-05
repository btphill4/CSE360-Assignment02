package cse360assignment02;


public class AddingMachine {
  private int total;
  private String sTotal ="";

  public AddingMachine () {
    //total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total += value;
    sTotal += " + " + value;
  }

  public void subtract (int value) {
    total -= value;
    sTotal += " - " + value;
  }

  public String toString () {
    return "0" + sTotal;
  }

  public void clear() {
    total = 0;
    sTotal = "";
  }
}
