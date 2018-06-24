package by.htp.predictor.entity;

import java.util.Scanner;

public class Menu {

	public static void menu() {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select an option: 0 - show predictions list,\n1 - add new client,\n2 - give prediction to the clients,"
				+ "\n3 - view clients,\n4 - delete client,\n5 - view history of predictions");
		String k = sc.nextLine();
		switch(k) {
		case "1": /*TBD*/
		}
	}

}
