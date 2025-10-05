package CoreJavaCode.JavaString;

import java.util.Arrays;

// Implement String Compression (Run-Length Encoding)
public class Java6_Compression {

public static void main(String[] args)
{
 String str= "caopppear";

 String res ="";
 char [] ch= str.toCharArray();
 Arrays.sort(ch);

 for(int i=0;i<=ch.length-1;i++)
 {
     int count = 1;
     while(i<ch.length-1 && ch[i]==ch[i+1])
     {
        count++;
        i++;
     }
res = res+ ch[i]+String.valueOf(count);
   
 }
System.out.println(res);
}

}
