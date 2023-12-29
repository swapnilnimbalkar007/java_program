package static_practice;

class Student
{
	int roll_no;
	String name;
	static String collegeName= "SVPM_COE";
	Student (int r, String n){
		roll_no=r;
		name = n;
	}
	void display()
	{
		System.out.println(roll_no +" "+ name +" "+ collegeName );
	}
}
public class TestStaticVariable {

	public static void main(String[] args) {
		Student s1 =new Student (457,"Swapnil");
		Student s2 =new Student (455, "Ajay");
		
		s1.display();
	    s2.display();

	}

}
