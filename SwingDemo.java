import javax.swing.*;

class SwingDemo
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");   
    }
}

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}