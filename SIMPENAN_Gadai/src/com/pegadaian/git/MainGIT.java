package com.pegadaian.git;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class MainGIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Menus;
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		ArrayList inputgadai = new ArrayList();
		while(stop==false) {
			try {
				System.out.println("Pegadaian System");
				System.out.println("==========================");
				String formatter = ("|%1$-25s|");
				System.out.println(String.format(formatter,"1. Gadai"));
				System.out.println(String.format(formatter,"2. Tebus"));
				System.out.println(String.format(formatter,"3. Tampilkan Inventory"));
				System.out.println(String.format(formatter,"4. Exit"));
				System.out.print("Opsi : ");
				Menus = sc.nextInt();
				switch(Menus) {
				case 1 :
					inputgadai.add(Gadai.gadai());
					
					break;
				case 2 :
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
	}}
