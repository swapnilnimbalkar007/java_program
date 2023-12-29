package Method;

public class Method_practice {
    //find the maximum value
    static int max(int x, int y) {
        if (x > y) 
            return x;
        else
            return y;
    } 

    public static void main(String[] args) {
        int a = 90, b = 236, c;
        c = max(a, b);
        System.out.println(c);
    }
}

