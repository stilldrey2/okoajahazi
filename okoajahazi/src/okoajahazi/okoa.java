package okoajahazi;
import java.util.Scanner;
public class okoa {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int option=0;
		int choice1=2;
		int choice2=2;
		int choice3=2;
		int choice4=2;
		int choice5=2;
		int choice6=2;
		int choice7=2;
		int choice8=2;
		do{
		System.out.println("\tCarrier info");
		System.out.println("0:Sh20(30min,3hrs)");
		System.out.println("1:Sh50 (40Minss+50SMS,24hrs");
		System.out.println("2:Okoa Easy Sh500(500Mins,7days)");
		System.out.println("3:Okoa 100");
		System.out.println("4:Okoa 50");
		System.out.println("5;Okoa 20");
		System.out.println("6:Okoa 10");
		System.out.println("7:Okoa 5");
		System.out.println("Select an Option:");
		option=input.nextInt();
		if (option>12||option<0) {
			System.out.println("invalid choice.");	
		}
		else {
		switch(option) {
		case 0:

		    System.out.println("Existing unpaid Okoa:0");
			System.out.println("New Okoa request:20");
			System.out.println("TOTAL DEBT will be:20");
			System.out.println("1:Accept");
			System.out.println("2:Decline");
			System.out.println("0:Back"); 
			System.out.println("Select option:");
			choice1=input.nextInt();
			if(choice1==0) {
		choice1=0;
				continue;
					}

			else if(choice1==2) { 
				System.out.println("Your request has been cancelled");
				break;
			}
			else if (choice1==1) {
				System.out.println("You have succesfully subscibed to Okoa 20");
				break;
			}
			else {
				System.out.println("invalid choice");
				break;
			}

		case 1:
			 System.out.println("Existing unpaid Okoa:0");
				System.out.println("New Okoa request:50");
				System.out.println("TOTAL DEBT will be:50");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:Back"); 
				System.out.println("Select option:");
				choice2=input.nextInt();

				if (choice2==1) {
					System.out.println("You have succesfully subscibed to Okoa 50");
					break;
				}
				else if(choice2==2) { 
					System.out.println("Your request has been cancelled");
					break;
				}
				else if(choice2==0) {
					continue;
				}
				else {
					System.out.println("invalid choice");
					break;
				}


		case 2:
			 System.out.println("Existing unpaid Okoa:0");
				System.out.println("New Okoa request:500");
				System.out.println("TOTAL DEBT will be:500");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:Back"); 
				System.out.println("Select option:");
				choice3=input.nextInt();
				if (choice3==1) {
					System.out.println("You have succesfully subscibed to Okoa 500");
					break;
				}
				else if(choice3==2) { 
					System.out.println("Your request has been cancelled");
					break;
				}

		      else if(choice3==0) {

			         continue;
		        }
		        else {
		        	System.out.println("invalid choice");
			         break;
		        }

		case 3:
		System.out.println("unpaid Okoa:0");
		System.out.println("New Okoa:100");
		System.out.println("TOTAL okoa due will be:100");
		System.out.println("1:Accept");
		System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
		System.out.println("0:Back"); 
		System.out.println("Select option:");
		choice4=input.nextInt();
		if (choice4==1) {
			System.out.println("You have succesfully subscibed to Okoa 100");
			break;
		}
		else if(choice4==2) { 
			System.out.println("You have subscribed to 170 bob kredo for call and SMS valid midnight");
			break;
		}

		else if(choice4==0) {

		     continue;
		}
		else {
			System.out.println("invalid choice");
		     break;
		}
		case 4:
			System.out.println("unpaid Okoa:0");
			System.out.println("New Okoa:50");
			System.out.println("TOTAL okoa due will be:50");
			System.out.println("1:Accept");
			System.out.println("2:Or GET EXTRA(CONVERT to 150 bob kredo for call and SMS valid midnight");
			System.out.println("0:Back"); 
			System.out.println("Select option:");
			choice5=input.nextInt();
			if (choice5==1) {
				System.out.println("You have succesfully subscibed to Okoa 50");
				break;
			}
			else if(choice5==2) { 
				System.out.println("Your have subscibed to 150 bob kredo for call and SMS valid midnight");
				break;
			}

			else if(choice5==0) {

			     continue;
			}
			else {
				System.out.println("invalid choice");
			     break;
			}
		case 5:
			System.out.println("unpaid Okoa:0");
			System.out.println("New Okoa:20");
			System.out.println("TOTAL okoa due will be:20");
			System.out.println("1:Accept");
			System.out.println("2:Or GET EXTRA(CONVERT to 50 bob kredo for call and SMS valid midnight");
			System.out.println("0:Back"); 
			System.out.println("Select option:");
			choice6=input.nextInt();
			if (choice6==1) {
				System.out.println("You have succesfully subscibed to Okoa 20");
				break;
			}
			else if(choice6==2) { 
				System.out.println("Your have subscibed to 50 bob kredo for call and SMS valid midnight");
				break;
			}

			else if(choice6==0) {

			     continue;
			}
			else {
				System.out.println("invalid choice");
			     break;
			}

		case 6:
			System.out.println("unpaid Okoa:0");
			System.out.println("New Okoa:10");
			System.out.println("TOTAL okoa due will be:10");
			System.out.println("1:Accept");
			System.out.println("2:Or GET EXTRA(CONVERT to 17 bob kredo for call and SMS valid midnight");
			System.out.println("0:Back"); 
			System.out.println("Select option:");
			choice7=input.nextInt();
			if (choice7==1) {
				System.out.println("You have succesfully subscibed to Okoa 10");
				break;
			}
			else if(choice7==2) { 
				System.out.println("Your have subscibed to 17 bob kredo for call and SMS valid midnight");
				break;
			}

			else if(choice7==0) {

			     continue;
			}
			else {
				System.out.println("invalid choice");
			     break;
			}

		case 7:
			System.out.println("Exusting unpaid Okoa:0");
			System.out.println("New Okoa request:5");
			System.out.println("TOTAL DEBT will be:5");
			System.out.println("1:Accept");
			System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
			System.out.println("0:Back"); 
			System.out.println("Select option:");
			choice8=input.nextInt();
			if (choice8==1) {
				System.out.println("You have succesfully subscibed to Okoa 100");
				break;
			}
			else if(choice8==2) { 
				System.out.println("Your have subscibed to 170 bob kredo for call and SMS valid midnight");
				break;
			}

			else if(choice8==0) {

			     continue;
			}
			else {
				System.out.println("invalid choice");
			     break;
			}




		}
		}
		 }while (choice1==0||choice2==0||choice3==0||choice4==0||choice5==0||choice6==0||choice7==0||choice8==0);
			}
		
	
	            
	                      
		 }

	