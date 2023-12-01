import java.util.*;

class Collections2
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.put("PPA",19500);
        hobj.put("LB",19700);
        hobj.put("Angular",19000);
        hobj.put("Python",20000);

        System.out.println(hobj.get("Python"));

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}