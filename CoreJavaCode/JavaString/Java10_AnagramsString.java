package CoreJavaCode.JavaString;

public class Java_AnagramsString {

    public static void main(String [] args)
    {
        String str1 = "python";
        String str2 = "typhon";

        char chstr1 [] = str1.toCharArray();
        char chstr2 [] = str2.toCharArray();
        
        if(chstr1.length == chstr2.length){

            for(int i=0;i<=chstr1.length-1; i++)
            {
                boolean flag = false;
                for(int j=0;j<=chstr2.length-1;j++)
                    {
                        if(chstr1[i]==chstr2[j])
                        {
                        flag = true;
                        break;
                        }

                    }
                    if(!flag)
                    {
                        break;
                    }
                    
            }
             System.out.println("given "+str1 + " & "+str2+ " are Anafram strings");
        }
        else 
        {
            System.out.println("given "+str1 + " & "+str2+ " are not Anafram strings");
        }


    }

}   
