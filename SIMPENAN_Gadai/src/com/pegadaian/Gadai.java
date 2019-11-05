import java.util.Scanner;

public class Gadai {
	public static void main(String[] args) {
		boolean status =true;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		boolean stdes = false;
		while (status) {
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang di perlukan-------");
				System.out.print("Nama : ");
				String name = input.next();
				System.out.print("Produk Category :");
				String katagori = input.next();
				input.nextLine();
				System.out.print("Deskription :");
				String des = input.nextLine();
				System.out.println("Price :");
				int price = input.nextInt();
				if ((name.length()>3 )&&(name.length()<15) ) {
					stnama=true;
				}else {
					System.out.println("Nama Harus lebih dari 3 dan kurang dari 15 karakter");
				}
				if ((katagori.equalsIgnoreCase("laptop"))||(katagori.equalsIgnoreCase("motor"))||(katagori.equalsIgnoreCase("emas"))) {
					stcategory=true;
				}else {
					System.out.println("Barang gadai harus diantara barang berikut : Laptop, Motor, Emas");
				}
				if(des.contains(" ")==true){
					stdes=true;
				}else {
					System.out.println("deskripsi harus lebih dari dua kata");
				}
				if (price %10000 == 0) {
					stprice=true;
				}else {
					System.out.println("harus kelipatan 10000");
				}
				if((stnama)&&(stcategory)&&(stdes)&&(stprice)) {
					status=false;
				}else {
					status = true;
				}
			}catch(Exception e) {
				System.out.println("Tolong Isi price Dengan Integer");
			}
			
		}
		
		
		
	}
}
