import java.util.*;
import java.util.function.Predicate; // Correct import for Predicate
import java.util.stream.*;

public class A5 {
    public static void main(String args[]) {
        Predicate<Integer> pre = new Predicate<Integer>() {
            public boolean test(Integer i) {
                return i % 2 == 0; // Simplified if-else
            }
        };

        List<Integer> list = Arrays.asList(4, 9, 8, 5, 2);

        Stream<Integer> streamdata = list.stream();
        Stream<Integer> streamfinal = streamdata.filter(pre).sorted().map(n -> n * 2);

        // Uncommented code to print the count of elements in streamdata
        // System.out.println("Count of elements in streamdata: " + streamdata.count());

        // Stream<Integer> sorteddata = streamfilter.sorted();
        // sorteddata.forEach(i->System.out.println(i));
        // Stream<Integer> mapstream = sorteddata.map(n->n*2);
        streamfinal.forEach(n -> System.out.println(n));
    }
}
