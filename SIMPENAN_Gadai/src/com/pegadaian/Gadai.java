package com.pegadaian.git;

import java.util.Scanner;

public class Gadai {
	public boolean filterGadai (String name,String category, String description, int price) {
		boolean status =false;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		boolean stdescription = false;
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang Diperlukan-------");
				System.out.print("Nama : ");
				//String name = input.next();
				System.out.print("Product Category :");
				//String category = input.next();
				//input.nextLine();
				//System.out.print("Description :");
				//String description = input.nextLine();
				//System.out.println("Price :");
				//int price = input.nextInt();
				if ((name.length()>3 )&&(name.length()<15) ) {
					stnama=true;
				}else {
					status = false;
					//System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				}
				if ((category.equalsIgnoreCase("laptop"))||(category.equalsIgnoreCase("motor"))||(katagori.equalsIgnoreCase("emas"))) {
					stcategory=true;
				}else {
					//System.out.println("Barang gadai harus diantara barang berikut : Laptop, Motor, Emas");
					status = false;
				}
				if(description.contains(" ")==true){
					stdescription=true;
				}else {
					//System.out.println("deskripsi harus lebih dari dua kata");
					status = false;
				}
				if (price %10000 == 0) {
					stprice=true;
				}else {
					//System.out.println("harus kelipatan 10000");
					status = false;
				}
				if((stnama)&&(stcategory)&&(stdescription)&&(stprice)) {
					status=true;
				}else {
					status = false;
				}
			}catch(Exception e) {
				status = false;
			}
			 return status;
		
	}
}
