package com.testcase.vikashbandhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Sellers are from same place and having same price for crops.

public class BuyersSameDistanceFromSeller {

	public static void buy(int quantityToBuy)
	{
		//sellers having crops of different quantity .
		ArrayList<Integer> quantityOfCrops = new ArrayList<Integer>();
		quantityOfCrops.add(10);
		quantityOfCrops.add(20);
		quantityOfCrops.add(20);
		quantityOfCrops.add(30);
		quantityOfCrops.add(50);
		
	
		
		Collections.sort(quantityOfCrops);
		boolean canBuy = false;
		
		for(int i=0;i<quantityOfCrops.size();i++)
		{
			if(quantityToBuy <= quantityOfCrops.get(i) )
			{
				System.out.println("Hello Buyer we recomend to buy from seller "+(i+1));
			    canBuy = true;
				break;				
			}
			
			
		}
		//If buyer has more requirement than each seller have.
		if(canBuy == false)
		{
			int quantity = 0;
			int i=0;
			ArrayList <Integer>noOfSeller = new ArrayList<Integer>();
			while(quantityToBuy >=quantity)
			{
				//System.out.println(i);
				quantity = quantity+quantityOfCrops.get(i);
				noOfSeller.add(i);
				
				
				i++;
				if(i>=quantityOfCrops.size())
				{
					break;
				}
			}
			//check if quantity of crops buyer wants to buy is available in different seller
			if(quantityToBuy <= quantity )
			{
				canBuy = true;
				System.out.println("Hey Buyer we are sorry, one seller does not have that much stock you want.. ");
				System.out.println("We recomend you to buy from "+ noOfSeller.size()+ " sellers.. ");
			}
		}
		
		if(canBuy == false)
		{
			System.out.println("Sorry we do not have that much stock... ");
		}
		
		
		
	}
	public static void main(String[] args)
	{
		System.out.println("Hey buyer please enter the quantities you want to buy crops ");
		Scanner sc = new Scanner(System.in);
		int quantityYouWant = sc.nextInt();
		
		buy(quantityYouWant);
	}
}
