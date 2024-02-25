// Java Program to Find Square of a Number

import java.util.Scanner;

public class SquareofNumber {

    private static Scanner sc;

    public static void main(String[] args)

    {

        int number, square;

        sc = new Scanner(System.in);

        System.out.print(" Please Enter a Number : ");

        number = sc.nextInt();

        // Calling below static method calsqaure

        square = calcsquare(number);

        System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);

    }

    public static int calcsquare(int num)

    {

        return num * num;

    }

}