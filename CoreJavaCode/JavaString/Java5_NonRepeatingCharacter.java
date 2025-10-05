package CoreJavaCode.JavaString;

public class Java5_NonRepeatingCharacter {

    public static void main(String[] args)
    {
        String st = "racercae";
        char ch[] = st.toCharArray();

        for(int i = 0;i<=ch.length-1;i++)
        {
            boolean flag= false;
            for(int j=0;j<=ch.length-1;j++)
            {
                if(i!=j && ch[i]!= ch[j])
                {
                    // System.out.println(ch[i]);
                    flag = true;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.println(ch[i]);
                break;
            }
        }


    }

}
