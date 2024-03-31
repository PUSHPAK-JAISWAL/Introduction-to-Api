// this is a program for introduction of Enum and use of Enum in java
enum Week
{
    MON,TUE,WED,TRU,FRI,SAT,SUN;
}

public class A6
{
    enum Result
    {
        PASS,FAIL,NO_RESULt;
    }
    public static void main(String args[])
    {
        Week w=Week.MON;
        System.out.println(w);

        Result r = Result.PASS;
        System.out.println(r);

        int index = Week.MON.ordinal();

        System.out.println(index);

        Week []wr =  Week.values();

        for(Week w1 : wr)
        {
            System.out.println(w1+" : " + w1.ordinal() );
        }
    }
}