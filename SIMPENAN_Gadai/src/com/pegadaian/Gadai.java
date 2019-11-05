package com.pegadaian.git;

import java.util.Scanner;

public class Gadai {
	//public void filterGadai (String name,String category, String description, int price) {
	public static void gadai() {
		
	//}
		Scanner input = new Scanner (System.in);
		boolean status =true;
		String name = "";
		String category = "";
		String description ="";
		int price =0;
		System.out.println("-------- Masukan Data yang Diperlukan-------");
		while (status) {
			try {
				System.out.print("Nama : ");
				name = input.nextLine();
				if ((name.length()>3 )&&(name.length()<15) ) {
					status=false;
				}
			}catch(Exception e) {
				System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				input.next();
			}
		}
		status = true;
		while(status) {
			try {
				System.out.print("Product Category :");
				category = input.nextLine();
				if ((category.equalsIgnoreCase("laptop"))||(category.equalsIgnoreCase("motor"))||(category.equalsIgnoreCase("emas"))) {
					status=false;
				}
			}catch(Exception e) {
				System.out.println("Barang gadai harus diantara barang berikut: Laptop, Motor, dan Emas");
				input.next();
			}
		}
		status =true;
		while(status) {
			try {
				System.out.print("Description :");
				description = input.nextLine();
				if(description.contains(" ")==true){
					status=false;
				}
			}catch(Exception e) {
				System.out.println("Deskripsi harus lebih dari dua kata");
				input.next();
			}
		}
		status = true;
		while(status) {
			try {
				System.out.println("Price :");
				price = input.nextInt();
				if (price %10000 == 0) {
					status=false;
				}
			}catch(Exception e) {
				System.out.println("Harga harus kelipatan 10.000");
				input.next();
			}
		}
		status = true;			 
		
	}
}
