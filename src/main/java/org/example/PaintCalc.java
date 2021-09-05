package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class PaintCalc
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int length, width, area, gallon = 350;

        System.out.print("What is the length of the room? ");
        length = input.nextInt();
        System.out.print("What is the width of the room? ");
        width = input.nextInt();

        area = length * width;
        int i, x = area;
        for(i = 0; i >= 0; i++){
            if(x - gallon < 0){
                i++;
                break;
            }
            else{
                x = x - gallon;
            }
        }

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", i, area);
    }
}
