package Multithreading;

class Mythread extends Thread
{
	public Mythread(String name)
	{
		super(name);
	}
}
public class Example_03 {

	public static void main(String[] args) {
		MultiThreading t=new Multithreading_01("My Thread 1");
		
		System.out.println("ID "+t.getID());
		System.out.println("Name "+t.getName());
		System.out.println("Priority "+t.getPriority());
		t.start();
		System.out.println("State "+t.getState());
		System.out.println("Alive "+t.isAlive());
	}

}
