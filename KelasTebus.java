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

	public ArrayList OrderID(ArrayList Allinput){		
		
		if(Allinput.size()>1){
			for(int i = 0; i<Allinput.size();i++){
				List neew =  (List) Allinput.get(i);
				neew.set(0, i+1);
			}
		}
		return Allinput;
	
	}

		public void ViewTebus(ArrayList k){
		for(int i=0;i<k.size();i++){
			List data = (List) k.get(i);
			for(int j =0;j<data.size();j++){
				
				System.out.printf("%1$15s |",data.get(j));
				}
			System.out.println("");					
			}}
	
	public ArrayList ProcessTebus(ArrayList listInput, double biaya,int ID){
		boolean morethan = false;
		boolean valueID = false;
		boolean modsepuluh = false;
		for(int i=0;i<listInput.size();i++){
			List find = (List) listInput.get(i);
			if(ID==(int)find.get(0)){
				valueID=true;
				if(biaya<=(double)find.get(find.size()-1) && biaya>=10000){
					if(biaya%10000==0){
						morethan = true;
						modsepuluh = true;
						morethan = true;
						biaya = (double) find.get(find.size()-1) - biaya;
						find.set(find.size()-1, biaya);
						if((double)find.get(find.size()-1)==0){
							find.set(find.size()-2, "Lunas");
					}
				}
			}
		}
		if(valueID==false){
			System.out.println("Mohon maaf, ID yang anda masukan salah");
			morethan=true;
		}
		if(morethan==false || modsepuluh==false){
			System.out.println("Mohon maaf, Uang yang anda masukan tidak memenuhi syarat");
		}

		return listInput;
	}
	
}
