import java.awt.*;

class Gui3
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");   
    }
}

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String title)
    {
        fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}