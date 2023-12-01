import java.io.*;

class Buffer
{
    public static void main(String arg[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter first number : ");
            int no1 = Integer.parseInt(br.readLine());

            System.out.println("Enter second number : ");
            int no2 = Integer.parseInt(br.readLine());

            int Ans = no1 + no2;
            System.out.println("Addition is "+Ans);
        }
        catch(Exception obj)
        {}
    }
}
