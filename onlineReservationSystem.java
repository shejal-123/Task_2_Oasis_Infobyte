package onlineReservationSystem;

import java.util.Scanner;

public class onlineReservationSystem
{
	private static boolean[] seats=new boolean[10];
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Please select an option");
			System.out.println("View Seat Map");
			System.out.println("Reserve Seat");
			System.out.println("Cancel Reservation");
			System.out.println("Exit");
			
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				viewSeatMap();
				break;
				
			case 2:
				reserveSeat();
				break;
				
			case 3:
				cancelReservation();
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid");
			}
		}
		
	}
	

	private static void viewSeatMap()
	{
		System.out.println("Current Seat Map: ");
		for(int i=0;i<seats.length;i++)
		{
			if(seats[i])
			{
				System.out.print("X");
			}
			else
			{
				System.out.print((i+1)+" ");
			}
		}
		System.out.println();
		
		
	}
	private static void reserveSeat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter seat number (1-10)");
		int seatNumber=sc.nextInt();
		if(seatNumber<1 || seatNumber>10)
		{
			System.out.print("Invalid seat number");
			
		}
		else if(seats[seatNumber-1])
		{
			System.out.print("Seat already reserved");
		}
		else
		{
			seats[seatNumber-1]=true;
			System.out.print("Seat reserved");
		}
		
	}
	private static void cancelReservation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter seat number (1-10)");
		int seatNumber=sc.nextInt();
		if(seatNumber<1 || seatNumber>10)
		{
			System.out.print("Invalid seat number");
			
		}
		else if(seats[seatNumber-1])
		{
			System.out.print("Seat not reserved");
		}
		else
		{
			seats[seatNumber-1]=false;
			System.out.print("Reservation cancelled...!");
		}
		
	}
	
	

}
