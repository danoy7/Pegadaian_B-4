package com.pegadaian.git;
import com.pegadaian.git.Gadai;
import java.util.Scanner;

public class MainGIT {
	public GadaiMenu gadaimenu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Menus;
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		String formatter = ("|%1$-25s|");
		String specialFormatter = "|%1$-5s|%2$-15s|%3$-16s|%4$-20s|%5$-16s|";
		while(stop==false) {
			try {
				System.out.println("Pegadaian System");
				System.out.println("==========================");
				System.out.println(String.format(formatter,"1. Gadai"));
				System.out.println(String.format(formatter,"2. Tebus"));
				System.out.println(String.format(formatter,"3. Tampilkan Inventory"));
				System.out.println(String.format(formatter,"4. Exit"));
				System.out.println("Opsi : ");
				Menus = sc.nextInt();
				switch(Menus) {
				case 1 :
					/*System.out.println("Detail Information :");
					System.out.println("====================");
					System.out.print("Name : ");
					System.out.println("Product Category : ");
					System.out.println("Description : ");
					System.out.println("Price : ");*/
					Gadai.gadai();
					stop = true;
					break;
				case 2 :
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println(String.format(specialFormatter, "ID","Product","Price", "Status","Utang"));
					System.out.println("-----------------------------------------------------------------------------");
					stop = true;
					break;
				case 3 :
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println(String.format(specialFormatter, "ID","Nama","Product", "Description","Price"));
					System.out.println("-----------------------------------------------------------------------------");
					stop = true;
					break;
				default:
				}
			}catch(Exception e) {
				System.out.println("menu yang anda pilih tidak terdapat di sistem");
				sc.next();
				continue;
			}
		};
	}

}
