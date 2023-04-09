package com.length.publisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{
	
	public void lengthConverter() {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("********  Welcome to the Java Length Converter!  **********\r\n"
        		+ "\r\n"
        		+ "This program allows you to convert lengths between different units of measurement, including meters, centimeters, feet, inches, kilometers, and miles.\r\n"
        		+ "\r\n"
        		+ "To get started, simply enter a length value, choose the input unit, and choose the output unit. The program will then convert the length value to the desired unit and display the result.\r\n"
        		+ "\r\n"
        		+ "Let's get started!\r\n"
        		+ "");
        
        String continueProgram = "y";
        
        while (continueProgram.equalsIgnoreCase("y")) {
        	
        	System.out.println("Enter a length value: ");
            double value = scanner.nextDouble();
            
          
            System.out.println("Enter the input unit (m, cm, ft, in, km, mi): ");
            String input = scanner.next();
            

            System.out.println("Enter the output unit (m, cm, ft, in, km, mi): ");
            String output = scanner.next();
            
           
            double meters;
            switch(input) {
                case "m":
                    meters = value;
                    break;
                case "cm":
                    meters = value / 100.0;
                    break;
                case "ft":
                    meters = value / 3.28084;
                    break;
                case "in":
                    meters = value / 39.3701;
                    break;
                case "km":
                    meters = value * 1000.0;
                    break;
                case "mi":
                    meters = value * 1609.34;
                    break;
                default:
                    System.out.println("Invalid input unit.");
                    return;
            }
            

            double outputValue;
            switch(output) {
                case "m":
                    outputValue = meters;
                    break;
                case "cm":
                    outputValue = meters * 100.0;
                    break;
                case "ft":
                    outputValue = meters * 3.28084;
                    break;
                case "in":
                    outputValue = meters * 39.3701;
                    break;
                case "km":
                    outputValue = meters / 1000.0;
                    break;
                case "mi":
                    outputValue = meters / 1609.34;
                    break;
                default:
                    System.out.println("Invalid output unit.");
                    return;
            }
            
            System.out.println(value + " " + "(" + input +")" + " is equal to " + outputValue + " " + "(" + output + ")" + ".");
            
            System.out.println("Do you want to convert another height? (y/n)");
            continueProgram = scanner.next();
        }
        	System.out.println("Thank you for using the Java Length Converter!");
        } //end of the loop
        
        
}