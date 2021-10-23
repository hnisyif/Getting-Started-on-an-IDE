/*
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
This is my github personal access token
*/
import java.lang.Math;

public class A0{

public static void main(String[] args){

  //Q1
  double radius = 15;
  double area = Math.PI * (radius * radius);
  System.out.println("The area of this circle is " + area +"\n");

  //Q2
  String name = "Wayne Gretzky";
  int num = 99;
  System.out.println(name + " is number " + num +"\n");

  //Q3
  double length = 5.7;
  double width = 4.8;
  area = length * width;
  System.out.println("Length = " + length + "m");
  System.out.println("Width = " + width + "m");
  System.out.println("Area = " + area + "m²" +"\n");

  //Q4
  int hours = 40;
  double wage = 13.00;
  double insurance = 4.00;
  double tax = 0.22;
  double netPay = (hours * wage - insurance) - tax * (hours * wage - insurance);
  System.out.println("$" + netPay  + " = " + "(" + hours + "*" + wage + "-" + insurance + ")" + "-" + tax + "*" + "(" + hours + "*" + wage + "-" + insurance + ")" );

  //Q5

 }// close main
}// close class