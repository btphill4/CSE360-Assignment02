package cse360assignment02;   /* declare package*/

/**
 * This program creates an AddingMachine object where you can
 * add a value to the int total, subtract a value from the int total,
 * return the total as an int, return total as a string and the operations done
 * using toString(), and clear the total value
 */

/** Class AddingMachine */
public class AddingMachine {
  private int total;
  private String sTotal ="";

  /** Constructor */
  public AddingMachine () {
    //total = 0;  // not needed - included for clarity
  }

  /** return total as in int */
  public int getTotal () {
    return total;
  }

  /** add value to the total and indicate a "+" */
  public void add (int value) {
    total += value;
    sTotal += " + " + value;
  }

  /** subtract value from the the total and indicate a "-" */
  public void subtract (int value) {
    total -= value;
    sTotal += " - " + value;
  }

  /** Return total as a string and indicate that it started from 0 */
  public String toString () {
    return "0" + sTotal;
  }

  /** Reset variables to initial values */
  public void clear() {
    total = 0;
    sTotal = "";
  }
}
