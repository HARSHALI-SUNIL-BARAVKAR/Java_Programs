import java.util.*;

class Collection1
{
    public static void main(String Arg[])
    {
        Stack<Integer> sobj = new Stack<Integer>();

        sobj.push(11);
        sobj.push(21);
        sobj.push(51);
        sobj.push(101);

        System.out.println("Elements are :"+sobj);
        System.out.println("poped element is:"+sobj.pop());
        System.out.println("Elements are :"+sobj);      

    }
}

//https://docs.oracle.com/javase/tutorial/collections/intro/index.html

//https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

// for c# MSDN site   // https://learn.microsoft.com/en-us/dotnet/csharp/