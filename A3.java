// this is a program to get introduced by for each method in java
import java.util.*;

public class A3
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

        for(Object o: list2)
        {
            System.out.println(o);
        }

        list2.forEach(n->System.out.println(n));
    }
}