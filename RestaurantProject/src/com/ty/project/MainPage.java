package com.ty.project;

import java.util.*;

public class MainPage{


		
		public double subTotal;
		public static double runningTotal;
		public static double itemPrice;
		static boolean ordering=true;
		static Scanner sc=new Scanner(System.in);
		
		public static void menu() {
			System.out.println("Welcome to chung's resturant \n1.Burger(130 Rs)  \n2.Noddles(150 Rs) \n3. Fries(120 Rs) \n4. DrumSticks(550 Rs) \n5. Gobi(150 Rs)");
		}
		public static double itemPrice(int foodItem) {
			
		
			if(foodItem==1) {
				System.out.println("You've ordered Burger");
				itemPrice=130.00;
			}
			if(foodItem==2) {
				System.out.println("You've ordered Noddles");
				itemPrice=150.00;
			}
			if(foodItem==3) {
				System.out.println("You've ordered  Fries");
				itemPrice=120.00;
			}
			if(foodItem==4) {
				System.out.println("You've ordered DrumSticks");
				itemPrice=550.00;
			}
			if(foodItem==5) {
				System.out.println("You've ordered Gobi");
				itemPrice=150.00;
			}
			quantity();
			return itemPrice;
		}
		public static double quantity() {
			System.out.println("Enter Quantity");
			double quantity=sc.nextDouble();
			subTotal(quantity,itemPrice);
			return quantity;
			
		}
		public static double subTotal(double quantity,double itemPrice) {
			double subTotal=quantity*itemPrice;
			System.out.println("SubTotal:  " +subTotal);
			System.out.println("Orderd SuccesFull !!!!!!");
			return subTotal;
			
		}
		public static void done() {
			ordering=false;
			System.out.println(runningTotal);
			System.out.println("Enjoy your Meal");
		}
		public static void main(String[] args) {
			int menuOption;
			int foodItem=0;
			sc=new Scanner(System.in);
			
			do {
				double runningTotal=0;
				menu();
				menuOption=sc.nextInt();
				switch(menuOption) {
				case 1:
					foodItem=1;
					itemPrice(foodItem);
					break;
				case 2:
					foodItem=2;
					itemPrice(foodItem);
					break;
				case 3:
					foodItem=3;
					itemPrice(foodItem);
					break;
				case 4:
					foodItem=4;
					itemPrice(foodItem);
					break;	
				case 5:
					foodItem=5;
					itemPrice(foodItem);
					break;	
				case 6:
					done();
					break;	
				default:
					System.out.println("Ivalid Options");
				
				}
				
			}while(ordering);{
		}
	}
	}
	

	
		



