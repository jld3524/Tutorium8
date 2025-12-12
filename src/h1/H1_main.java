package h1;

public class H1_main {

	public static void main(String[] args) {

        Bruch b1 = new Bruch(0, 5);
        Bruch b2 = new Bruch(15, 9);

        System.out.println(b1.hasSameValueAs(b2));  

        b2.shorten();
        System.out.println(b2.zaehler + "/" + b2.nenner); 
    }
}
