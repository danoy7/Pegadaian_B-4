package com.pegadaian.git;

import java.util.ArrayList;
import java.util.List;

public class InventoryBarang {
	public void Inventory(ArrayList inputgadai) {
		KelasTebus tebus2 = new KelasTebus();
		List<String> entityname = Arrays.asList("ID","Nama","Product","Description","Price");
		for(int e=0;e<entityname.size();e++){
			if(entityname.get(e)!=null){
				String s = (String) entityname.get(e);
				System.out.printf("%1$15s |",s);}}
		System.out.println("");	
		ArrayList listInput2 = tebus2.OrderID(inputgadai);
		for(int i=0;i<listInput2.size();i++){
			List data = (List) listInput2.get(i);
			for(int j =0;j<data.size();j++){
				if(j<=4) {
				System.out.printf("%1$15s |",data.get(j));}
				}
			System.out.println("");					
			}
	}
}
