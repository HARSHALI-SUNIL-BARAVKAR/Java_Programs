class Multi3
{
    public static void main(String Arg[])
    {
        Thread t = Thread.currentThread();
        System.out.println("Name of current thred is "+ t.getName());
        System.out.println("Priority of thread is :" +t.getPriority());
    }
}