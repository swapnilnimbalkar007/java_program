//package OOP;
//
//class Parent
//{
//	public Parent()
//	{
//		System.out.println("Parent Constructor");
//	}
//}
//
//class Child extends Parent{
//	
//		public Child()
//		{
//			System.out.println("Child Contructor");
//		}	
//}
//class GrandChild extends Child{
//	public GrandChild()
//	{
//		System.out.println("Grand Child Constructor");
//	}
//}
//public class InheritConst {
//
//	public static void main(String[] args) {
//		GrandChild c=new GrandChild();
//
//	}
//
//}

package OOP;
class Parent{
	public Parent()
	{
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public Child()
	{
		System.out.println("Child");
	}
}

class GrandChild extends Child{
	public GrandChild()
	{
		System.out.println("Grandchild");
	}
}
public class InheritConst{
	public static void main(String args[]) {
		GrandChild c= new GrandChild();
	}
}