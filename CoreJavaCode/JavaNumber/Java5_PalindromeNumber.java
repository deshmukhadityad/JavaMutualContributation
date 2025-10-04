public class Java5_PalindromeNumber {
// This is palindrome number logic
    public static void main(String[] args)
    {
        int i =1243;
        int temp = i;
        int rev =0;
        while(i!=0)
        {
            int rem = i%10;
            rev = rev*10+rem;
            i=i/10;
        }
        if (temp==rev)
        {
            System.out.print("Given number is palindrome");
        }
        else {
            System.out.print("Number is not a palindrome");
        }
    }

}
