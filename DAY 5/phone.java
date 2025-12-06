package regexe;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String number = scan.nextLine();
		
		String phone = "^(001||\\+1)-\\d{3}-\\d{3}-\\d{4}$";
		
		if(number.matches(phone)) {
			System.out.print("Valid Phone number");
		}
		else {
			System.out.println("Invalid phone number");
		}
		
	}

}
