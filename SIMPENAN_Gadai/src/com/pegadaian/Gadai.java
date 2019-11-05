package com.pegadaian.git;

import java.util.Scanner;

public class Gadai {
	//public void filterGadai (String name,String category, String description, int price) {
	public static void main(String[] args) {
		
	//}
		boolean status =true;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		boolean stdescription = false;
		while(status) {
			
		
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang Diperlukan-------");
				System.out.print("Nama : ");
				String name = input.next();
				System.out.print("Product Category :");
				String category = input.next();
				input.nextLine();
				System.out.print("Description :");
				String description = input.nextLine();
				System.out.println("Price :");
				int price = input.nextInt();
				if ((name.length()>3 )&&(name.length()<15) ) {
					stnama=false;
				}else {
					//status = false;
					System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				}
				if ((category.equalsIgnoreCase("laptop"))||(category.equalsIgnoreCase("motor"))||(category.equalsIgnoreCase("emas"))) {
					stcategory=false;
				}else {
					System.out.println("Barang gadai harus diantara barang berikut: Laptop, Motor, dan Emas");
					//status = false;
				}
				if(description.contains(" ")==true){
					stdescription=false;
				}else {
					System.out.println("Deskripsi harus lebih dari dua kata");
					//status = false;
				}
				if (price %10000 == 0) {
					stprice=false;
				}else {
					System.out.println("Harga harus kelipatan 10.000");
					//status = false;
				}
				if((stnama)&&(stcategory)&&(stdescription)&&(stprice)) {
					status=true;
				}else {
					status = false;
				}
			}catch(Exception e) {
				System.out.println("Tolong Isi price Dengan Integer");
			}
		}	 
		
	}
}
