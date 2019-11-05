

import java.util.ArrayList;
import java.util.Scanner;

public class Gadai {
	//public static ArrayList<BarangGadai> listbarang = new ArrayList<BarangGadai>();
//	public ArrayList ReadInput(String nama,String katagori, String desc, int Price){
//		BarangGadai input = new BarangGadai(nama,katagori,desc,Price);
//		input.setName(nama);
//		input.setProduct_category(katagori);
//		input.setDescription(desc);
//		input.setPrice(Price);
//		
//		ArrayList getAll = new ArrayList();
//		getAll.add(input.getName());
//		getAll.add(input.getProduct_category());
//		getAll.add(input.getDescription());
//		getAll.add(input.getPrice());
//		return getAll;
//	}
	//public void filterGadai () {
	public static void main(String[] args) {
		
	//}
		

		boolean status =true;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		boolean stdescription = false;
		String name = null;
		String category = null;
		String description = null;
		int price = 0;
		BarangGadai bgadai = new BarangGadai(name,category,description,price);
		while(status) {
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang Diperlukan-------");
				System.out.print("Nama : ");
				 name = input.next();
				System.out.print("Product Category :");
				 category = input.next();
				input.nextLine();
				System.out.print("Description :");
				 description = input.nextLine();
				System.out.println("Price :");
				 price = input.nextInt();
				if ((name.length()>3 )&&(name.length()<15) ) {
					stnama=true;
				}else {
					//status = false;
					System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				}
				if ((category.equalsIgnoreCase("laptop"))||(category.equalsIgnoreCase("motor"))||(category.equalsIgnoreCase("emas"))) {
					stcategory=true;
				}else {
					System.out.println("Barang gadai harus diantara barang berikut: Laptop, Motor, dan Emas");
					//status = false;
				}
				if(description.contains(" ")==true){
					stdescription=true;
				}else {
					System.out.println("Deskripsi harus lebih dari dua kata");
					//status = ;
				}
				if (price %10000 == 0) {
					stprice=true;
				}else {
					System.out.println("Harga harus kelipatan 10.000");
					//status = false;
				}
				if((stnama)&&(stcategory)&&(stdescription)&&(stprice)) {
					status=false;
				}else {
					status = true;
				}
			}catch(Exception e) {
				System.out.println("Tolong Isi price Dengan Integer");
			}
		}
//		ArrayList Allinput = new ArrayList();
//		Allinput.add(bgadai.ReadInput(name,category,description,price));
		}  
		
	}

