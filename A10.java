// this is a class for coustom annotations

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    String country() default "India" ;
    int age() default 34;
}

@CricketPlayer
class virat
{
    @CricketPlayer
    private int Innings;
    private int runs;

    @CricketPlayer
    public void setInnings(int Innings)
    {
        this.Innings=Innings;
    }
    public void setRuns(int runs)
    {
        this.runs = runs;
    }
    int getInnings()
    {
        return Innings;
    }
    int getRuns()
    {
        return runs;
    }
}

public class A10
{
    public static void main(String args[])
    {
        virat v = new virat();
        v.setInnings(300);
        v.setRuns(2000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);

        CricketPlayer cp = (CricketPlayer)a;

        System.out.println(cp.country());
        System.out.println(cp.age());
    }
}