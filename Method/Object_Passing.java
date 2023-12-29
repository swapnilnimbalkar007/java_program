package Method;

public class Object_Passing 
{
	//object passing value
	static void change(int x[], int index, int value) 
	{
		x[index]=value;
	}

	public static void main(String[] args) {
		int A []= {2,4,6,8,10};
		change(A,2,20);
		for(int X:A) {
			System.out.println(X);
		}

	}

}
