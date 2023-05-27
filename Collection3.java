import java.util.*;

class Collection1
{
    public static void main(String Arg[])
    {
        Vector<Integer> lobj = new Vector<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println("Elements are :"+lobj);

        Iterator iobj = lobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }


    }
}

//https://docs.oracle.com/javase/tutorial/collections/intro/index.html

//https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

// for c# MSDN site   // https://learn.microsoft.com/en-us/dotnet/csharp/