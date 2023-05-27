class Overloading
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        int A=10 , B=20, C =30, iRet = 0;
        double X=10.8, Y=90.7, Z=70.9, dRet =0.0;

        iRet= obj.Addition(A,B); //CALL 25
        System.out.println(iRet);
        iRet= obj.Addition(A,B,C); //CALL 29

        dRet = obj.Addition(X,Y);  //CALL 33
        dRet = obj.Addition(X,Y,Z); //CALL 37
    }
}

/*
class Object
{
    code
} 
*/
class Demo    //class Demo extend Object  // internally inherit
{
    public int Addition(int a , int b)
    {
        return a+b;
    }
    public int Addition(int a , int b , int c)
    {
        return a+b+c;
    }
    public double Addition(double a , double b)
    {
        return a+b;
    }
    public double Addition(double a , double b, double c)
    {
        return a+b+c;
    }
 
}