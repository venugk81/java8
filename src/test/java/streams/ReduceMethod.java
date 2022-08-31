package streams;

import datasupplier.GetData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

public class ReduceMethod {

    @Test
    public void test(){
        List<Integer> ints = GetData.getIntegerList;
        System.out.println(ints);
        //[3, 2, 5, 6, 7, 2, 1, 49, 99, 22, 53, 65, 26, 87, 67, 78, 89, 15, 16, 42, 37]
        System.out.println("Sum of all int values using sum: " +ints.stream().reduce(0, Integer::sum));
        System.out.println("Sum of all int values using lambda: " +ints.stream().reduce(0, (a,b)-> (a+b)));
        Optional<Integer> optMin =  ints.stream().reduce((o1, o2) -> o1<o2 ? o1:o2);
        System.out.println("Min value: "+ optMin);

        System.out.println("Min Value: "+ ints.stream().reduce(Integer::min));
        System.out.println("--------------min value---------------");
        if(optMin.isPresent()) {
            int val = optMin.get();
            System.out.println(val);
        }
        System.out.println("--------------max value---------------");
        Optional<Integer> max = ints.stream().reduce(Integer::max);
        if(max.isPresent()){
            int maxValue = max.get();
            System.out.println(maxValue);
        }
        System.out.println("product of first 3 int values using lambda: " +ints.stream().limit(3).reduce(1, (a,b)-> (a*b)));

        System.out.println("Count of elements :"+ ints.stream().count());
//        or
        int count = ints.stream().map(d-> 1).reduce(0, (a,b)-> (a+b));
        System.out.println("count using map-reduce pattern: "+ count);

        Optional<Integer> greatThan30 = GetData.getIntegerList.stream().filter(x-> x>6).findAny();
        System.out.println(greatThan30);

    }


}
