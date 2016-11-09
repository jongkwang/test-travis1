/**
 * Created by JongKwang on 10/11/2016.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Calculator c = new Calculator();
        System.out.println( "1 + 2 = " + c.sum(1 , 2));
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
