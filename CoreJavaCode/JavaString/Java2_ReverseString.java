public class Java2_ReverseString {

    public static void main (String[] args)
    {

        //Iteration mode
        String str= "Aditya";
        char[] ch = str.toCharArray();
        String revString = "";

        for(int i=ch.length-1;i>=0; i--)
        {
            revString = revString+ch[i];

        }
        System.out.println("Reverse String is: "+revString);

        //Recurtion method

        String str2 = "deshmukh";
        String revString2 = "";

        StringBuffer sb = new StringBuffer(str2);
        System.out.println("    ");
        System.out.println(sb.reverse());
       
        
    }

}
