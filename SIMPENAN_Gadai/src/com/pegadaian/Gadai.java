import java.util.Scanner;

public class Gadai {
	public static void main(String[] args) {
		boolean status =true;
		boolean stnama = false;
		boolean stcategory = false;
		boolean stprice = false;
		while (status) {
			try {
				Scanner input = new Scanner (System.in);
				
				System.out.println("-------- Masukan Data yang di perluakan-------");
				System.out.print("Nama : ");
				String name = input.next();
				System.out.print("Produk Category :");
				String katagori = input.next();
				System.out.print("Deskription :");
				String des = input.next();
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
				if((stnama)&&(stcategory)) {
					status=false;
				}else {
					status = true;
				}
				//if() {
				//	
				//}
			}catch(Exception e) {
				System.out.println("Tolong Isi price Dengan Integer");
			}
			
		}
		
		
		
	}
}
