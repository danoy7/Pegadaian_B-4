import java.util.Scanner;

public class Gadai {
	public boolean filterGadai (String name,String katagori, String des, int price) {
		boolean status =false;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		boolean stdes = false;
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang di perlukan-------");
				System.out.print("Nama : ");
				//String name = input.next();
				System.out.print("Produk Category :");
				//String katagori = input.next();
				//input.nextLine();
				//System.out.print("Deskription :");
				//String des = input.nextLine();
				//System.out.println("Price :");
				//int price = input.nextInt();
				if ((name.length()>3 )&&(name.length()<15) ) {
					stnama=true;
				}else {
					status = false;
					//System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				}
				if ((katagori.equalsIgnoreCase("laptop"))||(katagori.equalsIgnoreCase("motor"))||(katagori.equalsIgnoreCase("emas"))) {
					stcategory=true;
				}else {
					//System.out.println("Barang gadai harus diantara barang berikut : Laptop, Motor, Emas");
					status = false;
				}
				if(des.contains(" ")==true){
					stdes=true;
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
				if((stnama)&&(stcategory)&&(stdes)&&(stprice)) {
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
