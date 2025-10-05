package CoreJavaCode.JavaString;

public class Java4_VowelsConsonstant {

    public static void main(String[] str)
    {
        String st = "My name is aditya";
        char ch[] =st.toCharArray();
        int vowelCount = 0;
        int constantcount= 0;
        for(int i=0;i<=ch.length-1;i++)
        {
            if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')
            {
                ++vowelCount;
            }
            else if(ch[i]>='a'&& ch[i]<='z'||ch[i]>='A'&& ch[i]<='Z')
            {
                ++ constantcount;
            }

        }

        System.out.println(vowelCount);
        System.out.println(constantcount);

    }

}
