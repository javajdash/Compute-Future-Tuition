/* 5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year.

In one year, the tuition will be $10,500.

Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
*/

public class  ComputeFutureTuition {
  public static void main(String[] args) {
    // Initialize tuition and year
    double tuition = 10000;
    double totalCost = 0;

    // Calculate tuition for 10 years
    for (int year = 0; year < 10; year++)
      tuition *= 1.05;
    System.out.println("Tuition in ten years: " + Math.round(tuition));

    /* Calculate total cost of four years' worth of tuition after the tenth year
    */
    for (int year = 0; year < 4; year++)
      totalCost += tuition;
    System.out.println("Total cost of four years' worth of tuition after the tenth year: " + Math.round(totalCost));
  }
}