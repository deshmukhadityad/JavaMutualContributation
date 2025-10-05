 package CoreJavaCode.JavaString;
import java.util.Scanner;

public class Java3_PalindromeString {

public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch[] = str.toCharArray();
    String RevString = "";
    for(int i= ch.length-1;i>=0;i--)
    {
        RevString = RevString+ ch[i];
    }

    if(str.equals(RevString))
    {
        System.out.println("Given String "+str+ " is Palindrome String");
    }
    else
    {
        System.out.println("Given String "+str+ " is not Palindrome String");
    }
}
}
