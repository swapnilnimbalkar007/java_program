package interfaces;

interface Test {
    int X = 10; 
    
//    void meth1(); 
    void meth2();

    static void meth3() {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test {
    void meth4();
}

class My implements Test2 {
    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth4() {
        System.out.println("Meth4");
    }
}

public class interfaceexmple4 {
    public static void main(String[] args) {
        System.out.println(Test.X);
        Test.meth3();
        My myObj = new My();
        myObj.meth1();
        myObj.meth2();
        myObj.meth4();
    }
}
