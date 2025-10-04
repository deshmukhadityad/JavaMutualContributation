
import java.util.Scanner;

public class Java6_PrimeNumber {
    //This is prime number logic
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = false;
        if(num == 0 || num ==1)
        {
            flag=true;
        }

        for(int i=2; i<=num/2;++i)
        {
            if(num % i ==0)
            {
                flag= true;
                break;
            }
        }
        if(!flag)
        {
            System.out.print("Given Number is a prime number");
        }
        else
        {
            System.out.println("Given Number is not a Prime Number");
        }
       
    }
}
