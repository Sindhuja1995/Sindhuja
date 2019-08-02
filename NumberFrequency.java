package AssignmentClasses;
import java.util.Scanner;

public class NumberFrequency {

    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	    
	        System.out.println("Enter the number :");
	         
	        int inputNumber = sc.nextInt();         
	        int[] digitCount = new int[10];
	         
	        while (inputNumber != 0)
	        {
	            int lastDigit = inputNumber % 10;
	             
	            digitCount[lastDigit]++;
             
	            inputNumber = inputNumber / 10;
	        }
         
	        System.out.println("\n " + "Digits : Frequency");	         
	        for (int i = 0; i < digitCount.length; i++)
	        {
	            if(digitCount[i] != 0)
	            {
	                System.out.println("\n " + "   "+i+"   :   "+digitCount[i]);
	            }
	        } 
	         
	        sc.close();
	    }
	}

