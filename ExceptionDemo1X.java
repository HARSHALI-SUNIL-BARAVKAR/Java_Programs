import java.util.Scanner;

class ExceptionDemo1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = new int[5];
        
        Arr[0] =11;
        Arr[1] =21;
        Arr[2] =31;
        Arr[3] =41;
        Arr[4] =51;

        int Index =0;
        System.out.println("Enter the Index :");
        Index = sobj.nextInt();
        try
        {  System.out.println("Data at the specified index is :"+Arr[Index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Exception occured & code is inside catch book :"+obj);
        }

        finally
        {
            
        }
    }
}
