import java.util.Scanner;

public class TicketSystem {

	 String ticketNumber;
	 String ticketDesc;
	 int ticketType; //1-DB 2.WAS ticket 3- Network 
	 String status;  //0-new 1-Assigned 2-Inprogress 3-close 4-Cancelled
	 String resolution;
	 
	 public void updateStatus(String comments) {
			this.status=this.status+"   "+status;
		}

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter 1 to create new ticket and Enter 2 to exit");
		int i = scan.nextInt();
		if (i == 1){
		System.out.println("Please enter Ticket Description");
		String j = scan.next();
		System.out.println("Please Enter Ticket Type");
		String k = scan.next();
		System.out.println("Please Enter Status New or Old");
		String l = scan.next();
		System.out.println("Submitted Ticket Sumary - " + " " + j +" "+ k +" " +l);
		}
		else {
			System.exit(i);
		}
		
		
	/*	System.out.println("Please Enter 3 to Approve the ticket and Enter 4 to Cancel/Reject");
		int m = scan.nextInt();
		if (m == 4 ) {
			
		}
		}
		else {
			
		}*/
		/*
		System.out.println("Please Enter 5 to close the ticket");
		int n = scan.nextInt();
		if (n == 4 ) {
		System.out.println("");
		System.exit(n);
		}*/
	}

}
