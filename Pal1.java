
import java.util.Scanner;

class Pal1 {

    static void p(int a) {
        int n = a, rev = 0, rem;

        while (a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }

        if (n == rev) {
            System.out.println("Matched Number yes"); 
        }else {
            System.out.println("No Not matched");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            System.out.println("Enter number to check Palindrome Number or not");
            int b = sc.nextInt();
            Pal1.p(b);
            System.out.println("Press '1' to check another number or '0' to exit");
            a = sc.nextInt();
        }

    }

}
