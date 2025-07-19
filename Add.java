
import java.util.Scanner;

class Add {

    static int add(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			int c = sc.nextInt();
			System.out.println("Enter second number: ");
			int d = sc.nextInt();
			
			// Add p = new Add();
			// int a = p.add(c, d);
			int a = add(c, d);
			System.out.println(a);
		}
    }
}
