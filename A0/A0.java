/*
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
This is my github personal access token
*/
import java.lang.Math;

public class A0{

public static void main(String[] args){

  //Q1 calculates area of circle
  double radius = 15;
  double area = Math.PI * (radius * radius);
  System.out.println("The area of this circle is " + area +"\n");

  //Q2 stores String and number 
  String name = "Wayne Gretzky";
  int num = 99;
  System.out.println(name + " is number " + num +"\n");

  //Q3 calculates area of rectangle
  double length = 5.7;
  double width = 4.8;
  area = length * width;
  System.out.println("Length = " + length + "m");
  System.out.println("Width = " + width + "m");
  System.out.println("Area = " + area + "m²" +"\n");

  //Q4 calculates amount of money piad to an employee 
  int hours = 40;
  double wage = 13.00;
  double insurance = 4.00;
  double tax = 0.22;
  double netPay = (hours * wage - insurance) - tax * (hours * wage - insurance);
  System.out.println("$" + netPay  + " = " + "(" + hours + "*" + wage + "-" + insurance + ")" + "-" + tax + "*" + "(" + hours + "*" + wage + "-" + insurance + ")" +"\n");

  //Q5 prints out a math calculation from the array
  double numList[] = {3, 7.0, 17, 53};
  double answer = numList[2] - numList[1];
  System.out.println(numList[2] + " - " + numList[1] + " = " + answer + "\n");

  //Q6 calculates the price of an item and prints a receipt 
  double cash = 20.00;
  double shirtPrice = 12.49;
  tax = shirtPrice * 0.13;
  double rTax = Math.round(tax * 100)/100.0;
  double totalPrice = shirtPrice + tax;
  double rTotalPrice = Math.round(totalPrice * 100)/100.0;
  double change = cash - totalPrice;
  double rChange = Math.round(change * 100)/100.0;
  System.out.println("          George");
  System.out.println("----------------------------");
  System.out.println("Description   Rate   Amount");
  System.out.println("----------------------------");
  System.out.println("Shirt         0.00   12.49");
  System.out.println("----------------------------");
  System.out.println("Tax           0.13   " + rTax );
  System.out.println("Total         $" + rTotalPrice);
  System.out.println("CASH          $" + cash);
  System.out.println("CHANGE        $" + rChange);

 }// close main
}// close class