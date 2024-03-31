// this is a program to show the introdution and use of stream
import java.util.*;
import java.util.stream.*;
public class A4
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(2,4,5,8,9);


        Stream<Integer> streamdata = list.stream();

        streamdata.forEach(i->System.out.println(i));
    }
}