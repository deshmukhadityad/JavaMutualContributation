// Remove or correct the package declaration if your file is not in the 'CoreJavaCode/JavaArray' directory.
// For example, if the file is not inside 'CoreJavaCode/JavaArray', simply remove this line.

import java.util.Scanner;

public class Java1_ArrayDeclare {
public static void main(String[] args){

    int arr[] = {1,2,3,4,5};

    for (int i =0; i<=arr.length-1;i++)
    {
        System.out.print(arr[i]+" ");
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 4 words to add in array");
    String [] strarr = new String[4];

    for(int i = 0 ;i<=3 ;i++)
    {
        strarr[i] = sc.nextLine();
    }
    System.out.println("String Array of 4 words");
    for(int i =0;i<=strarr.length-1;i++)
    {
        System.out.println(strarr[i]);

    }

}
}
