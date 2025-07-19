import java.util.Scanner;
import test_abc.Abc;

public class Demo extends Abc {

    public Demo() {
        System.out.println("Demo constructor");
    }
    
    public static void main(String[] args) {
        System.out.print("Please Enter a No. - ");
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        System.err.println(scanner.nextInt());
        Abc a = new Demo();
        a.show();
        // Demo d = new  Demo();
        // d.show();
        
    }

    @Override
    public void show(){
        System.out.println("Hello from Demo show Method ");
    }

}
