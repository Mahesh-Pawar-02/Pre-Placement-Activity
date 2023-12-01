import java.util.*;

class Collections1
{
    public static void main(String arg[])
    {
        Stack <Character> sobj = new Stack<Character>();

        sobj.push('A');
        sobj.push('B');
        sobj.push('C');
        sobj.push('D');

        System.out.println(sobj.pop());
        System.out.println(sobj.pop());        

    }
}