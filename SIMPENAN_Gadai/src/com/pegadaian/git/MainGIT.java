package com.pegadaian.git;
import java.util.Scanner;

public class MainGIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Menus;
		System.out.println("Pegadaian System");
		System.out.println("==========================");
		String formatter = ("|%1$-25s|");
		System.out.println(String.format(formatter,"1. Gadai"));
		System.out.println(String.format(formatter,"2. Tebus"));
		System.out.println(String.format(formatter,"3. Tampilkan Inventory"));
		System.out.println(String.format(formatter,"4. Exit"));
		System.out.println("Opsi : ");
		Scanner sc = new Scanner(System.in);
		Menus = sc.nextInt();
		switch(Menus) {
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		default:
		}
	}

}
