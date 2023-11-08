package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Foot;
import models.Heels;
import models.skate;

public class Main {
ArrayList<Foot>footList=new ArrayList<Foot>();
Scanner scan = new Scanner(System.in);
Random rand = new Random();
String name;
int price;
String type;
double height = 0;
int total = 0;
	public Main() {
		menu();
	}
	
	public void menu() {
		int menu=0;
		System.out.println("Just Du It!");
		System.out.println("===========");
		System.out.println("1. Add Footwear");
		System.out.println("2. View Footwear");
		System.out.println("3. Update Footwear");
		System.out.println("4. Delete Footwear");
		System.out.println("5. Exit");
		
		menu=scan.nextInt();scan.nextLine();
		
		switch (menu) {
		case 1:
			add();
			break;

		case 2:
			view();
			break;
			
		case 3:
			update();
			break;
			
		case 4:
			delete();
			break;
		}
	}
	public void add() {

		
		String id="FW"+ rand.nextInt(10);
		
		do {
			System.out.println("Footwear name : ");
			name=scan.nextLine();
		} while (name.length()<3 || name.length()>25);
		
		
		do {
			System.out.println("Footwear price [more than 10000] : ");
			price=scan.nextInt();scan.nextLine();
		} while (price<10000);
		
		
		do {
			System.out.println("Footwear type [Heels or RollerSkate] : ");
			type=scan.nextLine();
		} while (!type.equals("Heels") && !type.equals("RollerSkate"));
		
		if (type.equals("Heels")) {
			System.out.println("Input Heels height :  ");
			height=scan.nextDouble();scan.nextLine();
			while(height<1.0 || height>9.0);
			footList.add(new Heels(id, name, price, type, height));
			System.out.println("Footwear succesfully added!");
			
		}
		
		if (type.equals("RollerSkate")) {
			System.out.println("Input RollerSkate total :  ");
			total=scan.nextInt();scan.nextLine();
			while(total<2 || total>4);
			footList.add(new skate(id, name, price, type, total));
			System.out.println("Footwear succesfully added!");
			
		}
		
		menu();
		
	}
	
	public void view() {
		if (footList.isEmpty()) {
			System.out.println("No Data Found");
		}
		else 	

				//ID
//			for (Foot foot : footList) {
//				if (foot instanceof Heels) {
//					Heels heels=(Heels)foot;
//			System.out.println("Footwear ID : "+heels.getId());
//			System.out.println("Footwear Name : "+heels.getName());
//			System.out.println("Footwear Price : "+heels.getPrice());
//			System.out.println("Footwear Height : "+heels.getHeight());
//				}
//			}
				//index
				for (int i = 0; i < footList.size(); i++) {
					Foot foot = footList.get(i);
					int index = i+1;
					if (foot instanceof Heels) {
						Heels heels=(Heels)foot;
						System.out.println("No : " + index);
						System.out.println("Footwear ID : "+heels.getId());
						System.out.println("Footwear Name : "+heels.getName());
						System.out.println("Footwear Price : "+heels.getPrice());
						System.out.println("Footwear Height : "+heels.getHeight());
					}
					
					if (foot instanceof skate) {
						skate skates=(skate)foot;
						System.out.println("Footwear ID : "+skates.getId());
						System.out.println("Footwear Name : "+skates.getName());
						System.out.println("Footwear Price : "+skates.getPrice());
						System.out.println("Footwear Total : "+skates.getTotal());
					}
				}
		menu();
		
	}
		

	public void update() {
	
		
		String ID = "";
		System.out.println("What Footwear ID that u want update? : ");
		ID=scan.nextLine();
		for (Foot foot : footList) {
			if (foot.getId().equals(ID)) {
				if (foot instanceof Heels) {
					Heels heels=(Heels)foot;
					String id="FW"+ rand.nextInt(10);
					
					do {
						System.out.println("Footwear name : ");
						name=scan.nextLine();
					} while (name.length()<3 || name.length()>25);
					
					
					do {
						System.out.println("Footwear price [more than 10000] : ");
						price=scan.nextInt();scan.nextLine();
					} while (price<10000);
					
					
					do {
						System.out.println("Footwear type [Heels or RollerSkate] : ");
						type=scan.nextLine();
					} while (!type.equals("Heels") && !type.equals("RollerSkate"));
					
					if (type.equals("Heels")) {
						System.out.println("Input Heels height :  ");
						height=scan.nextDouble();scan.nextLine();
						while(height<1 || height>9);
						footList.add(new Heels(id, name, price, type, height));
						System.out.println("Footwear succesfully added!");
					}
					heels.setId(ID);
					heels.setName(name);
					heels.setPrice(price);
					heels.setType(type);
					heels.setHeight(height);

					
					menu();
				}
			}
			if (foot.getId().equals(ID)) {
				if (foot instanceof skate) {
					skate skates=(skate)foot;
					String id="FW"+ rand.nextInt(10);
					
					do {
						System.out.println("Footwear name : ");
						name=scan.nextLine();
					} while (name.length()<3 || name.length()>25);
					
					
					do {
						System.out.println("Footwear price [more than 10000] : ");
						price=scan.nextInt();scan.nextLine();
					} while (price<10000);
					
					
					do {
						System.out.println("Footwear type [Heels or RollerSkate] : ");
						type=scan.nextLine();
					} while (!type.equals("Heels") && !type.equals("RollerSkate"));
					
					if (type.equals("RollerSkate")) {
						System.out.println("Input RollerSkate total :  ");
						total=scan.nextInt();scan.nextLine();
						while(total<2 || total>4);
						footList.add(new skate(id, name, price, type, total));
						System.out.println("Footwear succesfully added!");
					}
					skates.setId(ID);
					skates.setName(name);
					skates.setPrice(price);
					skates.setType(type);
					skates.setTotal(total);
					menu();
				}
			}
		}
	}
	
	public void delete() {

		String ID = "";
		System.out.println("What Footwear ID that u want delete? : ");
		ID=scan.nextLine();
		for (Foot foot : footList) {
			if (foot.getId().equals(ID)) {
				footList.remove(foot);
				menu();
			
			}
		}

	}

	public static void main(String[] args) {
		new Main();
	}

}
