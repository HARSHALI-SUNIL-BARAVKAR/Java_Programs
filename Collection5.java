import java.util.*;

class Collection5
{
    public static void main(String Arg[])
    {
        HashTable<String,Integer> hobj = new HashTable<String,Integer>();

    hobj.put("C programming",990);
    hobj.put("C++ programming",1200);
    hobj.put("Java programming",780);
    hobj.put("Python programming",1650);
    
    System.out.println("Book price of java"+hobj.grt("Java programming"));
    hobj.remove("C++ programming");

    Enumeration eobj = hobj.keys();
    while(eobj.hashMoreElements())
    {
        System.out.println(eobj.nextElement());
    }
    }
}

//documentations for collection

//https://docs.oracle.com/javase/tutorial/collections/intro/index.html



// documentation for linkedlist
//https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

// for c# MSDN site   // https://learn.microsoft.com/en-us/dotnet/csharp/

//python.org