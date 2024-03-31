// this is a program to show the use of enum in switch case

enum Result
{
    PASS,FAIL,NR;
}

public class A8
{
    public static void main(String args[])
    {
        Result res = Result.PASS;

        switch(res)
        {
            case PASS : System.out.println("PASS");
                        break;
            case FAIL : System.out.println("FAIL");
                        break;
            case NR : System.out.println("No Result");
                        break;
        }
    }
}