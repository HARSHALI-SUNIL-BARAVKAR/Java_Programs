class IneterfaceDemo
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo();

        float fRet = 0.0f;

        fRet = dobj.CalculatArea(10.5f);
        System.out.println("Area is :"+fRet);

        fRet = dobj.CalculatCircumfarance(10.5f);
        System.out.println("Circumfarance is :"+fRet);
    }
}


interface Circle
{
    public final float PI = 3.14f;
    
    public float CalculatArea(float Radius);
    public float CalculatCircumfarance(float Radius);
}

class Demo implements Circle
{
    public float CalculatArea(float Radius)
    {
        return PI * Radius * Radius;
    }

    public float CalculatCircumfarance(float Radius)
    {
        return 2 * PI * Radius;
    }

}