package static_practice;

class HondaCity
{
	static long price=10;
	int a, b;
	static double getonRoadPrice(String City)
	{
		switch (City)
		{
		case "Delhi":
		    return price+price*0.1;
		case "Mumbai":
			return price+price*0.09;
		default:	
			return 0.0;
		}
	}
}
public class staticpractice02 {

	public static void main(String[] args) {
		HondaCity hc=new HondaCity();
		System.out.println("Main");
	}

}
