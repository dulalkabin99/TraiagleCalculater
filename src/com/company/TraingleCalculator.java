package com.company;

import java.lang.Math;
import java.util.Scanner;

public class TraingleCalculator { public static void main( String[] args )

{
    Scanner keyboard = new Scanner(System.in);
    double length1, length2, length3;

    System.out.print( "Enter Length: " );
    length1 = keyboard.nextDouble();
    System.out.print( "Enter Width: " );
    length2 = keyboard.nextDouble();
    System.out.print( "Enter Height: " );
    length3 = keyboard.nextDouble();


    if (length1  == length2 && length2==length3) {
        System.out.print("This is a equilateral triangle : ");
    }

     else if (((Math.pow(length1, 2))==((Math.pow(length2,2))+(Math.pow(length3,2)))) ||
    ((Math.pow(length3, 2))==((Math.pow(length2,2))+(Math.pow(length1,2)))) ||
            ((Math.pow(length2, 2))==((Math.pow(length1,2))+(Math.pow(length3,2))))){
        System.out.print("This is not a equilateral triangle : ");
        System.out.print("This is a right triangle : ");
    }
    else
    System.out.print( "This is Not  a right traingle and not a equilateral triangle : " );

}
}