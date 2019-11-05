package com.pegadaian.ojt.TugasJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KelasTebus {
	public ArrayList ReadInput(String nama,String inputProduk, String desc, double Price){
		GadaiMenu input = new GadaiMenu();
		input.setNama(nama);
		ArrayList<String> listProduk = new ArrayList<String>();
		 listProduk.add("Laptop");
		 listProduk.add("Motor");
		 listProduk.add("Emas");
		    for (int i = 0; i < listProduk.size(); i++) {
		      if(listProduk.get(i)==inputProduk){
		    	  input.setProduct_Category(inputProduk);
		      }
		    }
		input.setDescription(desc);
		input.getProduct_Category();
		input.setPrice(Price);
		input.getPrice();
		
		ArrayList getAll = new ArrayList();
		getAll.add(input.getNama());
		getAll.add(input.getProduct_Category());
		getAll.add(input.getDescription());
		getAll.add(input.getPrice());
		double Utang = input.getPrice();
		if(Utang!=0){
			getAll.add("Lunas");
		}
		getAll.add(Utang);
		return getAll;
		
	}
	public static void main(String[] args) {
		KelasTebus tebus = new KelasTebus();
		System.out.println(tebus.ReadInput("Sinta Amelia", "Laptop", "Laptop bagus", 5000000));
		
	}
}
