package com.pegadaian.git;
import com.pegadaian.git.Gadai;

import java.util.ArrayList;
import java.util.List;
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
		ArrayList inputgadai = new ArrayList();
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
					inputgadai.add(Gadai.gadai());
					
					break;
				case 2 :
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println(String.format(specialFormatter, "ID","Product","Price", "Status","Utang"));
					System.out.println("-----------------------------------------------------------------------------");
					KelasTebus tebus = new KelasTebus();
					ArrayList listInput = tebus.OrderID(inputgadai);
					tebus.ViewTebus(listInput);
					boolean stopcase2 = false;
					while(stopcase2==false){
					try {
						stopcase2 = true;
						System.out.print("Masukan ID barang yang ingin di tebus : ");
						int ID = sc.nextInt();
						System.out.print("Masukan biaya yang ingin ditebus :");
						double biaya = sc.nextDouble();
						tebus.ProcessTebus(listInput, biaya, ID);
						tebus.ViewTebus(listInput);
					}
					catch (Exception e) {
						System.out.println("Mohon masukan bilangan yang sesuai");
						sc.next();
						continue;
					}
					};
					break;
				case 3 :
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println(String.format(specialFormatter, "ID","Nama","Product", "Description","Price"));
					System.out.println("-----------------------------------------------------------------------------");
					InventoryBarang InventBarang = new InventoryBarang();
					InventBarang.Inventory(inputgadai);					
					break;
				case 4 :
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
