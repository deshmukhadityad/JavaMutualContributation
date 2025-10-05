package CoreJavaCode.JavaString;

public class Java9_BubbleSortString {

    public static void main(String[] args)
    {
        String str = "bcagfedh";
        char ch[] = str.toCharArray();
        boolean swap;
        for(int i=0;i<=ch.length-1;i++) 
        {
            swap = false;
            for(int j=0;j<=ch.length-1;j++)
            {
                if(ch[i]<ch[j])
                {
                    char temp = ch[j];
                    ch[j]=ch[i];
                    ch[i]=temp;
                    swap = true;
                }
            }

        }
        for(int i=0;i<=ch.length-1;i++)
		{
			System.out.print(ch[i]);
		}

    }

}
