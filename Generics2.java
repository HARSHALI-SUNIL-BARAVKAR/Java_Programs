
class Generics2
{
    public static void main(String Arg[])
    {
        Integer A[]={10,20,30,40};
        Float B[]={50.89f,60.90f,70.88f};
        Double C[]={50.45,60.90,70.56};

        Display(A);
        Display(B);
        Display(C);
    }

    public static <T>void Display(T Arr[])
    {
        for(T no :Arr)    //foreach loop
        {
            System.out.println(no);
        }

        
    }
}