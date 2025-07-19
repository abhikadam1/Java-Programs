import java.util.*;
class A
{
    static double  pri(double n)
    {
        double res=0;
        if (n>=0 && n<9)
        {
            return res;
        }

        else if (n>8 && n<10)
        {
            res=81;
            return res;
        }
        
        else if (n>9 && n<36)
        {   
            res = 181;
            return res;
        }

        else if (n>35 && n<82)
        {
            res= 1296;
            return res;
        }
        
        else if (n>81 && n<379)
        {
            res= 6724+1296;
            return res;
        }

        else if (n>378 && n<792)
        {
            res= 143641+6724+1296;
            return res;
        }

        else if (n>791 && n<10000000)
        {
            res= 627264+143641+6724+1296;
            return res;
        }
        // 379=143641,  792=627264,   ; 


        System.out.println(" cahngegw ");
        return res;
    }

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            double b=sc.nextInt();
            System.out.println(pri(b));
            System.out.println(" hello from me ");
        }
    }
}