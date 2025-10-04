public class Java3_SearchNumber {

    public static void main(String[] args)
    {
        int num =1234;
        int searchNum = 5;
        boolean identifyNum = false;

        while(num!=0)
        {
            int rem = num%10;
            if(rem == searchNum)
            {
                System.out.print("Number identified in number");
                identifyNum = true;
                break;
            }
            num = num/10;
        }
        if(!identifyNum){
            System.out.println("Number is not identified in given number");
        }
    }

}
