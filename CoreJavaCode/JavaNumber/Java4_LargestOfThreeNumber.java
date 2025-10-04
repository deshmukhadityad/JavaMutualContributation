public class Java4_LargestOfThreeNumber {

    public static void main(String [] args)
    {
        int num1= 10;
        int num2= 15;
        int num3 = 20;

        if(num1>num2 && num1>num3)
        {
            // if(num1>num3)
            // {
                System.out.println(num1);
                
            // }
           
        }
        else if(num2>num1 && num2>num3){
            // if(num2>num3)
            // {
            
                System.out.println(num2);
                
            // }
        }
        else
        {
            System.out.print(num3);
        }
    }

}
