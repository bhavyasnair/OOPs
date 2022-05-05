import java.util.*;
public class Product 
{
	String pcode;
	String pname;
	int price;
	
	public Product(String pcode_get,String pname_get,int price_get)
	{
		pcode=pcode_get;
		pname=pname_get;
		price=price_get;
	}
	public int get_price()
	{
		return price;
	}
	public static void main(String args[])
	{       Scanner sc=new Scanner(System.in);
		Product p1=new Product("A100","WATCH",5000);
		Product p2=new Product("B100","TV",20000);
		Product p3=new Product("c100","HEADPHONE",10000);
                System.out.println("\nProduct 1");
                System.out.println("Product code:"+p1.pcode+"\nProduct name:"+p1.pname+"\nProduct price:"+p1.price);
                System.out.println("\nProduct 2");
                System.out.println("\nProduct code:"+p2.pcode+"\nProduct name:"+p2.pname+"\nProduct price:"+p2.price);
                System.out.println("\nProduct 3");
                System.out.println("\nProduct code:"+p3.pcode+"\nProduct name:"+p3.pname+"\nProduct price:"+p3.price);
		if(p1.price<=p3.price && p1.price<=p2.price)
			System.out.println("Lowest price id is:"+p1.pcode);
		if(p3.price<=p1.price && p3.price<=p2.price)
			System.out.println("Lowest price id is:"+p3.pcode);
		if(p2.price<=p3.price && p2.price<=p1.price)
			System.out.println("Lowest price id is:"+p2.pcode);
	}
}


