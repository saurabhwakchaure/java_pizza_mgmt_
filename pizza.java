import java.util.Scanner;
class Pizza
{
	int veg_pizza_price;
	int non_veg_pizza_price;
	int delux_veg_pizza_price;
	int delux_non_veg_pizza_price;
	int total_price;
	int topping;
	int cheese;
	int TakeAway;
	
	//constructor
	Pizza()
	{
		veg_pizza_price=300;
		non_veg_pizza_price=400;
		delux_veg_pizza_price=550;
		delux_non_veg_pizza_price=650;
		topping=150;
		cheese=100;
		TakeAway=20;
		total_price=0;
	}
	
	//veg pizza
	void veg()
	{
		total_price=total_price+veg_pizza_price;
		System.out.println("Pizza:"+veg_pizza_price);
	}
	
	//non veg pizza
	void non_veg()
	{
		total_price=total_price+non_veg_pizza_price;
		System.out.println("Pizza:"+non_veg_pizza_price);
	}
	
	//delux veg pizza
	void delux_veg()
	{
		total_price=total_price+delux_veg_pizza_price;
		System.out.println("Pizza:"+delux_veg_pizza_price);
	}
	
	//delux non veg pizza
	void delux_non_veg()
	{
		total_price=total_price+delux_non_veg_pizza_price;
		System.out.println("Pizza:"+delux_non_veg_pizza_price);
	}
	
	//Topping
	void topping_pizza()
	{
		total_price=total_price+topping;
		System.out.println("Topping:"+topping);
	}
	
	//Cheese
	void cheese_pizza()
	{
		total_price=total_price+cheese;
		System.out.println("Cheese:"+cheese);
	}
	
	//TakeAway
	void takeaway_pizza()
	{
		total_price=total_price+TakeAway;
		System.out.println("TakeAway:"+TakeAway);
	}
	//total Bill 
	int bill()
	{
		return total_price;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("****------Welcome to BlueBird cafe------****");
		System.out.println("****------pizza------****");
		Pizza p=new Pizza();
		
		System.out.println("which pizza ?...");
		System.out.println("1.Veg Pizza");
		System.out.println("2.Non-Veg Pizza");
		System.out.println("3.Delux Veg Pizza");
		System.out.println("3.Delux Non-Veg Pizza");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		sc.nextLine();
		System.out.println("Want Extra Topping(y/n)?=>");
		String topping=sc.next();
		System.out.println("Want Extra Cheese(y/n)?=>");
		String cheese=sc.next();
		System.out.println("Want TakeAway(y/n)?=>");
		String takeaway=sc.next();
			
		switch(choice)
		{
			case 1:p.veg();
				   break;
			case 2:p.non_veg();
		     	   break;
			case 3:p.delux_veg();
				   break;
			case 4:p.delux_non_veg();
				   break;
			case 0:System.exit(0);
				   break;
			default:System.out.println("Invalid Choice");
		}
		
		if(topping.equals("y") || topping.equals("yes"))
		{
			p.topping_pizza();
		}
		
		if(cheese.equals("y") || cheese.equals("yes"))
		{
			p.cheese_pizza();
		}
		
		if(takeaway.equals("y") || takeaway.equals("yes"))
		{
			p.takeaway_pizza();
		}
		
		
		System.out.println("Total Amount:"+p.bill());	
		System.out.println("Thank You!! Visit Again...");	
	}
}
