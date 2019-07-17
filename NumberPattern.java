import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);
				System.out.println("Please Enter any number between 1 to 100");
				int number = scan.nextInt();
				int a = 1,  b = 1;
			
				int digit = 0;
				if (number > 0 && number <= 100) {
					for (int i = 1; i <= b; i++) {
						if (number < digit + i) {
							break;
						} else {
							for (int j = 1; j <= i; j++) {
								System.out.print(a + " ");
								a++;
							}
							digit = a - 1;
							System.out.println();
							b++;
						}

					}
				} else {
					System.out.println("Please enter the number between 1 to 100");
				}

			}

		}