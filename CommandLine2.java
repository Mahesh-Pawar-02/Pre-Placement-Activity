class CommandLine2
{
    public static void main(String arg[])
    {
        int no1 = Integer.parseInt(arg[0]);
        int no2 = Integer.parseInt(arg[1]);

        int ans = no1 + no2;

        System.out.println("Addition is : "+ans);
    }
}

// javac CommandLine.java

// java CommenLine 11   21  51