package interfaces;

interface MyInterface {
    void doSomething(); // Corrected method name to start with a lowercase letter
    int calculate(int a, int b);
}

class MyClass implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("Doing Something");
    }

    @Override
    public int calculate(int a, int b) {
        return a + b; // Corrected the spelling of "return" and added a semicolon
    }
}
public class interfaceexample3 {

	public static void main(String[] args) {
		MyClass myObject = new MyClass();
		myObject.doSomething();
		int result = myObject.calculate(5,7);
		System.out.println("Result: "+result);

	}

}
