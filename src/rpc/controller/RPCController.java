package rpc.controller;

import java.util.Scanner;
import java.util.*;

public class RPCController 
{
	private Scanner keyboardInput;
	private ArrayList<String> itemList;
	
	public RPCController()
	{
		keyboardInput = new Scanner(System.in);
		itemList = new ArrayList<String>();
		buildItemList();
		//randomItemFromList();
	}

	public void start()
	{
		String item = "";
		int randomNumber = (int)(Math.random() * 2);
		if(randomNumber <= 0)
		{
			item = itemList.get(0);
		}
		if(randomNumber == 1)
		{
			item = itemList.get(1);
		}
		if(randomNumber == 2)
		{
			item = itemList.get(2);
		}
		System.out.println("Wanna play a game?");
		String response = keyboardInput.nextLine();
		if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("sure"))
		{
			System.out.println("Let's play Fire, Water, Earth it's kind of like rock, paper, scissors!");
			System.out.println("Just pick one of the things, and we can start!");
			for(int round = 1; round < 10; round ++)
			{
				System.out.println("Have you picked yet?");
				String playerItem = keyboardInput.nextLine();
				if(playerItem.equalsIgnoreCase("Fire"))
				{
					if(item.equals("Water"))
					{
						System.out.println(item + "! Yay I win that round!");
					}
					if(item.equals("Earth"))
					{
						System.out.println(item + "! Ok you win that time! But I'll get you back");
					}
					if(item.equals("Fire"))
					{
						System.out.println(item + "! Ok, it was a tie.");
					}
					
				}
				if(playerItem.equalsIgnoreCase("Water"))
				{
					if(item.equals("Earth"))
					{
						System.out.println(item + "! Yay I win that round!");
					}
					if(item.equals("Fire"))
					{
						System.out.println(item + "! Ok you win that time! But I'll get you back");
					}
					if(item.equals("Water"))
					{
						System.out.println(item + "! Ok, it was a tie.");
					}
				}
				if(playerItem.equalsIgnoreCase("Earth"))
				{
					if(item.equals("Fire"))
					{
						System.out.println(item + "! Yay I win that round!");
					}
					if(item.equals("Water"))
					{
						System.out.println(item + "! Ok you win that time! But I'll get you back");
					}
					if(item.equals("Earth"))
					{
						System.out.println(item + "! Ok, it was a tie.");
					}
				}
				else if(playerItem.equalsIgnoreCase(""))
				{
					System.out.println("If you didn't want to play, you could have just said so!");
				}
			}
		}
		else
		{
			System.out.println("Oh, ok. Maybe another time then");
		}
	}
	
	private void buildItemList()
	{
		itemList.add("Fire");
		itemList.add("Water");
		itemList.add("Earth");
	}
	
//	public String randomItemFromList(String item)
//	{
//		item = "";
//		int randomNumber = (int)(Math.random() * 2);
//		if(randomNumber <= 0)
//		{
//			item = itemList.get(0);
//		}
//		if(randomNumber == 1)
//		{
//			item = itemList.get(1);
//		}
//		if(randomNumber == 2)
//		{
//			item = itemList.get(2);
//		}
//		return item;
//	}
}
