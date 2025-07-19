
import java.util.Scanner;

class Pyramid {

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = c; j <= i; j++) {
                System.out.print(j + " ");
                c++;
                i++;
            }
            System.out.println();
        }
    }
}
