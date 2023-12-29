package Method;

public class Method_Practice_arguments03 
{
	static void showList(String...s)
	{
		for (int i=0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
		showList("Swapnil", "Avinash", "Udhhav", "Ganesh" );
	}

}



		