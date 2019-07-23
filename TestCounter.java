import java.util.Scanner;

public class TestCounter {

	public static void main(String[] args) {
		
		int columns , number = 1 , counter , j   ;
	    Scanner input = new Scanner(System.in);
	       System.out.println("Enter the number to display as  floyd's triangle:");
	       
	       columns = input.nextInt();
	       System.out.println("Floyd's triangle");
	       System.out.println("****************");
	       for ( counter = 1 ; counter <= columns ; counter++ )
	       {
	           for ( j = 1 ; j <= counter ; j++ )
	           {
	                System.out.print(number+" ");
	                //Incrementing the number value
	                number++;
	           }
	           //For new line
	           System.out.println();
	}

}}
