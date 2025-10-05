package CoreJavaCode.JavaString;
// Count the Number of Words in a String

import java.util.Arrays;

public class Java7_WordinString {

public static void main(String[] args)
{

    String str= "my name is aditya";
    String []arr = str.split(" ");
    System.out.println("Word count in given string is "+arr.length);
    Arrays.sort(arr);
    for(int i=0;i<=arr.length-1;i++)
    {
        System.out.print(arr[i]+" ");
        // String arrwo = arr[i];
        // char [] ch = arrwo.toCharArray();
        // String tempstr ="";
        // for(int j=0;j<=ch.length-1;j++)
        // {
        //     if(ch[j]<ch[j+1])
        //     {   
        //         char temp = ch[j+1];
        //         ch[j+1]= ch[i];
        //         ch[i]=temp;
        //     }
        //     tempstr = tempstr+ch[j];
        // }
        // System.out.println(tempstr);
        
    }

}

}
