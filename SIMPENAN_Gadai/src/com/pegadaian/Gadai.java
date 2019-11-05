package com.pegadaian.git;
import com.pegadaian.git.BarangGadai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gadai {
	public static ArrayList allinput = new ArrayList();
	public ArrayList ReadInput(int ID, String nama,String inputProduk, String desc, double Price){
		GadaiMenu input = new GadaiMenu(nama,inputProduk,desc,Price);
		input.setName(nama);
		ArrayList<String> listProduk = new ArrayList<String>();
		 listProduk.add("Laptop");
		 listProduk.add("Motor");
		 listProduk.add("Emas");
		    for (int i = 0; i < listProduk.size(); i++) {
		      if(listProduk.get(i)==inputProduk){
		    	  input.setProduct_category(inputProduk);
		      }
		    }
		input.setDescription(desc);
		input.getProduct_category();
		input.setPrice(Price);
		input.getPrice();
		
		ArrayList getAll = new ArrayList();
		getAll.add(input.getName());
		getAll.add(input.getProduct_category());
		getAll.add(input.getDescription());
		getAll.add(input.getPrice());
		
		return getAll;
		
	}
	public ArrayList OrderID(ArrayList Allinput){		
		
		if(Allinput.size()>1){
			for(int i = 0; i<Allinput.size();i++){
				List neew =  (List) Allinput.get(i);
				neew.set(0, i+1);
			}
		}
		return Allinput;
	}
	//public void filterGadai (String name,String category, String description, int price) {
	public static ArrayList gadai() {
		
	//}
		Scanner input = new Scanner (System.in);
		boolean status =true;
		String name = "";
		String category = "";
		String description ="";
		double price =0;
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
				price = input.nextDouble();
				if (price %10000 == 0) {
					status=false;
				}
			}catch(Exception e) {
				System.out.println("Harga harus kelipatan 10.000");
				input.next();
			}
		}
		status = true;
		ArrayList inputlist = new ArrayList();
	
		KelasTebus tebus = new KelasTebus();
		inputlist = tebus.ReadInput(1,name,category,description,price);
		
		return inputlist;
	}
	
	
}
