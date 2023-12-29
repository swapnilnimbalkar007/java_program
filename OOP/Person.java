package OOP;
//using getter and setter method
public class Person {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Swapnil");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
