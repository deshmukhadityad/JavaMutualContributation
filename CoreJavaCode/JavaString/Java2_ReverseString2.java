package CoreJavaCode.JavaString;

public class Java_2ReverseString2 {

    public static void main(String[] args)
    {
        String str1 = "aditya";
        char [] ch = str1.toCharArray();

        int start = 0;
        int end = ch.length-1;

        while(start<=end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            ++start;
            --end;
        }
        System.out.print(ch);

    }
}      
