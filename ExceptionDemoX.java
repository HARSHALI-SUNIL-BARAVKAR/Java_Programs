import java.util.Scanner;

class ExceptionDemoX
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1=0, No2=0;
        float Ans=0.0f;
         
        System.out.println("Enter first number");
        No1 = sobj.nextInt();

        System.out.println("Enter Second number");
        No2 = sobj.nextInt();
        try
        {
            System.out.println("Inside try block");
        Ans=No1/No2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured & code is inside catch block :"+obj);
        }
        finally
        {
            System.out.println("Code is inside finally block..");
            System.out.println("Division is :"+Ans);
        }
        
    }
}










/* yat exception ala interviewla we can show this

import java.util.Scanner;

class ExceptionDemo
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1=0, No2=0;
        float Ans=0.0f;
         
        System.out.println("Enter first number");
        No1 = sobj.nextInt();

        System.out.println("Enter Second number");
        No2 = sobj.nextInt();

        Ans=No1/No2;

        System.out.println("Division is :"+Ans);

    }
} */